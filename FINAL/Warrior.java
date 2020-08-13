<<<<<<< HEAD

public class Warrior extends Hero {
	
	  public Warrior()
		{

		  
		  
			super("Warrior", 125, 4, .8, 35, 60, 1, .2, new MightySword());


	    }
	  
	  

		public void crushingBlow(DungeonCharacter opponent)
		{
			if (Math.random() <= .4)
			{
				int blowPoints = (int)(Math.random() * 76) + 100;
				System.out.println(this.getName() + " lands a CRUSHING BLOW for " + blowPoints
									+ " damage!");
				opponent.subtractHitPoints(blowPoints);
			}
			else
			{
				System.out.println(getName() + " failed to land a crushing blow");
				System.out.println();
			}

		}





	    public void battleChoices(DungeonCharacter opponent)
		{
			int choice;

			super.battleChoices(opponent);

			do
			{
			    System.out.println("1. Attack Opponent");
			    System.out.println("2. Crushing Blow on Opponent");
			    System.out.print("Choose an option: ");
			    choice = getKeyBoard().nextInt();

			    switch (choice)
			    {
				    case 1: getAttackBehavior().attack(opponent, this );
				        break;
				    case 2: crushingBlow(opponent);
				        break;
				    default:
				        System.out.println("invalid choice!");
			    }

				killTurn();
				if (getNumTurns() > 0)
				    System.out.println("Number of turns remaining is: " + getNumTurns());

			} while(getNumTurns() > 0);

	    }
}
=======

public class Warrior extends Hero {
	
	  public Warrior()
		{

		  
		  
			super("Warrior", 125, 4, .8, 35, 60, 1, .2, new MightySword());


	    }
	  
	  

		public void crushingBlow(DungeonCharacter opponent)
		{
			if (Math.random() <= .4)
			{
				int blowPoints = (int)(Math.random() * 76) + 100;
				System.out.println(this.getName() + " lands a CRUSHING BLOW for " + blowPoints
									+ " damage!");
				opponent.subtractHitPoints(blowPoints);
			}
			else
			{
				System.out.println(getName() + " failed to land a crushing blow");
				System.out.println();
			}

		}





	    public void battleChoices(DungeonCharacter opponent)
		{
			int choice;

			super.battleChoices(opponent);

			do
			{
			    System.out.println("1. Attack Opponent");
			    System.out.println("2. Crushing Blow on Opponent");
			    System.out.print("Choose an option: ");
			    choice = getKeyBoard().nextInt();

			    switch (choice)
			    {
				    case 1: getAttackBehavior().attack(opponent, this );
				        break;
				    case 2: crushingBlow(opponent);
				        break;
				    default:
				        System.out.println("invalid choice!");
			    }

				killTurn();
				if (getNumTurns() > 0)
				    System.out.println("Number of turns remaining is: " + getNumTurns());

			} while(getNumTurns() > 0);

	    }
}
>>>>>>> b10c09556709c7e5eb86065fd895458b5cd7fa91
