

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

class Skeleton implements DungeonCharacter.Monster
{
    private static String name = "Sargath the Skeleton";
	private static int hitPoints = 100;
	private static int attackSpeed = 3;
private static double chanceToHeal = .3;
private static AttackBehavior attackBehavior = new RustyBlade();
	private static int minHeal = 30;
	private static int maxHeal = 50;
	
	public Skeleton(Monster theMonster, double chanceToHeal, int minHeal, int maxHeal)
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

	    public static void setHitPoints(int hitPoints)
	    {
		Skeleton.hitPoints = hitPoints;
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
	    public void attack(DungeonCharacter opponent, DungeonCharacter attacker)
	    {
		attackBehavior.attack(opponent, (DungeonCharacter) this);
		
	    }


}//end class Skeleton