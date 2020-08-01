import java.util.Scanner;

public class GameManager {
	
	private static Scanner kb = new Scanner(System.in);
	
	public Hero chooseHero()
	{
		int choice;
		Hero selectedHero;

		do {
			System.out.println("Choose a hero:\n" +
					"1. Warrior\n" +
					"2. Sorceress\n" +
					"3. Thief");
			choice = kb.nextInt();

			selectedHero = HeroFactory.createHero(choice);
			if(choice < 1 || choice > 3)
				System.out.println("Invalid selection, please choice the number 1, 2 or 3.");
		}while(choice < 1 || choice > 3);
		
		return selectedHero;
	}

	public Monster generateMonster()
	{
		int choice = 0;
		Monster selectedMonster;
		do {
			choice = (int)(Math.random() * 3) + 1;
			
			selectedMonster = MonsterFactory.createMonster(choice);
		}while(choice < 1 || choice > 3);
		
		return selectedMonster;
	}

	public boolean playAgain()
	{
		char again;

		System.out.println("Play again (y/n)?");
		again = kb.next().charAt(0);
		again = Character.toUpperCase(again);

		return (again == 'Y');
	}

	public void battle(Hero theHero, Monster theMonster)
	{
		char pause = 'p';
		System.out.println(theHero.getName() + " battles " +
							theMonster.getName());
		System.out.println("---------------------------------------------");

		//do battle
		while (theHero.isAlive() && theMonster.isAlive() && pause != 'q')
		{
		    //hero goes first
			theHero.battleChoices(theMonster);

			//monster's turn (provided it's still alive!)
			if (theMonster.isAlive())
			    theMonster.attackBehavior.attack(theHero, theMonster);

			//let the player bail out if desired
			System.out.print("\n-->q to quit, anything else to continue: ");
			pause = kb.next().charAt(0);
			pause = Character.toLowerCase(pause);

		}//end battle loop

		if (!theMonster.isAlive())
		    System.out.println(theHero.getName() + " was victorious!");
		else if (!theHero.isAlive())
			System.out.println(theHero.getName() + " was defeated :-(");
		else//both are alive so user quit the game
			System.out.println("Quitters never win ;-)");

	}
}
