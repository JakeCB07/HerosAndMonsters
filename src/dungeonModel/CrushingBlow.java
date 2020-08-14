package dungeonModel;

import dungeonController.Attack;

public class CrushingBlow extends Attack{
	private static String attack = "goes for a Crushing Blow against";
	private static double chanceToHit = .4;
    private static int minDamage = 100;
    private static int maxDamage = 175;
    
	CrushingBlow() {
		super(attack, minDamage, maxDamage, chanceToHit);
	}
	
}