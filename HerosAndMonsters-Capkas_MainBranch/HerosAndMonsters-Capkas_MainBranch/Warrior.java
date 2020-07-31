

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */




public class Warrior implements DungeonCharacterInterface.Hero
{
    HeroFactory heroFactory;
    
    
    private static  String name = "Warrior";
    private  static int hitPoints = 125;
    private  static int attackSpeed = 4;
    private  static AttackBehavior attackBehavior = new MightySword();
    private static AttackBehavior specialAttack = new CrushingBlow();
    private static  double chanceToBlock = .2;

    
    Warrior createWarrior(String name, double chanceToBlock, AttackBehavior specialAttack)
   	{
		Warrior.name= getName();
           	Warrior.chanceToBlock = getChanceToBlock();
           	Warrior.specialAttack = getSpecialAttack();
   		
           	return new Warrior();
     	 }//end constructor
    
    Warrior(){
	createWarrior(name, chanceToBlock, specialAttack);
    }
    
  

    
    @Override
    public void attack(DungeonCharacterInterface opponent, DungeonCharacterInterface attacker)
    {
	attackBehavior.attack(opponent, (DungeonCharacterInterface) this);
	
    }
   
    public void specialAttack(DungeonCharacterInterface opponent)
    {
	specialAttack = new CrushingBlow();
	
	specialAttack.attack(opponent, (DungeonCharacterInterface) this);
    }
    
    
    	
      public static String getName()
      {
          return name;
      }

  
    public static AttackBehavior getAttackBehavior()
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

    

    	
}//end Hero class