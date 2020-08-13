
public class blueBerryBreath extends Attack{

	private static String attack = "Uses his fierce blueberryBreath against ";
	private static double chanceToHit = .3;
	private static int minDamage = 25;
	private static int maxDamage = 55;
    
	blueBerryBreath() {
		super(attack, minDamage, maxDamage, chanceToHit);
	}
}