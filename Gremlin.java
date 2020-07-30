

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Gremlin extends Monster
{

	private static String name = "Gnarltooth the Gremlin";
	private static int hitPoints = 70;
	private static int attackSpeed = 5; 
    private static double chanceToHeal = .4;
    private static AttackBehavior attackBehavior = new Kris();
	private static int minHeal = 20;
	private static int maxHeal = 40;
	
    public Gremlin()
	{
		super(name, hitPoints, attackSpeed, chanceToHeal, attackBehavior, minHeal, maxHeal);

    }//end constructor

    
	public void attack(DungeonCharacter opponent)
	{
		//jabs his kris at
		attackBehavior.attack(opponent, this);

	}//end override of attack
	

}//end class Gremlin