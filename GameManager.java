package dungeon;
import java.util.Scanner;

public class GameManager {
private static Scanner kb = new Scanner(System.in);
	

    static Hero theHero;
    static Monster theMonster;

	static Hero chooseHero()
	{
		int choice;
		

	
			System.out.println("Choose a hero:\n" +
					"1. Warrior\n" +
					"2. Sorceress\n" +
					"3. Thief\n" + 
					"4. Paladin");
			choice = kb.nextInt();
			
			switch (choice)
			{
			
			case 1: return theHero = HeroFactory.createWarrior();
			
			case 2: return theHero = HeroFactory.createSorceress();
			
			case 3: return theHero = HeroFactory.createThief();
			
			case 4: return theHero = HeroFactory.createPaladin();
			
				default: System.out.println("invalid choice, Error, returning Thief");
					return HeroFactory.createThief();
		
			}
	}

	static Monster generateMonster()
	{
		int choice;
	
	
		choice = (int)(Math.random() * 3) + 1;
			
		  switch(choice)
		        {
		            case 1: return MonsterFactory.createOgre();

		            case 2: return MonsterFactory.createGremlin();

		            case 3: return MonsterFactory.createSkeleton();
	
		            default: System.out.println("Error: invalid choice");
		            	return MonsterFactory.createSkeleton();
		        
			}
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


		
		while (theHero.isAlive() && theMonster.isAlive() && pause != 'q'){

			theHero.battleChoices(theMonster);
              

			if (theMonster.isAlive())
			    theMonster.getAttackBehavior().attack(theHero, theMonster);

		

		}

		if (!theMonster.isAlive())
		    System.out.println(theHero.getName() + " was victorious!");
		else if (!theHero.isAlive())
			System.out.println(theHero.getName() + " was defeated :-(");
		else
			System.out.println("Quitters never win ;-)");

	}
}
