

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */




public class Thief implements DungeonCharacterInterface.Hero
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

    

   
    public void specialAttack(DungeonCharacterInterface opponent)
    {
	specialAttack = new SneakAttack(); //TODO wreite sneakAttack
	
	specialAttack.attack(opponent, (DungeonCharacterInterface) this);
    }
    
    
    	
      public static String getName()
      {
          return name;
      }

  
    public static  AttackBehavior getAttackBehavior()
    {
	
	return attackBehavior;
    }
    
    
    public AttackBehavior getSpecialAttack()
    {
	return specialAttack;
    }

   
    public static double getChanceToBlock()
    {
	return chanceToBlock;
    }


    public static int getHitPoints()
    {
	return hitPoints;
    }

  
    public static int getAttackSpeed()
    {
	return attackSpeed;
    }



    public void attack(DungeonCharacterInterface opponent, DungeonCharacterInterface attacker)
    {
	attackBehavior.attack(opponent, (DungeonCharacterInterface) this);
	
    }


   


    	
}//end Hero class