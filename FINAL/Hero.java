
import java.util.Scanner;

public class Hero extends DungeonCharacter {

	private int numTurns;
	private static Location point;
	protected double chanceToBlock;

	protected Scanner playerInput = new Scanner(System.in);

	protected int pillarCount;
	protected int healingPotCount;
	protected int visionPotCount;

	public Hero(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior, double chanceToBlock) {
		super(name, hitPoints, attackSpeed, attackBehavior);
		readName();
	}

	private void readName() {
		System.out.print("Enter character name: ");
		String newName = playerInput.nextLine();
		this.setName(newName);
	}

	private boolean defend() {
		return Math.random() <= chanceToBlock;
	}

	protected void gotHit(DungeonCharacter opponent) {
		if (defend()) {
			System.out.println(this.getName() + " BLOCKED the attack!");
		} else {
			opponent.getAttackBehavior().attack(opponent, this);
		}
	}

	public void battleChoices(DungeonCharacter opponent) {
		numTurns = getAttackSpeed() / opponent.getAttackSpeed();

		if (getTurns() <= 0)
			addTurn();

		System.out.println("Number of turns this round is: " + getTurns());

	}

	protected String printInventory(Hero character) {
		String retStr = this.getName() + "\nHit Points: " + this.getHitPoints() + "\n-------------------------\n"
				+ "1. Pillars: " + this.pillarCount + "\n" + "2. Healing Potions: " + this.healingPotCount + "\n"
				+ "3. Vision Potions: " + this.visionPotCount + "\n";

		return retStr;
	}

	protected void useItem(Hero character) {
		System.out.println("Enter a number to select an item to use or press anything else to go back");
		char choice = playerInput.next().charAt(0);

		if (choice == '1')
			System.out.println(4 - pillarCount + " remaing pillars left to collect");
		if (choice == '2' && character.healingPotCount > 0)
			HealingPotion.use(character);
		if (choice == '3' && character.visionPotCount > 0)
			VisionPotion.use(character);
	}

	public void setPoint(int x, int y) {
		point = new Location(x, y);
	}

	public static Location getPoint() {
		return point;
	}

	protected void killTurn() {
		this.numTurns--;
	}

	protected void addTurn() {
		this.numTurns++;
	}

	protected int getTurns() {
		return this.numTurns;
	}

	protected void addHealingPot(Hero hero) {
		hero.healingPotCount++;
	}

	protected void addVisionPot(Hero hero) {
		hero.visionPotCount++;
	}

	protected void addPillar(Hero hero) {
		hero.pillarCount++;
	}

	protected void removeHealingPot(Hero hero) {
		hero.healingPotCount--;
	}

	protected void removeVisionPot(Hero hero) {
		hero.visionPotCount--;
	}

	protected void removePillar(Hero hero) {
		hero.pillarCount--;
	}

	protected int getPillarCount() {
		return this.pillarCount;
	}

}