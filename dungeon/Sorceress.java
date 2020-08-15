package dungeon;

public class Sorceress extends Hero {
	private int minHeal = 25;
	private int maxHeal = 50;

	private static String name = "Sorceress";
	private static int hitPoints = 75;
	private static int attackSpeed = 5;
	private static AttackBehavior attackBehavior = new Firebolt();
	private HealBehavior healSelf = new Heal();
	private static double chanceToBlock = .3;

//-----------------------------------------------------------------
	Sorceress() {
		super(name, hitPoints, attackSpeed, attackBehavior, chanceToBlock);
	}

	private void increaseHitPoints() {
		healSelf.heal(this, minHeal, maxHeal);
	}

	private void attack(DungeonCharacter opponent) {
		attackBehavior.attack(opponent, this);
	}

	public void battleChoices(DungeonCharacter opponent) {
		super.battleChoices(opponent);
		int choice;

		do {
			System.out.println("1. Attack Opponent");
			System.out.println("2. Increase Hit Points");
			System.out.print("Choose an option: ");
			choice = getKeyBoard().nextInt();

			switch (choice) {
			case 1:
				attack(opponent);
				break;
			case 2:
				increaseHitPoints();
				break;
			default:
				System.out.println("invalid choice!");
			}

			killTurn();
			if (getTurns() > 0)
				System.out.println("Number of turns remaining is: " + getTurns());

		} while (getTurns() > 0 && getHitPoints() > 0 && opponent.getHitPoints() > 0);

	}
}
