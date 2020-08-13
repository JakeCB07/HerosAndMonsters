import java.util.Scanner;

public abstract class DungeonCharacter    {

	private String name;
	private int hitPoints;
	private int attackSpeed;
	private double chanceToHit;
	private int damageMin, damageMax;
	private double chanceToBlock;
	private int numTurns;
	private AttackBehavior attack;
	private static Scanner Keyboard=new Scanner(System.in);
	public DungeonCharacter(String name, int hitPoints, int attackSpeed, double chanceToHit, int damageMin, int damageMax, double chanceToBlock, int numTurns, AttackBehavior attack)
{

setName(name);
setHitPoints(hitPoints);
setAttackSpeed(attackSpeed);
setChanceToHit(chanceToHit);
setDamageMin(damageMin);
setDamageMax(damageMax);
setChanceToBlock(chanceToHit);
setTurns(numTurns);
setAttackBehavior(attack);
}
	public static Scanner getKeyBoard() {
		return Keyboard;
	}
	public void setAttackBehavior(AttackBehavior attack) {
		this.attack=attack;
	}
	public AttackBehavior getAttackBehavior() {
		return this.attack;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

    public void setHitPoints(int hitPoints) {
    	
    	
    	this.hitPoints=hitPoints;
    }
	public int getHitPoints()
	{
		return hitPoints;
	}
    public void setAttackSpeed(int attackSpeed) {
    	this.attackSpeed=attackSpeed;
    }
	public int getAttackSpeed()
	{
		return attackSpeed;
	}
	public void setDamageMin(int damageMin) {
		this.damageMin=damageMin;
	}
	public int getDamageMin() {
		return this.damageMin;
	}
	public void setDamageMax(int damageMax) {
		this.damageMax=damageMax;
	}
	public int getDamageMax() {
		return this.damageMax;
	}
	public void setChanceToHit(double chanceToHit) {
		this.chanceToHit=chanceToHit;
	}
	public double getChanceToHit() {
		return this.chanceToHit;
	}
	public void setChanceToBlock(double chanceToBlock) {
		this.chanceToBlock=chanceToBlock;
	}
	public double getChanceToBlock() {
		return this.chanceToBlock;
	}
	public void killTurn() {
		this.numTurns--;
	}
	public void addTurns() {
		this.numTurns++;
	}
	public void setTurns(int numTurns) {
		this.numTurns=numTurns;
	}
	public int getNumTurns() {
	
		return numTurns;
	}
	public void addHitPoints(int hitPoints)
	{
		if (hitPoints <0)
			System.out.println("Hitpoint amount must be positive.");
		else
		{
			this.hitPoints += hitPoints;
	

		}
	}

	public void subtractHitPoints(int hitPoints)
	{
		if (hitPoints <0)
			System.out.println("Hitpoint amount must be positive.");
		else if (hitPoints >0)
		{
			this.hitPoints -= hitPoints;
			if (this.hitPoints < 0)
				this.hitPoints = 0;
			System.out.println(getName() + " hit " +
								" for <" + hitPoints + "> points damage.");
			System.out.println(getName() + " now has " +
								getHitPoints() + " hit points remaining.");
			System.out.println();
		}

		if (this.hitPoints == 0)
			System.out.println(name + " has been killed :-(");


	}
	  public boolean defend()
	  {
			return Math.random() <= chanceToBlock;

	  }
	  
	public boolean isAlive()
	{
	  return (hitPoints > 0);
	}
	public void setAttack(AttackBehavior attack){
		this.attack=attack;
	}
	public AttackBehavior getAttack() {
		return this.attack;
	}
	public void attack(DungeonCharacter opponent)
	{
		
		boolean canAttack;
		int damage;

		canAttack = Math.random() <= chanceToHit;

		if (canAttack)
		{
			damage = (int)(Math.random() * (damageMax - damageMin + 1))
						+ damageMin ;
			opponent.subtractHitPoints(damage);



			System.out.println();
		}
		else
		{

			System.out.println(getName() + "'s attack on " + opponent.getName() +
								" failed!");
			System.out.println();
		}

	}
}
