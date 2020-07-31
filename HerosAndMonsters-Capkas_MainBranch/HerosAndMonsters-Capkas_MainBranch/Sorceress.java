

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */



public class Sorceress implements DungeonCharacter.Hero
{
   
    
    public final int MIN_ADD = 25;
	public final int MAX_ADD = 50;

	private static String name = "Sorceress";
	private static int hitPoints = 75;
	private static int attackSpeed = 5;
	private static AttackBehavior attackBehavior = new Firebolt();
	
	
	private static AttackBehavior specialAttack = new CrushingBlow();
	//TODO CHANGE THIS SPECIAL ATTACK IF SORCERESS HAS ONE OTHERWISE SET NULL
	
	public Sorceress(Hero theHero, double chanceToBlock, AttackBehavior specialAttack)
	{
        	chanceToBlock = getChanceToBlock();
        	specialAttack = getSpecialAttack();
  	 }//end constructor
	
	private static double chanceToBlock = .3;
    
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









	
}//end Sorceress

