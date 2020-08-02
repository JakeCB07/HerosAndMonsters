
public class Ogre extends Monster {

	private static String name = "Oscar the Ogre";
	private static int hitPoints = 200;
	private static int attackSpeed = 2;
	private static double chanceToHeal = .1;
	private static AttackBehavior attackBehavior = new WoodenClub();
	private static int minHeal = 30;
	private static int maxHeal = 50;

	Ogre() {
		super(name, hitPoints, attackSpeed, chanceToHeal, attackBehavior, minHeal, maxHeal);

	}// end constructor

	protected void attack(DungeonCharacter opponent) {
		attackBehavior.attack(opponent, this);
	}// end override of attack

}// end Monster class