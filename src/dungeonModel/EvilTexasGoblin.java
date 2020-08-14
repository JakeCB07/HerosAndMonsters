package dungeonModel;

import dungeonController.AttackBehavior;

public class EvilTexasGoblin extends Monster {
	
	private static String name = "Boby texas goblin";
	private static int hitPoints = 150;
	private static int attackSpeed = 2;
	private static double chanceToHeal = .2;
	private static AttackBehavior attackBehavior = new CowBoyHat();
	private static int minHeal = 15;
	private static int maxHeal = 25;
	
	EvilTexasGoblin() {
		super(name, hitPoints, attackSpeed, chanceToHeal, attackBehavior, minHeal, maxHeal);
		makeFace();
	}// end constructor

	public void attack(DungeonCharacter opponent) {
		attackBehavior.attack(opponent, this);
	}// end override of attack
    private void makeFace() {
    	System.out.println("Q   Q "+"\n  >  "+ "\n UUUUUU");
    }
}
