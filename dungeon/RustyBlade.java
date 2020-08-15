package dungeon;

public class RustyBlade extends Attack{
	
	private static String attack = "slices their Rusty Blade at";
	private static double chanceToHit = .8;
    private static int minDamage = 30;
    private static int maxDamage = 50;
    
	RustyBlade() {
		super(attack, minDamage, maxDamage, chanceToHit);
	}
}