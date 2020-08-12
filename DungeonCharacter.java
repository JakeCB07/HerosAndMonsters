package Dungeon;
public abstract class DungeonCharacter implements iDungeonCharacter
{

   
    protected String name;
    protected int hitPoints;
    protected int attackSpeed;
    protected AttackBehavior attack;
  

    DungeonCharacter(String name, int hitPoints, int attackSpeed, AttackBehavior attack)
    {

	this.name = getName();
	this.hitPoints = getHitPoints();
	this.attackSpeed = getAttackSpeed();
	this.attack = getAttackBehavior();

    }// end constructor

    public AttackBehavior getAttackBehavior()
    {
	return attack;
    }

    public int addHitPoints(int hitPoints)
    {

	this.hitPoints = getHitPoints() + addHitPoints(hitPoints);
	System.out.println(getName() + " HP is now at " + getHitPoints() + "points");

	return this.getHitPoints();
    }

    public void subtractHitPoints(int hitPoints)
    {
	if (getHitPoints() < 0)
	    System.out.println("Error, must have positive number of hit points");
	else if (getHitPoints() > 0)
	{
	    this.hitPoints -= hitPoints;

	    if (this.getHitPoints() < 0)
		this.hitPoints = 0;

	    System.out.println(getName() + " attacked and did " + hitPoints + " points of damage");
	    System.out.println(getName() + " now has " + this.getHitPoints() + " hit points remaining. \n");

	} // end else if

    }

    public int getAttackSpeed()
    {
	return attackSpeed;
    }

    public boolean isAlive()
    {
	int hitPoints = getHitPoints();
	return hitPoints > 0;

    }

    public void attack(DungeonCharacter opponent, DungeonCharacter attacker)
    {
	getAttackBehavior().attack(opponent, this);
    }

    public String getName()
    {
	return name;
    }

    public int getHitPoints()
    {

	return hitPoints;
    }

    public void setHitPoints(int hitPoints)
    {
	this.hitPoints = hitPoints;
	
    }

    abstract AttackBehavior getAttackBehavior(DungeonCharacter opponent, DungeonCharacter attacker);

    protected abstract void battleChoices(DungeonCharacter theMonster);
  
   

}// end class Character