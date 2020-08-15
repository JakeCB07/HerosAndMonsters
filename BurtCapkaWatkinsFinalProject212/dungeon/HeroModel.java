package dungeon;

import java.util.Scanner;

public class HeroModel
{
    private int numTurns;
    static Location point;

    protected Scanner playerInput;

    protected int pillarCount;
    protected int healingPotCount;
    protected int visionPotCount;

    private String name;
    private int hitPoints;
    private int maxHitPoints;
    private int attackSpeed;
    private AttackBehavior attackBehavior;
    private double chanceToBlock;

    public String getName()
    {
	return this.name;
    }

    public String setName(String name)
    {
	return this.name = name;

    }

    public int getHitPoints()
    {
	return this.hitPoints;
    }

    public int getAttackSpeed()
    {
	return this.attackSpeed;
    }

    AttackBehavior getAttackBehavior()
    {
	return this.attackBehavior;
    }

    public boolean isAlive()
    {
	return this.isAlive();
    }

    void setHitPoints(int hitPoints)
    {
	this.hitPoints = hitPoints;
    }

    void subtractHitPoints(int hitPoints)
    {
	this.hitPoints = hitPoints;
    }

    public double getChanceToBlock()
    {
	return chanceToBlock;
    }

    public void setChanceToBlock(double chanceToblock)
    {
	this.chanceToBlock = chanceToblock;
    }

    public int getNumTurns()
    {
	return numTurns;
    }

    public void setNumTurns(int numTurns)
    {
	this.numTurns = numTurns;
    }

    public boolean getIsAlive()
    {

	return this.isAlive();
    }

    public int getMaxHitPoints()
    {
	return this.maxHitPoints;
    }

    protected void subtractHitPoints(DungeonCharacter opponent, int damageRecieved)
    {
	if (opponent.getHitPoints() < 0)
	    System.out.println("Hitpoint amount must be positive.");
	else if (opponent.getHitPoints() > 0)
	{
	    int newTotal = opponent.getHitPoints() - damageRecieved;
	    opponent.setHitPoints(newTotal);
	    // -= damageRecieved;
	    if (opponent.getHitPoints() < 0)
		opponent.setHitPoints(0);
	    System.out.println(opponent.getName() + " hit " + " for <" + damageRecieved + "> points damage.");
	    System.out.println(opponent.getName() + " now has " + opponent.getHitPoints() + " hit points remaining.");
	    System.out.println();
	} // end else if

	if (opponent.getHitPoints() == 0)
	    System.out.println(opponent.getName() + " has been killed :-(");

    }

    public String printInventory(Hero character)
    {
	String retStr = this.getName() + "\nHit Points: " + this.getHitPoints() + "/" + this.getMaxHitPoints()
		+ "\n-------------------------\n" + "1. Pillars: " + this.pillarCount + "\n" + "2. Healing Potions: "
		+ this.healingPotCount + "\n" + "3. Vision Potions: " + this.visionPotCount + "\n";

	return retStr;
    }

}
