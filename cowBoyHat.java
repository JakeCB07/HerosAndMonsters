
public class cowBoyHat extends Attack{

	private static String attack = "rants about how everythings bigger in Texas to ";
	private static double chanceToHit = .3;
	private static int minDamage = 5;
	private static int maxDamage = 50;
    
	cowBoyHat() {
		super(attack, minDamage, maxDamage, chanceToHit);
	}
}