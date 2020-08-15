package dungeon;

public class Shortbow extends Attack{
	
	private static String attack = "fires thier Shortbow at";
	private static double chanceToHit = .8;
    private static int minDamage = 20;
    private static int maxDamage = 40; 
	
    Shortbow() {
		super(attack, minDamage, maxDamage, chanceToHit);
	}
}