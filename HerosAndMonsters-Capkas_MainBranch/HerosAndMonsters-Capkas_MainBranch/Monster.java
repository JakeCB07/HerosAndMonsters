

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */


public abstract class Monster implements DungeonCharacter
{
	private double chanceToHeal;
	private int minHeal, maxHeal;
	protected abstract double getChanceToHeal();
	protected abstract int getHealPoints();
	 protected abstract String readName();  //in case we end up needing it
	 protected abstract int getMinHeal();
	 protected abstract int getMaxHeal();
	 protected abstract void addHitPoints(int healPoints);
//-----------------------------------------------------------------
 public Monster createMonster(Monster theMonster, double chanceToHeal, int minHeal, int maxHeal, int healPoints)
  {
	
	this.chanceToHeal = getChanceToHeal();
	this.minHeal = getMinHeal();
	this.maxHeal = getMaxHeal();
	this.addHitPoints(getHealPoints());
	return theMonster;
	

  }//end monster constructor


  
  
  Monster(Monster theMonster, double chanceToHeal, int minHeal, int maxHeal)
 {
     this.chanceToHeal = getChanceToHeal();
     this.addHitPoints(getHitPoints());
     this.minHeal = getMinHeal();
     this.maxHeal = getMaxHeal();
	
 }



  public void attack(DungeonCharacter opponent)
  {
	opponent.getAttackBehavior().attack(opponent, (DungeonCharacter) this);

  }// end override of attack


//-----------------------------------------------------------------
  public void heal()
  {
	boolean canHeal;
	int healPoints;

	canHeal = (Math.random() <= chanceToHeal) && (getHitPoints() > 0);

	if (canHeal)
	{
		healPoints = (int)(Math.random() * (maxHeal - minHeal + 1)) + minHeal;
		addHitPoints(healPoints);
		System.out.println(getName() + " healed itself for " + getHealPoints() + " points.\n"
							+ "Total hit points remaining are: " + getHealPoints());
		System.out.println();
	}//end can heal


  }//end heal method


//-----------------------------------------------------------------
 public void subtractHitPoints(DungeonCharacter opponent)
 {
		opponent.getAttackBehavior().attack(opponent,  this);
		heal();

 }//end method

 public void setName(String name)
 {
     name = readName();
 }
   

}//end Monster class