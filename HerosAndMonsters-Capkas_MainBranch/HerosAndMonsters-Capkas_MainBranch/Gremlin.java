

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

class Gremlin implements DungeonCharacterInterface.Monster
{
    
    	private static String name = "Gnarltooth the Gremlin";
	private static int hitPoints = 70;
	private static int attackSpeed = 5; 
	private static double chanceToHeal = .4;
	private static AttackBehavior attackBehavior = new Kris();
	private static int minHeal = 20;
	private static int maxHeal = 40;
    
    
    public Gremlin(Monster theMonster, double chanceToHeal, int minHeal, int maxHeal)
    {
	chanceToHeal = getChanceToHeal();
	minHeal = getMinHeal();
	maxHeal = getMaxHeal();

    }

    
    public boolean isAlive()
    {
	if (getHitPoints() > 0)
	    return true;

	return false;

    }

    public static String getName()
    {
	return name;
    }

    public static int getHitPoints()
    {
	return hitPoints;
    }

    //TODO
    public static void setHitPoints(int hitPoints)
    {
	Gremlin.hitPoints = hitPoints;
    }

    public static int getAttackSpeed()
    {
	return attackSpeed;
    }

       public double getChanceToHeal()
    {
	return chanceToHeal;
    }

    public static AttackBehavior getAttackBehavior()
    {
	return attackBehavior;
    }

    public static int getMinHeal()
    {
	return minHeal;
    }

    public static int getMaxHeal()
    {
	return maxHeal;
    }


    @Override
    public void attack(DungeonCharacterInterface opponent, DungeonCharacterInterface attacker)
    {
	attackBehavior.attack(opponent, (DungeonCharacterInterface) this);
	
    }


    

}//end class Gremlin