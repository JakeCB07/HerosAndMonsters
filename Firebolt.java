
public class Firebolt extends Attack {
	private static String attack = "shoots a firebolt at";
	private static double chanceToHit = .7;
    private static int minDamage = 30;
    private static int maxDamage = 55; 
	Firebolt() {
		super(attack, minDamage, maxDamage, chanceToHit);
	}
}
