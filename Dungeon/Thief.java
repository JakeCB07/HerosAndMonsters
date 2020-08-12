package Dungeon;
import java.util.Scanner;

public class Thief implements HeroInterface, iDungeonCharacter, HealBehavior
{

    private static String name = "Thief";
    private static int hitPoints = 75;
    private static int attackSpeed = 6;
    private static AttackBehavior attackBehavior = new Shortbow();
    private static AttackBehavior specialAttack = new SurpriseAttack();
    private static double chanceToBlock = .5;

    private AttackBehavior getSpecialAttack()
    {
	return specialAttack;
    }

    protected Thief()
    {
	name = getName();
	hitPoints = getHitPoints();
	attackSpeed = getAttackSpeed();
	attackBehavior = getAttackBehavior();
	chanceToBlock = getChanceToBlock();
	specialAttack = getSpecialAttack();
    }

    Thief createThief(String name, double chanceToBlock, AttackBehavior specialAttack)
    {
	name = getName();
	chanceToBlock = getChanceToBlock();
	specialAttack = getSpecialAttack();

	return new Thief();
    }// end constructor

    Thief(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior, AttackBehavior specialAttack,
	    double chanceToBlock)
    {

	name = getName();
	hitPoints = getHitPoints();
	attackSpeed = getAttackSpeed();
	specialAttack = getSpecialAttack();
	chanceToBlock = getChanceToBlock();

    }

    public void surpriseAttack(DungeonCharacter opponent, DungeonCharacter attacker)
    {
	double surprise = Math.random();
	if (surprise <= .4)
	{
	    System.out.println("Surprise attack was successful!\n" + this.getName() + " gets an additional turn.");
	    Hero.addTurn();
	    attack(opponent, attacker); // TODO correct order?
	} else if (surprise >= .9)
	{
	    System.out.println("Uh oh! " + opponent.getName() + " saw you and" + " blocked your attack!");
	} else
	    attack(opponent, attacker);

    }

    public void battleChoices(DungeonCharacter opponent, DungeonCharacter attacker)
    {
	Scanner playerInput = new Scanner(System.in);

	battleChoices(opponent, attacker);
	int choice;

	do
	{
	    System.out.println("1. Attack Opponent");
	    System.out.println("2. Surprise Attack");
	    System.out.print("Choose an option: ");
	    choice = playerInput.nextInt();

	    switch (choice)
	    {
	    case 1:
		getAttackBehavior().attack(opponent, attacker);
		break;
	    case 2:
		surpriseAttack(opponent, attacker);
		break;
	    default:
		System.out.println("invalid choice!");
	    }// end switch

	    Hero.killTurn();
	    if (Hero.getTurns() > 0)
		System.out.println("Number of turns remaining is: " + Hero.getTurns());

	} while (Hero.getTurns() > 0);

    }

    public double getChanceToBlock()
    {
	return chanceToBlock;
    }

    public AttackBehavior getAttackBehavior()
    {
	return attackBehavior;
    }

    public static void setAttackBehavior(AttackBehavior attackBehavior)
    {
	Thief.attackBehavior = attackBehavior;
    }

    public int getAttackSpeed()
    {
	return attackSpeed;
    }

    public static void setAttackSpeed(int attackSpeed)
    {
	Thief.attackSpeed = attackSpeed;
    }

    public int getHitPoints()
    {
	return Thief.hitPoints;
    }

    public String getName()
    {
	return Thief.name;
    }

    @Override
    public AttackBehavior attack(DungeonCharacter opponent, DungeonCharacter attacker)
    {

	return Thief.attackBehavior;
    }

  
    public int subtractHitPoints(int damageReceived)
    {
	setHitPoints(damageReceived);
	
	return hitPoints;

    }

    public boolean isAlive()
    {
	if (getHitPoints() > 0)
	    return false;

	else
	    return true;

    }
    
    private void setHitPoints(int damageReceived)
    {
	
	hitPoints = hitPoints - damageReceived;
    }

    @Override
    public void heal(DungeonCharacter character, int minHeal, int maxHeal, int maxHitPoints)
    {
	character.addHitPoints(hitPoints);
	
	if(getHitPoints() > maxHitPoints)
	    setHitPoints(maxHitPoints);
	
    }

}
