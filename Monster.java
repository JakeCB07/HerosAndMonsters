

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */


public abstract class Monster extends DungeonCharacter
{
	protected double chanceToHeal;
	protected int minHeal, maxHeal;
	protected HealBehavior healBehavior;

//-----------------------------------------------------------------
  public Monster(String name, int hitPoints, int attackSpeed,
				     double chanceToHeal, AttackBehavior attackBehavior,
					 int minHeal, int maxHeal)
  {
	super(name, hitPoints, attackSpeed, attackBehavior);
	this.chanceToHeal = chanceToHeal;
	this.maxHeal = maxHeal;
	this.minHeal = minHeal;
	this.healBehavior = new Heal();

  }//end monster construcotr

  
//-----------------------------------------------------------------
  public void heal()
  {
	boolean canHeal;
	
	canHeal = (Math.random() <= chanceToHeal) && (hitPoints > 0);

	if (canHeal)
		healBehavior.heal(this, minHeal, maxHeal);
  }//end heal method

//-----------------------------------------------------------------
 public void subtractHitPoints(DungeonCharacter opponent)
 {
	 	opponent.attackBehavior.attack(opponent, this);
		heal();

 }//end method


}//end Monster class