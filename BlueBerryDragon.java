
public class BlueBerryDragon extends Monster {

	private static String name = "Bubbles the Blueberry Dragon ";
	private static int hitPoints = 300;
	private static int attackSpeed = 2;
	private static double chanceToHeal = .2;
	private static AttackBehavior attackBehavior = new BlueBerryBreath();
	private static int minHeal = 20;
	private static int maxHeal = 55;
	
	BlueBerryDragon() {
		super(name, hitPoints, attackSpeed, chanceToHeal, attackBehavior, minHeal, maxHeal);
		makeFace();
	}// end constructor

	public void attack(DungeonCharacter opponent) {
		attackBehavior.attack(opponent, this);
	}// end override of attack
    private void makeFace() {
    	System.out.println(" ^"+"\n> <"+ "\n S"+"\n S"+"\n S"+"\n S"+"\n O");
    }
}
