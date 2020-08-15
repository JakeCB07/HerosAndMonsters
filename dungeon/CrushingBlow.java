package dungeon;

public class CrushingBlow extends Attack{
	private static String attack = "goes for a Crushing Blow against";
	private static int minDamage = 100;
	private static int maxDamage = 175;
	private static double chanceToHit = 0.4;
    
	CrushingBlow() {
		super(attack, minDamage, maxDamage, chanceToHit);
	}

	
}