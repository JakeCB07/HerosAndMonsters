import java.util.Scanner;


public abstract class DungeonCharacter implements iDungeonCharacter
{

    protected  String name;
    protected int hitPoints;
    protected  int attackSpeed;
    protected AttackBehavior attack;
    protected int numTurns;
    private static  Scanner Keyboard = new Scanner(System.in);
    public int choice = getKeyBoard().nextInt();

    DungeonCharacter(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior)
    {

	name = getName();
	hitPoints = getHitPoints();
	attackSpeed = getAttackSpeed();;
	attackBehavior = getAttackBehavior();

    }// end constructor

    public static Scanner getKeyBoard()
    {
	return Keyboard;
    }

    public void setAttackBehavior(AttackBehavior attack)
    {
	this.attack = attack;
    }

    public AttackBehavior getAttackBehavior()
    {
	return attack;
    }

    public void setName(String name)
    {
	name = readName();
    }

    protected abstract String readName();
    
    public String getName()
    {
	return this.name;
    }

    public void setHitPoints(int hitPoints)
    {
	
	hitPoints =  getHitPoints() - subtractHitPoints();
    }

   protected abstract int subtractHitPoints();

 
    
    public int getAttackSpeed()
    {
	return attackSpeed;
    }

    public boolean isAlive()
    {
	if(getHitPoints() > 0)
	    return true;
	return false;
    }
      
    public void attack(DungeonCharacter opponent, DungeonCharacter attacker)
    {
        getAttackBehavior().attack(opponent,  this);
    }

    
}// end class Character