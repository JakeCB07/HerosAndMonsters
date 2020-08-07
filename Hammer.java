
public class Hammer extends Attack {

    private static String attack = "swings thier War Hammer at";
    private static double chanceToHit = .6;
    private static int minDamage = 40;
    private static int maxDamage = 65;

    Hammer()
    {
	super(attack, minDamage, maxDamage, chanceToHit);
    }
    
}
