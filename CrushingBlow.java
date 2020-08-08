package dungeon;

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

   
	CrushingBlow(String attack, int minDamage, int maxDamage, double chanceToHit) {
		super(attack, minDamage, maxDamage, chanceToHit);
	}


	public String getAttack()
    {
	return attack;
    }

    public static void setAttack(String attack)
    {
	CrushingBlow.attack = attack;
    }

    public double getChanceToHit()
    {
	return chanceToHit;
    }

    public static void setChanceToHit(double chanceToHit)
    {
	CrushingBlow.chanceToHit = chanceToHit;
    }

    public int getMinDamage()
    {
	return minDamage;
    }

    public static void setMinDamage(int minDamage)
    {
	CrushingBlow.minDamage = minDamage;
    }

    public int getMaxDamage()
    {
	return maxDamage;
    }

    public static void setMaxDamage(int maxDamage)
    {
	CrushingBlow.maxDamage = maxDamage;
    }

}
