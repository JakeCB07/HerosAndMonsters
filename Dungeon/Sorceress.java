package Dungeon;
import java.util.Scanner;

public class Sorceress implements HealBehavior, HeroInterface, iDungeonCharacter
{
   

 	private String name = "Sorceress";
 	private static final  int maxHitPoints = 75;
 	 public static final int minHeal = 25;
  	public static final int maxHeal = 50;
 	private static int hitPoints = 75;
 	private static int attackSpeed = 5;
 	private static AttackBehavior attackBehavior = new Firebolt();
 	private static HealBehavior healSelf =  new Heal();
 	private static AttackBehavior specialAttack = (AttackBehavior) healSelf;
 	//TODO write an adapter method for HealBehavior to AttackBehavior
 	
 	private static double chanceToBlock = .3;
	 
	    
    protected Sorceress()
	{
		
	name = getName();
	hitPoints = getHitPoints();
	attackSpeed = getAttackSpeed();
	attackBehavior = getAttackBehavior();
	chanceToBlock = getChanceToBlock();
	specialAttack = getSpecialAttack();
		
	}
    	
    
    Sorceress createSorceress(String name, double chanceToBlock, int heal)
	{
	name= getName();
       	chanceToBlock = getChanceToBlock();
       	heal = addHitPoints(heal);  //TODO verify that this works as intended
		
       		return new Sorceress();
 	 }//end constructor
   
    
    	private int addHitPoints(int healPoints)
    	{
		return getHitPoints() + healPoints;
  	}
    	
	public Sorceress(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior) 
    	{
    	  
        	    name = getName(); 
        	   hitPoints = getHitPoints(); 
        	   attackBehavior = getAttackBehavior();
        	   healSelf = getHeal();
        	   attackSpeed = getAttackSpeed(); 
        	
        	    
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
    public void battleChoices(DungeonCharacter opponent, DungeonCharacter attacker)
	{
		
		Scanner playerInput = new Scanner(System.in);
		int choice;
		
		do
		{
		    System.out.println("1. Attack Opponent");
		    System.out.println("2. Increase Hit Points");
		    System.out.print("Choose an option: ");
		    choice = playerInput.nextInt();			//TODO player input in interface?
		    
		    switch (choice)
		    {
			    case 1: getAttackBehavior().attack(opponent, attacker);
			        break;
			    case 2: increaseHitPoints();
			        break;
			    default:
			        System.out.println("invalid choice!");
		    }

			Hero.killTurn(); //decrements the number of turns the character has available 
		    if (Hero.getTurns() > 0)
			    System.out.println("Number of turns remaining is: " + Hero.getTurns());
		    	playerInput.close();
		} while(Hero.getTurns() > 0 && getHitPoints() > 0 && opponent.getHitPoints() > 0);

    }


    public double getChanceToBlock()
    {
	
	return chanceToBlock;
    }


    public AttackBehavior getSpecialAttack()
    {
	
	return null;
    }

  
    public static AttackBehavior getAttack()
    {
	return attackBehavior;
    }

    public static void setAttack(AttackBehavior attack)
    {
	attack = getAttack();
    }

    public int getHitPoints()
    {
	return Sorceress.hitPoints;
    }

    public void setHitPoints(int hitPoints)
    {
	Sorceress.hitPoints = hitPoints;
    }

    public int getAttackSpeed()
    {
	return attackSpeed;
    }

    public static void setAttackSpeed(int attackSpeed)
    {
	Sorceress.attackSpeed = attackSpeed;
    }

    @Override
    public void heal(DungeonCharacter character, int minHeal, int maxHeal, int maxHitPoints)
    {
	if(getHitPoints() > maxHitPoints)
	    setHitPoints(maxHitPoints);
	
	increaseHitPoints();
	
    }
    
    public static HealBehavior getHeal()
    {
	return healSelf;
    }
    public static void setHeal(HealBehavior heal)
    {
	Sorceress.healSelf = heal;
    }
    
    public int subtractHitPoints(DungeonCharacter opponent, DungeonCharacter attacker)
    {
	int current = opponent.getHitPoints();
	 attacker.getAttackBehavior().attack(opponent, attacker);
	 
	 return current = getHitPoints();
		 
    }
    
    @Override
    public AttackBehavior getAttackBehavior()
    {
	return attackBehavior;
    }
   
 
    public boolean isAlive()
    {
	if (getHitPoints() > 0)
	    return false;

	else
	    return true;

    }
    
    @Override
    public String getName()
    {
	return this.name;
    }
    public int getMaxHitPoints()
    {
	return maxHitPoints;
    }
 
  
    @Override
    public AttackBehavior attack(DungeonCharacter opponent, DungeonCharacter attacker)
    {
	
	return attack(opponent, attacker);
    }
  
 
  

    
    
 
}
