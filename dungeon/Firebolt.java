package dungeon;

public class Firebolt extends Attack {
	private static String attack = "shoots a firebolt at";
	private static double chanceToHit = .7;
    private static int minDamage = 25;
    private static int maxDamage = 50; 
	Firebolt() {
		super(attack, minDamage, maxDamage, chanceToHit);
	}
}
