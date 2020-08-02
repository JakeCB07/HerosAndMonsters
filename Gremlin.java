
public class Gremlin extends Monster {

	private static String name = "Gnarltooth the Gremlin";
	private static int hitPoints = 70;
	private static int attackSpeed = 5;
	private static double chanceToHeal = .4;
	private static AttackBehavior attackBehavior = new Kris();
	private static int minHeal = 20;
	private static int maxHeal = 40;

	Gremlin() {
		super(name, hitPoints, attackSpeed, chanceToHeal, attackBehavior, minHeal, maxHeal);

	}

	protected void attack(DungeonCharacter opponent) {
		attackBehavior.attack(opponent, this);
	}

}// end class Gremlin