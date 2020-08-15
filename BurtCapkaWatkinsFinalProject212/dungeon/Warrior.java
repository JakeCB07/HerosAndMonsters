package dungeon;

public class Warrior extends Hero {

	private static String name = "Warrior";
	private static int hitPoints = 125;
	private static int attackSpeed = 4;
	private static AttackBehavior attackBehavior = new MightySword();
	private AttackBehavior specialAttack = new CrushingBlow();
	private static double chanceToBlock = .2;

	Warrior() {

		super(name, hitPoints, attackSpeed, attackBehavior, chanceToBlock);

	}// end constructor

	private void crushingBlow(DungeonCharacter opponent) {
		specialAttack.attack(opponent, this);
	}// end crushingBlow method

	private void attack(DungeonCharacter opponent) {
		attackBehavior.attack(opponent, this);
	}// end override of attack method

	public void battleChoices(DungeonCharacter opponent) {
		int choice;

		super.battleChoices(opponent);

		do {
			do {
			System.out.println("1. Attack Opponent");
			System.out.println("2. Crushing Blow");
			System.out.print("Choose an option: ");
			choice = getKeyBoard().next().charAt(0);

				if(choice == '1')
					attack(opponent);
				else if(choice == '2')
					crushingBlow(opponent);
				else {
					System.out.println("invalid choice!\n");
					choice = ' ';
				}
				
			}while(choice == ' ');

			killTurn();
			if (getTurns() > 0)
				System.out.println("Number of turns remaining is: " + getTurns());

		} while (getTurns() > 0 && this.getHitPoints() > 0 && opponent.getHitPoints() > 0);

	}
}
