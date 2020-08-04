
public class CrushingBlow extends Attack
{

    private static String attack = "goes for a Crushing Blow against";
    private static double chanceToHit = .4;
    private static int minDamage = 100;
    private static int maxDamage = 175;

    CrushingBlow()
    {
	super(attack, minDamage, maxDamage, chanceToHit);
	
    }

    public static String getAttack()
    {
	return attack;
    }

    public static void setAttack(String attack)
    {
	CrushingBlow.attack = attack;
    }

    public static double getChanceToHit()
    {
	return chanceToHit;
    }

    public static void setChanceToHit(double chanceToHit)
    {
	CrushingBlow.chanceToHit = chanceToHit;
    }

    public static int getMinDamage()
    {
	return minDamage;
    }

    public static void setMinDamage(int minDamage)
    {
	CrushingBlow.minDamage = minDamage;
    }

    public static int getMaxDamage()
    {
	return maxDamage;
    }

    public static void setMaxDamage(int maxDamage)
    {
	CrushingBlow.maxDamage = maxDamage;
    }

}
