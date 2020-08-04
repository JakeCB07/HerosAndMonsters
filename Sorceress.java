
public class Sorceress extends Hero implements HealBehavior, HeroInterface{
   
    public String getName()
    {
	return name;
    }
    
    public final int minHeal = 25;
 	public final int maxHeal = 50;

 	private static String name = "Sorceress";
 	private static int hitPoints = 75;
 	private static int attackSpeed = 5;
 	private static AttackBehavior attack = new Firebolt();
 	private static HealBehavior healSelf =  new Heal();
 	private static double chanceToBlock = .3;
	 
	    
    protected Sorceress()
	{
		super(name, attackSpeed, attackSpeed, attack, chanceToBlock);
	
		
	}
    Sorceress createSorceress(String name, double chanceToBlock, int heal)
	{
		name= getName();
       	chanceToBlock = getChanceToBlock();
       	heal = addHitPoints(hitPoints);
		
       	return new Sorceress();
 	 }//end constructor
   
    	public Sorceress(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior, double chanceToBlock) 
    	{
    	   super(name, hitPoints, attackSpeed, attackBehavior, chanceToBlock);
        	    name = getName(); 
        	   hitPoints = getHitPoints(); 
        	   attackBehavior = getAttackBehavior();
        	   healSelf = getHeal();
        	   attackSpeed = getAttackSpeed(); 
        	   chanceToBlock = getChanceToBlock();
        	    
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
    public void battleChoices(DungeonCharacter opponent)
	{
		super.battleChoices(opponent);
		int choice;

		do
		{
		    System.out.println("1. Attack Opponent");
		    System.out.println("2. Increase Hit Points");
		    System.out.print("Choose an option: ");
		    choice = playerInput.nextInt();

		    switch (choice)
		    {
			    case 1: attack(opponent, this);
			        break;
			    case 2: increaseHitPoints();
			        break;
			    default:
			        System.out.println("invalid choice!");
		    }

			killTurn(); //decrements the number of turns the character has available 
		    if (getTurns() > 0)
			    System.out.println("Number of turns remaining is: " + getTurns());

		} while(getTurns() > 0 && getHitPoints() > 0 && opponent.getHitPoints() > 0);

    }


    public double getChanceToBlock()
    {
	
	return chanceToBlock;
    }


    public AttackBehavior getSpecialAttack()
    {
	
	return null;
    }

    public void attack(DungeonCharacter opponent, DungeonCharacter attacker)
    {
	opponent.attack(opponent, attacker);

    }

    public static AttackBehavior getAttack()
    {
	return attack;
    }

    public static void setAttack(AttackBehavior attack)
    {
	Sorceress.attack = attack;
    }

    public int getHitPoints()
    {
	return hitPoints;
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
    public void heal(DungeonCharacter character, int minHeal, int maxHeal)
    {
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
  

    
    
 
}
