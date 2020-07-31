

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */




public class Warrior implements DungeonCharacter.Hero
{
    private static  String name = "Warrior";
    private  static int hitPoints = 125;
    private  static int attackSpeed = 4;
    private  static AttackBehavior attackBehavior = new MightySword();
    private static AttackBehavior specialAttack = new CrushingBlow();
    private static  double chanceToBlock = .2;

    
    
    Warrior(Hero theHero, double chanceToBlock, AttackBehavior specialAttack)
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