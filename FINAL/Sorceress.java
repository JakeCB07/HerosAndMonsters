<<<<<<< HEAD

public class Sorceress extends Hero {
	public final int MIN_ADD = 25;
	public final int MAX_ADD = 50;


    public Sorceress()
	{
		super("Sorceress", 75, 5, .7, 25, 50, 1, .3, new Firebolt());


    }
	public void increaseHitPoints()
    {
	    int hPoints;

		hPoints = (int)(Math.random() * (MAX_ADD - MIN_ADD + 1)) + MIN_ADD;
		addHitPoints(hPoints);
		System.out.println(getName() + " added [" + hPoints + "] points.\n"
							+ "Total hit points remaining are: "
							+ getHitPoints());
		 System.out.println();

    }
    public void battleChoices(DungeonCharacter opponent)
	{
		super.battleChoices(opponent);
		int choice;

		do
		{
		    System.out.println("1. Attack Opponent");
		    System.out.println("2. Increase Hit Points");
		    System.out.print("Choose an option: ");
		    choice = getKeyBoard().nextInt();

		    switch (choice)
		    {
			    case 1: getAttackBehavior().attack(opponent, this);
			        break;
			    case 2: increaseHitPoints();
			        break;
			    default:
			        System.out.println("invalid choice!");
		    }

			killTurn();
		    if (getNumTurns() > 0)
			    System.out.println("Number of turns remaining is: " + getNumTurns());

		} while(getNumTurns() > 0 && getHitPoints() > 0 && opponent.getHitPoints() > 0);

    }
}
=======

public class Sorceress extends Hero {
	public final int MIN_ADD = 25;
	public final int MAX_ADD = 50;


    public Sorceress()
	{
		super("Sorceress", 75, 5, .7, 25, 50, 1, .3, new Firebolt());


    }
	public void increaseHitPoints()
    {
	    int hPoints;

		hPoints = (int)(Math.random() * (MAX_ADD - MIN_ADD + 1)) + MIN_ADD;
		addHitPoints(hPoints);
		System.out.println(getName() + " added [" + hPoints + "] points.\n"
							+ "Total hit points remaining are: "
							+ getHitPoints());
		 System.out.println();

    }
    public void battleChoices(DungeonCharacter opponent)
	{
		super.battleChoices(opponent);
		int choice;

		do
		{
		    System.out.println("1. Attack Opponent");
		    System.out.println("2. Increase Hit Points");
		    System.out.print("Choose an option: ");
		    choice = getKeyBoard().nextInt();

		    switch (choice)
		    {
			    case 1: getAttackBehavior().attack(opponent, this);
			        break;
			    case 2: increaseHitPoints();
			        break;
			    default:
			        System.out.println("invalid choice!");
		    }

			killTurn();
		    if (getNumTurns() > 0)
			    System.out.println("Number of turns remaining is: " + getNumTurns());

		} while(getNumTurns() > 0 && getHitPoints() > 0 && opponent.getHitPoints() > 0);

    }
}
>>>>>>> b10c09556709c7e5eb86065fd895458b5cd7fa91