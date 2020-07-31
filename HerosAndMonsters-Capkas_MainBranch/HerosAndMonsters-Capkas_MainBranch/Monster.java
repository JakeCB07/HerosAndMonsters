

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */


public abstract class Monster implements DungeonCharacterInterface
{	public String getName()
{
    // TODO Auto-generated method stub
    return null;
}
	private double chanceToHeal;
	private int minHeal, maxHeal;
	protected abstract double getChanceToHeal();
	protected abstract int getHealPoints();
	 protected abstract String readName();  //in case we end up needing it
	 protected abstract int getMinHeal();
	 protected abstract int getMaxHeal();
	 protected abstract void addHitPoints(int healPoints);
//-----------------------------------------------------------------

  
  
  Monster(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior, double chanceToHeal, int minHeal, int maxHeal, int healPoints)
 {
     name = getName();
     hitPoints= getHitPoints();
     
     this.chanceToHeal = getChanceToHeal();
     this.addHitPoints(getHealPoints());
     this.minHeal = getMinHeal();
     this.maxHeal = getMaxHeal();
	
 }




//-----------------------------------------------------------------
  public void heal()
  {
	boolean canHeal;
	int healPoints;

	canHeal = (Math.random() <= chanceToHeal) && (getHealPoints() > 0);

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
 public void subtractHitPoints(DungeonCharacterInterface opponent)
 {
		opponent.getAttackBehavior().attack(opponent,  this);
		heal();

 }//end method

 public void setName(String name)
 {
     name = readName();
 }
   

}//end Monster class