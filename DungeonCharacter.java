
public abstract class DungeonCharacter {

	protected String name;
	protected int hitPoints;
	private int attackSpeed;
	protected AttackBehavior attackBehavior;

	DungeonCharacter(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior) {

		this.name = name;
		this.hitPoints = hitPoints;
		this.attackSpeed = attackSpeed;
		this.attackBehavior = attackBehavior;

	}// end constructor

	protected String getName() {
		return name;
	}// end getName

	protected int getAttackSpeed() {
		return attackSpeed;
	}// end getAttackSpeed

	protected boolean isAlive() {
		return (hitPoints > 0);
	}// end isAlive method

}// end class Character