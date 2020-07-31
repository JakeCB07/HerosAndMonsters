
/**
 * Title: Description: Copyright: Copyright (c) 2001 Company:
 * 
 * @author
 * @version 1.0
 */

class Ogre implements DungeonCharacterInterface.Monster
{
    private static String name = "Oscar the Ogre";
    private static int hitPoints = 200;
    private static int attackSpeed = 2;
    private static double chanceToHeal = .1;
    private static AttackBehavior attackBehavior = new WoodenClub();
    private static int minHeal = 30;
    private static int maxHeal = 50;

    // super("Oscar the Ogre", 200, 2, .6, .1, 30, 50, 30, 50);

    public Ogre(Monster theMonster, double chanceToHeal, int minHeal, int maxHeal)
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
	Ogre.hitPoints = hitPoints;
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

}// end Monster class