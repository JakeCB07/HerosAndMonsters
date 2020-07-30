

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Thief extends Hero
{
	
	private static String name = "Thief";
	private static int hitPoints = 75;
	private static int attackSpeed = 6;
    private static AttackBehavior attackBehavior = new Shortbow();
    private static double chanceToBlock = .5;

    public Thief()
	{
		super(name, hitPoints, attackSpeed, attackBehavior, chanceToBlock);



    }//end constructor

	public void surpriseAttack(DungeonCharacter opponent)
	{
		double surprise = Math.random();
		if (surprise <= .4)
		{
			System.out.println("Surprise attack was successful!\n" +
								name + " gets an additional turn.");
			numTurns++;
			attack(opponent);
		}//end surprise
		else if (surprise >= .9)
		{
			System.out.println("Uh oh! " + opponent.getName() + " saw you and" +
								" blocked your attack!");
		}
		else
		    attack(opponent);


	}//end surpriseAttack method


    public void battleChoices(DungeonCharacter opponent)
	{
		super.battleChoices(opponent);
		int choice;


		do
		{
		    System.out.println("1. Attack Opponent");
		    System.out.println("2. Surprise Attack");
		    System.out.print("Choose an option: ");
		    choice = Keyboard.readInt();

		    switch (choice)
		    {
			    case 1: attack(opponent);
			        break;
			    case 2: surpriseAttack(opponent);
			        break;
			    default:
			        System.out.println("invalid choice!");
		    }//end switch

			numTurns--;
			if (numTurns > 0)
			    System.out.println("Number of turns remaining is: " + numTurns);

		} while(numTurns > 0);

    }
    
	public void attack(DungeonCharacter opponent)
	{
		attackBehavior.attack(opponent, this);
	}//end override of attack method
}