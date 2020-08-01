

/**
 * Title: DungeonCharacter.java
 *
 * Description: Abstract Base class for inheritance hierarchy for a
 *              role playing game
 *
 *  class variables (all will be directly accessible from derived classes):
 *    name (name of character)
 *    hitPoints (points of damage a character can take before killed)
 *    attackSpeed (how fast the character can attack)
 *    chanceToHit (chance an attack will strike the opponent)
 *    damageMin, damageMax (range of damage the character can inflict on
 *     opponent)
 *
 *  class methods (all are directly accessible by derived classes):
 *    DungeonCharacter(String name, int hitPoints, int attackSpeed,
				     double chanceToHit, int damageMin, int damageMax)
	  public String getName()
	  public int getHitPoints()
	  public int getAttackSpeed()
	  public void addHitPoints(int hitPoints)
	  public void subtractHitPoints(int hitPoints) -- this method will be
	    overridden
	  public boolean isAlive()
	  public void attack(DungeonCharacter opponent) -- this method will be
	    overridden
 *
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public abstract class DungeonCharacter
{

	protected String name;
	protected int hitPoints;
	protected int attackSpeed;
	protected AttackBehavior attackBehavior;

//-----------------------------------------------------------------
//explicit constructor to initialize instance variables -- it is called
// by derived classes
	public DungeonCharacter(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior)
	{

		this.name = name;
		this.hitPoints = hitPoints;
		this.attackSpeed = attackSpeed;
		this.attackBehavior = attackBehavior;

	}//end constructor

//-----------------------------------------------------------------
	public String getName()
	{
		return name;
	}//end getName

//-----------------------------------------------------------------
	public int getHitPoints()
	{
		return hitPoints;
	}//end getHitPoints
//-----------------------------------------------------------------
	public int getAttackSpeed()
	{
		return attackSpeed;
	}//end getAttackSpeed

    public boolean isAlive()
	{
	  return (hitPoints > 0);
	}//end isAlive method
    
    
}//end class Character