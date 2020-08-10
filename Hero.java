import java.util.ArrayList;
import java.util.Scanner;

public class Hero extends DungeonCharacter {
    
    
	private int numTurns;
	private static Location point;
	protected double chanceToBlock;
	protected ArrayList<Item> inventory;
    protected String name;
	protected Scanner playerInput = new Scanner(System.in);
	public Hero(String name, int hitPoints, int attackSpeed, double chanceToHit, int damageMin, int damageMax,
			 int numTurns, double chanceToBlock, AttackBehavior attack) {
		super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, chanceToBlock, numTurns, attack);
		
	}

	public void setPoint(int x, int y) {
		point=new Location(x,y);
	}
     public static Location getPoint() {
    	 return point;
     }
 
	public void subtractHitPoints(DungeonCharacter opponent) {
		opponent.getAttackBehavior().attack(opponent, this);
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
	public void battleChoices(DungeonCharacter opponent)
	{
	    numTurns = getAttackSpeed()/opponent.getAttackSpeed();

		if (getNumTurns() <= 0)
			addTurns();

		System.out.println("Number of turns this round is: " + getNumTurns());

	}
	
	
}
