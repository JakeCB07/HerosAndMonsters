
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
			do {
			System.out.println("1. Attack Opponent");
			System.out.println("2. Heal Thyself");
			System.out.print("Choose an option: ");
			choice = getKeyBoard().next().charAt(0);

				if(choice == '1')
					attack(opponent);
				else if(choice == '2')
					increaseHitPoints();
				else {
					System.out.println("invalid choice!\n");
					choice = ' ';
				}
				
			}while(choice == ' ');

			killTurn();
			if (getTurns() > 0)
				System.out.println("Number of turns remaining is: " + getTurns());

		} while (getTurns() > 0 && getHitPoints() > 0 && opponent.getHitPoints() > 0);

	}
}
