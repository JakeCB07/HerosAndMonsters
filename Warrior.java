

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */




public class Warrior extends Hero
{
	
	private static String name = "Warrior";
	private static int hitPoints = 125;
	private static int attackSpeed = 4;
    private static AttackBehavior attackBehavior = new MightySword();
    private AttackBehavior specialAttack = new CrushingBlow();
    private static double chanceToBlock = .2;
	
    public Warrior()
	{

		super(name, hitPoints, attackSpeed, attackBehavior, chanceToBlock);


    }//end constructor


	public void crushingBlow(DungeonCharacter opponent)
	{
		specialAttack.attack(opponent, this);
	}//end crushingBlow method

	public void attack(DungeonCharacter opponent)
	{
		attackBehavior.attack(opponent, this);
	}//end override of attack method




    public void battleChoices(DungeonCharacter opponent)
	{
		int choice;

		super.battleChoices(opponent);

		do
		{
		    System.out.println("1. Attack Opponent");
		    System.out.println("2. Crushing Blow on Opponent");
		    System.out.print("Choose an option: ");
		    choice = Keyboard.readInt();

		    switch (choice)
		    {
			    case 1: attack(opponent);
			        break;
			    case 2: crushingBlow(opponent);
			        break;
			    default:
			        System.out.println("invalid choice!");
		    }//end switch

			numTurns--;
			if (numTurns > 0)
			    System.out.println("Number of turns remaining is: " + numTurns);

		} while(numTurns > 0);

    }//end battleChoices method

}//end Hero class