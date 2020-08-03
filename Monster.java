
public abstract class Monster extends DungeonCharacter implements iDungeonCharacter.iMonster {
    
	protected double chanceToHeal;
	protected int minHeal, maxHeal;
	protected HealBehavior healBehavior;

//-----------------------------------------------------------------
	Monster(String name, int hitPoints, int attackSpeed, double chanceToHeal, AttackBehavior attackBehavior,
			int minHeal, int maxHeal) {
		super(name, hitPoints, attackSpeed, attackBehavior);
		this.chanceToHeal = chanceToHeal;
		this.maxHeal = maxHeal;
		this.minHeal = minHeal;
		this.healBehavior = new Heal();

	}// end monster construcotr

//-----------------------------------------------------------------
	protected void heal() {
		boolean canHeal;

		canHeal = (Math.random() <= chanceToHeal) && (hitPoints > 0);

		if (canHeal)
			healBehavior.heal(this, minHeal, maxHeal);
	}// end heal method

//-----------------------------------------------------------------
	protected void subtractHitPoints(DungeonCharacter opponent) {
		opponent.getAttackBehavior().attack(opponent, this);
		heal();

	}// end method

}// end Monster class