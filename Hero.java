package Dungeon;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Hero implements HeroInterface, iDungeonCharacter
{

    protected Scanner playerInput = new Scanner(System.in);
    protected double chanceToBlock;
    protected static int numTurns;
    private Location point;

    protected int pillarCount;
    protected int healingPotCount;
    protected int visionPotCount;

    Hero(String name, int hitPoints, int attackSpeed, AttackBehavior attack, double chanceToBlock)
    {

	name = getName();
	hitPoints = getHitPoints();
	attackSpeed = getAttackSpeed();
	attack = getAttackBehavior();
	this.chanceToBlock = getChanceToBlock();
	setName(name);
	this.pillarCount = 0;
	this.healingPotCount = 0;
	this.visionPotCount = 0;
    }

    public void setPoint(int x, int y)
    {
	point = new Location(x, y);
    }

    public Location getPoint()
    {
	return this.point;
    }

    public void setName(String name)
    {
	name = readName(name);
    }

    public String readName(String name)
    {
	System.out.println("Enter character name: ");
	return name = playerInput.nextLine();
    }

    private boolean defend()
    {
	return Math.random() <= getChanceToBlock();
    }

    protected void gotHit(DungeonCharacter opponent, DungeonCharacter attacker)
    {
	if (defend())
	{
	    System.out.println(getName() + " BLOCKED the attack!");
	} else
	{
	    opponent.attack(opponent, attacker); // TODO
	}
    }

    protected void battleChoices(DungeonCharacter opponent)
    {
	numTurns = getAttackSpeed() / opponent.getAttackSpeed();

	if (numTurns == 0)
	    numTurns++;

	System.out.println("Number of turns this round is: " + numTurns);
    }

    public static void killTurn()
    {
	numTurns--;
    }

    public static void addTurn()
    {
	numTurns++;
    }

    public static int getTurns()
    {
	return numTurns;
    }

    public void subtractHitPoints(int damageReceived)
    {
	if (defend())
	{
	    System.out.println(getName() + " BLOCKED the attack!");
	} else
	{
	    subtractHitPoints(damageReceived);
	}

    }// end method

    protected double getChancetoBlock()
    {

	return chanceToBlock;
    }

    public String toString()
    {
	return "Name: " + getName() + "\n Hit Points: " + getHitPoints();

    }

    protected String printInventory(Hero character)
    {
	String retStr = "1. Pillars: " + this.pillarCount + "\n" + "2. Healing Potions: " + this.healingPotCount + "\n"
		+ "3. Vision Potions: " + this.visionPotCount + "\n";

	return retStr;
    }

    protected void useItem(Hero character, int playerInput)
    {
	if (playerInput == 1 && character.healingPotCount > 0)
	    Pillar.use(character);
	if (playerInput == 2 && character.healingPotCount > 0)
	    HealingPotion.use(character);
	if (playerInput == 3 && character.visionPotCount > 0)
	    VisionPotion.use(character);

    }

    public abstract void battleChoices();

    public void updateHero()
    {
	// TODO Auto-generated method stub

    }

    public boolean isAlive()
    {
	if (getHitPoints() > 0)
	    return false;

	else
	    return true;

    }

}// end Hero class