
public class BlueBerryBreath extends Attack {
	
	private static String attack = " uses his fierce Blueberry-Breath against ";
	private static double chanceToHit = .3;
	private static int minDamage = 25;
	private static int maxDamage = 55;
    
	BlueBerryBreath() {
		super(attack, minDamage, maxDamage, chanceToHit);
	}
}
