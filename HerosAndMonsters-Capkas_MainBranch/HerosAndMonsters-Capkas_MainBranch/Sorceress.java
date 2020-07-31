

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */



public class Sorceress implements DungeonCharacterInterface.Hero
{
   
    
    public final int MIN_ADD = 25;
	public final int MAX_ADD = 50;

	private static String name = "Sorceress";
	private static int hitPoints = 75;
	private static int attackSpeed = 5;
	private static AttackBehavior attackBehavior = new Firebolt();
	
	private static double chanceToBlock = .3;
	    

	private static AttackBehavior specialAttack = new CrushingBlow();
	//TODO CHANGE THIS SPECIAL ATTACK IF SORCERESS HAS ONE OTHERWISE SET NULL
	
	public Sorceress(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior, double chanceToBlock, AttackBehavior specialAttack)
	{
        	chanceToBlock = getChanceToBlock();
        	specialAttack = getSpecialAttack();
  	 }//end constructor
	
	

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



@Override
public void attack(DungeonCharacterInterface opponent, DungeonCharacterInterface attacker)
{
    attackBehavior.attack(opponent, (DungeonCharacterInterface) this);
}












	
}//end Sorceress

