package dungeon;

public class WoodenClub extends Attack {
	
	private static String attack = "slowly swings a Club at";
	private static double chanceToHit = .6;
    private static int minDamage = 30;
    private static int maxDamage = 50; 
	
    WoodenClub() {
		super(attack, minDamage, maxDamage, chanceToHit);
	}
}