
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
				case 1: return DungeonFactory.makeWarrior();

				case 2: return DungeonFactory.makeSorceress();

				case 3: return DungeonFactory.makeThief();

				default: System.out.println("invalid choice, returning Thief");
					     return new Thief();
			}
		}
		public static Monster generateMonster()
		{
			int choice;

			choice = (int)(Math.random() * 3) + 1;

			switch(choice)
			{
				case 1: return DungeonFactory.makeOgre();

				case 2: return DungeonFactory.makeGremlin();

				case 3: return  DungeonFactory.makeSkeleton();

				default: System.out.println("invalid choice, returning Skeleton");
					     return DungeonFactory.makeSkeleton();
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