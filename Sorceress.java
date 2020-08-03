
public class Sorceress extends Hero implements iDungeonCharacter.iHero
{
    
    
    private int minHeal = 25;
    private int maxHeal = 50;

    private static String name = "Sorceress";
    private static int hitPoints = 75;
    private static int attackSpeed = 5;
    private static AttackBehavior attack= new Firebolt();
      private static HealBehavior healSelf = new Heal();
    private static AttackBehavior specialAttack = (AttackBehavior) healSelf;
    private static double chanceToBlock = .3;

//-----------------------------------------------------------------
  
   
    Sorceress(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior, double chanceToBlock)
    {	super(name, hitPoints, attackSpeed, attackBehavior, chanceToBlock);
	  name= getName();
	  hitPoints = getHitPoints();
	  attackBehavior = getAttackBehavior();
	chanceToBlock = getChanceToBlock();
	specialAttack = getSpecialAttack();
    }// end constructor

   
    // -----------------------------------------------------------------
    private void increaseHitPoints()
    {
	healSelf.heal(this, minHeal, maxHeal);
    }

//-----------------------------------------------------------------
  
    private void attack(DungeonCharacter opponent)
    {
	getAttackBehavior().attack(opponent,  this);
    }

//-----------------------------------------------------------------
    protected void battleChoices(DungeonCharacter opponent)
    {
	battleChoices(opponent);
	int choice;

	do
	{
	    System.out.println("1. Attack Opponent");
	    System.out.println("2. Increase Hit Points");
	    System.out.print("Choose an option: ");
	    choice = playerInput.nextInt();

	    switch (choice)
	    {
	    case 1:
		attack(opponent);
		break;
	    case 2:
		increaseHitPoints();
		break;
	    default:
		System.out.println("invalid choice!");
	    }// end switch

	    killTurn();
	    if (getTurns() > 0)
		System.out.println("Number of turns remaining is: " + getTurns());

	} while (getTurns() > 0 && getHitPoints() > 0 && opponent.getHitPoints() > 0);

    }// end overridden method

   

   public int getTurns()
    {
	
	return numTurns;
    }

  public AttackBehavior getAttackBehavior()
  {
  	
  	return attack;
  }


  public AttackBehavior getSpecialAttack()
  {
  	return (AttackBehavior) healSelf;
  }

@Override
public String getName()
{
      return name;
}



public int getAttackSpeed()
{
    return attackSpeed;

}


public void subtactHitPoints(DungeonCharacter opponent)
{
	return;
	
}



protected int subtractHitPoints()
{
	
	return getHitPoints();
}


@Override
public int getHitPoints()
{
    return hitPoints;
}





}// end class