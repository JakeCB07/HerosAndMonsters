
public class Kris extends Attack
{

    private static String attack = "jabs thier Kris at";
    private static double chanceToHit = .8;
    private static int minDamage = 15;
    private static int maxDamage = 30;

    Kris()
    {
	super(attack, minDamage, maxDamage, chanceToHit);
    }
}