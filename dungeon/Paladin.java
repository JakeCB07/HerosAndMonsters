package dungeon;

public class Paladin extends Hero {
	private static String name = "Paladin";
	private static int hitPoints = 140;
	private static int attackSpeed = 4;
	private static AttackBehavior attackBehavior = AttackFactory.HammerFactory();
	private static AttackBehavior specialAttack = new DivineSmite();
	private static double chanceToBlock = .2;
	

	Paladin() {
		super(name, hitPoints, attackSpeed, attackBehavior, chanceToBlock);
	}
	
	private void attack(DungeonCharacter opponent) {
		attackBehavior.attack(opponent, this);
	}
	
	private void divineSmite(DungeonCharacter opponent) {
		specialAttack.attack(opponent, this);
	}

	public void battleChoices(DungeonCharacter opponent) {
		super.battleChoices(opponent);
		int choice;

		do {
			do {
			System.out.println("1. Attack Opponent");
			System.out.println("2. Divine Smite");
			System.out.print("Choose an option: ");
			choice = getKeyBoard().next().charAt(0);

				if(choice == '1')
					attack(opponent);
				else if(choice == '2')
					divineSmite(opponent);
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
