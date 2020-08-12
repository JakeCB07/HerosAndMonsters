package Dungeon;
import java.util.Scanner;

public class Paladin implements iDungeonCharacter, HeroInterface, HealBehavior{

	 private static String name = "Paladin";
	    private static int hitPoints = 140;
	    private static int attackSpeed = 4;
	    private static AttackBehavior attackBehavior = new Hammer();
	    private static AttackBehavior specialAttack = new DivineSmite();
	    private static double chanceToBlock = .2;
	    private static double chanceToHit;
	    
	    private static final  int maxHitPoints = 75;
	 	 public static final int minHeal = 25;
	  	public static final int maxHeal = 50;

	    Paladin createPaladin(String name, double chanceToBlock, AttackBehavior specialAttack)
	    {

		name = getName();
		chanceToBlock = getChanceToBlock();
		specialAttack = getSpecialAttack();

		return new Paladin();
	    }// end constructor

	    protected Paladin()
	    {
		
		name = getName();
		hitPoints = getHitPoints();
		attackSpeed = getAttackSpeed();
		attackBehavior = getAttackBehavior();
		chanceToBlock = getChanceToBlock();
		specialAttack = getSpecialAttack();
	    }

	    public void getSpecialAttack(DungeonCharacter opponent, DungeonCharacter attacker)
	    {
		specialAttack = new DivineSmite();

		attack(attacker, opponent); //TODO right order?
	    }
	    
	    private void divineSmite(DungeonCharacter opponent, DungeonCharacter attacker) 
	    {
	    	getSpecialAttack().attack(opponent, attacker);
	    }

	    public String getName()
	    {
		return name;
	    }

	    public AttackBehavior getAttackBehavior()
	    {

		return attackBehavior;
	    }

	    public AttackBehavior getSpecialAttack()
	    {
		return specialAttack;
	    }

	    public double getChanceToBlock()
	    {
		return chanceToBlock;
	    }

	    public int getHitPoints()
	    {
		return hitPoints;
	    }

	    public int getAttackSpeed()
	    {
		return attackSpeed;

	    }

	    public double getChanceToHit()
	    {
		return chanceToHit;
	    }

	    public void battleChoices(DungeonCharacter opponent, DungeonCharacter attacker)
	    {
		
		Scanner playerInput = new Scanner(System.in);
		battleChoices(opponent, attacker);
		int choice;

		do
		{
		    System.out.println("1. Attack Opponent");
		    System.out.println("2. Special attacK: Crushing Blow");
		    System.out.print("Choose an option: ");
		    choice = playerInput.nextInt();

		    switch (choice)
		    {
		    case 1:
			getAttackBehavior().attack(opponent, attacker);
			break;
		    case 2:
			divineSmite(opponent, attacker);
			break;
		    default:
			System.out.println("invalid choice!");
		    }

		    Hero.killTurn(); // decrements the number of turns the character has available
		    if (Hero.getTurns() > 0)
			System.out.println("Number of turns remaining is: " + Hero.getTurns());

		} while (Hero.getTurns() > 0 && getHitPoints() > 0 && opponent.getHitPoints() > 0);

	    }

	   
	    public int subtractHitPoints(DungeonCharacter opponent, DungeonCharacter attacker)
	    {
		int current = opponent.getHitPoints();
		 attacker.getAttackBehavior().attack(opponent, attacker);
		 
		 return current = getHitPoints();
			 
	    }

	    public boolean isAlive()
	    {
		if (getHitPoints() > 0)
		    return false;

		else
		    return true;

	    }

	    @Override
	    public void heal(DungeonCharacter character, int minHeal, int maxHeal, int maxHitPoints)
	    {
		if(getHitPoints() > maxHitPoints)
		    setHitPoints(maxHitPoints);
		
		increaseHitPoints();
		
	    }
	    
	    public void setHitPoints(int hitPoints)
	    {
		Paladin.hitPoints = hitPoints;
	    }
	    
	    public void increaseHitPoints()
	    {
		    int healPoints;
		
			healPoints = (int)(Math.random() * (maxHeal - minHeal + 1)) + minHeal;
			hitPoints = getHitPoints() + healPoints;
			System.out.println(getName() + " added [" + healPoints + "] points.\n"
								+ "Total hit points remaining are: "
								+ this.getHitPoints());
			 System.out.println();

	    }
	    
	    @Override
	    public AttackBehavior attack(DungeonCharacter opponent, DungeonCharacter attacker)
	    {
		
		return attack(opponent, attacker);
	    }

	    public static int getMaxhitpoints()
	    {
		return maxHitPoints;
	    }
	  
}
