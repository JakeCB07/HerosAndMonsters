package dungeonModel;

import dungeonController.Attack;

public class FreezingTouch extends Attack {
	
	private static String attack = "begins freezing";
	private static double chanceToHit = .8;
    private static int minDamage = 20;
    private static int maxDamage = 30;
    
	FreezingTouch() {
		super(attack, minDamage, maxDamage, chanceToHit);
	}
}
