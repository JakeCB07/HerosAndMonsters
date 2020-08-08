package dungeon;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Hero extends DungeonCharacter implements HeroInterface
{

    protected Scanner playerInput = new Scanner(System.in);
    protected double chanceToBlock;
    protected ArrayList<Item> inventory;
    protected int numTurns;
    private Location point;

    Hero(String name, int hitPoints, int attackSpeed, AttackBehavior attack, double chanceToBlock)
    {
	super(name, hitPoints, attackSpeed, attack);
	this.name = getName();
	this.hitPoints = getHitPoints();
	this.attackSpeed = getAttackSpeed();
	attack = getAttackBehavior();
	this.chanceToBlock = getChanceToBlock();
	readName();
	this.inventory = new ArrayList();
    }
    
	public void setPoint(int x, int y) {
		point=new Location(x,y);
	}
	
    public Location getPoint() {
    	 return this.point;
    }

    public void setName(String name)
    {
	name = readName();
    }

    public String readName()
    {
	System.out.println("Enter character name: ");
	return name = playerInput.nextLine();
    }

    private boolean defend()
    {
	return Math.random() <= getChanceToBlock();
    }

    protected void gotHit(DungeonCharacter opponent)
    {
	if (defend())
	{
	    System.out.println(getName() + " BLOCKED the attack!");
	} else
	{
	    opponent.attack(opponent, this);
	}
    }

    protected void battleChoices(DungeonCharacter opponent)
    {
	numTurns = getAttackSpeed() / opponent.getAttackSpeed();

	if (numTurns == 0)
	    numTurns++;

	System.out.println("Number of turns this round is: " + numTurns);
    }

    protected void killTurn()
    {
	this.numTurns--;
    }

    protected void addTurn()
    {
	this.numTurns++;
    }

    protected int getTurns()
    {
	return this.numTurns;
    }

    public void subtractHitPoints(int damageReceived)
    {
	if (defend())
	{
	    System.out.println(getName() + " BLOCKED the attack!");
	} else
	{
	    super.subtractHitPoints(damageReceived);
	}

    }// end method

    protected double getChancetoBlock()
    {

	return chanceToBlock;
    }

    public String toString()
    {
	return "Name: " + getName() + "\n Hit Points: " + getHitPoints();

    }
    
    protected String printInventory(Hero character) {
    	String retStr = "";
    	int index = 0;
    	for(Item item : character.inventory) {
    		retStr += index + ". " + item.itemName + "\n";
    	}
  
    	return retStr;
    }
    
    protected void useItem(Hero character, int playerInput) {
    	playerInput -= 1;
    	Item item = character.inventory.get(playerInput);
    	item.use(character, playerInput);
    }

   
}// end Hero class