package dungeonModel;
import dungeonController.AttackBehavior;
import dungeonModel.Hero;

public class FrostMage extends Hero {
	private static String name = "Frost Mage";
	private static int hitPoints = 70;
	private static int attackSpeed = 5;
	private static AttackBehavior attackBehavior = new FreezingTouch();
	private AttackBehavior specialAttack;
	private static double chanceToBlock = .1;

	private int freezeCount = 0;
	
	FrostMage() {

		super(name, hitPoints, attackSpeed, attackBehavior, chanceToBlock);

	}// end constructor

	private void shatter(DungeonCharacter opponent) {
		specialAttack = new Shatter(freezeCount);
		specialAttack.attack(opponent, this);
		this.freezeCount = 0;
	}// end crushingBlow method

	private void attack(DungeonCharacter opponent) {
		attackBehavior.attack(opponent, this);
		this.freezeCount++;
	}// end override of attack method

	public void battleChoices(DungeonCharacter opponent) {
		int choice;

		super.battleChoices(opponent);

		do {
			do {
			System.out.println("1. Attack Opponent");
			System.out.println("2. Shatter Opponent");
			System.out.print("Choose an option: ");
			choice = getKeyBoard().next().charAt(0);

				if(choice == '1')
					attack(opponent);
				else if(choice == '2')
					shatter(opponent);
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
