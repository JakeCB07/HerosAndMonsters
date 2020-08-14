package dungeonModel;

import dungeonController.AttackBehavior;
import dungeonController.HealBehavior;

public class Monster extends DungeonCharacter {
	
	private double chanceToHeal;
	private int minHeal, maxHeal;
	private HealBehavior healBehavior;

	public Monster(String name, int hitPoints, int attackSpeed, double chanceToHeal, 
			AttackBehavior attackBehavior, int minHeal, int maxHeal) {
		
		super(name, hitPoints, attackSpeed, attackBehavior);
		setMinHeal(minHeal);
		setMaxHeal(maxHeal);
		setHealBehavior();
	}

	public void heal() {
		boolean canHeal;

		canHeal = (Math.random() <= chanceToHeal) && (this.getHitPoints() > 0);

		if (canHeal)
			healBehavior.heal(this, minHeal, maxHeal);
	}

	public void subtractHitPoints(DungeonCharacter opponent) {
		opponent.getAttackBehavior().attack(opponent, this);
		heal();
	}

	private void setMinHeal(int minHeal) {
		this.minHeal = minHeal;
	}

	private void setMaxHeal(int maxHeal) {
		this.maxHeal = maxHeal;
	}

	private void setHealBehavior() {
		this.healBehavior = new Heal();
	}

}
