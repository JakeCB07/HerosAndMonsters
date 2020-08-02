import java.util.Scanner;

public abstract class Hero extends DungeonCharacter {
	
	protected static Scanner playerInput = new Scanner(System.in);
	protected double chanceToBlock;
	private int numTurns;

	Hero(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior, double chanceToBlock) {
		super(name, hitPoints, attackSpeed, attackBehavior);
		this.chanceToBlock = chanceToBlock;
		readName();
	}

	private void readName() {
		System.out.print("Enter character name: ");
		name = playerInput.nextLine();
	}

	private boolean defend() {
		return Math.random() <= chanceToBlock;
	}

	protected void gotHit(DungeonCharacter opponent) {
		if (defend()) {
			System.out.println(name + " BLOCKED the attack!");
		} else {
			opponent.attackBehavior.attack(opponent, this);
		}
	}

	protected void battleChoices(DungeonCharacter opponent) {
		numTurns = getAttackSpeed() / opponent.getAttackSpeed();

		if (numTurns == 0)
			numTurns++;

		System.out.println("Number of turns this round is: " + numTurns);
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

}// end Hero class