package dungeonModel;

import dungeonController.Attack;


public class Shatter extends Attack  {

	private static String attack = "begins freezing";
	private static double chanceToHit = .8;
    private static int minDamage = 20;
    private static int maxDamage = 30;
    
	Shatter(int freezeCount) {
		super(attack, freezeCount * minDamage, freezeCount * maxDamage, chanceToHit);
	}
}
