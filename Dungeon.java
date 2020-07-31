
public class Dungeon {
	 public static void main(String[] args)
		{
		 Hero theHero;
			Monster theMonster;

			do
			{
			    theHero = chooseHero();
			    theMonster = generateMonster();
				battle(theHero, theMonster);

			} while (playAgain());
			
	    }public static Hero chooseHero()
		{
			int choice;
			

			System.out.println("Choose a hero:\n" +
						       "1. Warrior\n" +
							   "2. Sorceress\n" +
							   "3. Thief");
			choice = DungeonCharacter.getKeyBoard().nextInt();

			switch(choice)
			{
				case 1: return new Warrior("warrior dude ", new RustyBlade());

				case 2: return new Sorceress("Sorceress dude", new Firebolt());

				case 3: return new Thief("thief dude ", new Shortbow());

				default: System.out.println("invalid choice, returning Thief");
					     return new Thief("thief dude ", new Shortbow());
			}//end switch
		}//end chooseHero method

	/*-------------------------------------------------------------------
	generateMonster randomly selects a Monster and returns it.  It utilizes
	a polymorphic reference (Monster) to accomplish this task.
	---------------------------------------------------------------------*/
		public static Monster generateMonster()
		{
			int choice;

			choice = (int)(Math.random() * 3) + 1;

			switch(choice)
			{
				case 1: return new Ogre("Ogre dude", new WoodenClub());

				case 2: return new Gremlin("Gremlin dude ", new Kris());

				case 3: return new Skeleton("Skeleton dude", new RustyBlade());

				default: System.out.println("invalid choice, returning Skeleton");
					     return new Skeleton("Another skeleton dude ", new RustyBlade());
			}
		}
		public static boolean playAgain()
		{
			char again;

			System.out.println("Play again (y/n)?");
			again = DungeonCharacter.getKeyBoard().next().charAt(0);

			return (again == 'Y' || again == 'y');
		}


		public static void battle(Hero theHero, Monster theMonster)
		{
			char pause = 'p';
			System.out.println(theHero.getName() + " battles " +
								theMonster.getName());
			System.out.println("---------------------------------------------");


			while (theHero.isAlive() && theMonster.isAlive() && pause != 'q')
			{

				theHero.battleChoices(theMonster);


				if (theMonster.isAlive())
					 theMonster.getAttackBehavior().attack(theHero, theMonster);


				System.out.print("\n-->q to quit, anything else to continue: ");
				pause = DungeonCharacter.getKeyBoard().next().charAt(0);

			}

			if (!theMonster.isAlive())
			    System.out.println(theHero.getName() + " was victorious!");
			else if (!theHero.isAlive())
				System.out.println(theHero.getName() + " was defeated :-(");
			else
				System.out.println("Quitters never win ;-)");

		}


	}