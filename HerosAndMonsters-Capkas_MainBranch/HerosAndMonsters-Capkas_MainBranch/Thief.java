

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */




public class Thief implements DungeonCharacter.Hero
{
    private static String name = "Thief";
	private static int hitPoints = 75;
	private static int attackSpeed = 6;
	private static AttackBehavior attackBehavior = new Shortbow();
	  
	
	//TODO look at the actual special attack and update
	private static AttackBehavior specialAttack = new CrushingBlow();
	
	   
	   
	   private static double chanceToBlock = .5;


    	public Thief(Hero theHero, double chanceToBlock, AttackBehavior specialAttack)
	{
        	chanceToBlock = getChanceToBlock();
        	specialAttack = getSpecialAttack();
  	 }//end constructor

    
    @Override
    public void attack(DungeonCharacter opponent, DungeonCharacter attacker)
    {
	attackBehavior.attack(opponent, (DungeonCharacter) this);
	
    }
   
    public void specialAttack(DungeonCharacter opponent)
    {
	specialAttack = new CrushingBlow();
	
	specialAttack.attack(opponent, (DungeonCharacter) this);
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


  


   

    

    	
}//end Hero class