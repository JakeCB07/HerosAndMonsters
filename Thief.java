
public class Thief extends Hero {

	private static String name = "Thief";
	private static int hitPoints = 75;
	private static int attackSpeed = 6;
	private static AttackBehavior attackBehavior = new Shortbow();
	private static double chanceToBlock = .5;

	Thief() {
		super(name, hitPoints, attackSpeed, attackBehavior, chanceToBlock);
	}

	private void surpriseAttack(DungeonCharacter opponent) {
		double surprise = Math.random();
		
		if (surprise <= .4) {
			System.out.println("Surprise attack was successful!\n" + getName() + " gets an additional turn.");
			addTurn();
			attack(opponent);
		} 
		else if (surprise >= .9) {
			System.out.println("Uh oh! " + opponent.getName() + " saw you and" + " blocked your attack!");
		} else
			attack(opponent);
		
	}

	public void battleChoices(DungeonCharacter opponent) {
		super.battleChoices(opponent);
		int choice;

		do {
			System.out.println("1. Attack Opponent");
			System.out.println("2. Surprise Attack");
			System.out.print("Choose an option: ");
			choice = playerInput.nextInt();

			switch (choice) {
			case 1:
				attack(opponent);
				break;
			case 2:
				surpriseAttack(opponent);
				break;
			default:
				System.out.println("invalid choice!");
			}

			killTurn();
			if (getTurns() > 0)
				System.out.println("Number of turns remaining is: " + getTurns());

		} while (getTurns() > 0 && hitPoints > 0 && opponent.hitPoints > 0);

	}

	private void attack(DungeonCharacter opponent) {
		attackBehavior.attack(opponent, this);
	}
}