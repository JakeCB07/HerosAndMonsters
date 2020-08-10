import java.util.ArrayList;
import java.util.Scanner;

public class Hero extends DungeonCharacter {
    
    
	private int numTurns;
	private static Location point;
	protected double chanceToBlock;
	protected ArrayList<Item> inventory;
    protected String name;
	protected Scanner playerInput = new Scanner(System.in);
	 
	protected int pillarCount;
	protected int healingPotCount;
	protected int visionPotCount;
	    
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

	public void battleChoices(DungeonCharacter opponent)
	{
	    numTurns = getAttackSpeed()/opponent.getAttackSpeed();

		if (getNumTurns() <= 0)
			addTurns();

		System.out.println("Number of turns this round is: " + getNumTurns());

	}
	
    protected String printInventory(Hero character) {
    	String retStr = "1. Pillars: " + this.pillarCount + "\n"
    	+ "2. Healing Potions: " + this.healingPotCount + "\n" 
    	+ "3. Vision Potions: " + this.visionPotCount + "\n";
  
    	return retStr;
    }
    
    protected void useItem(Hero character, int playerInput) {
    	if(playerInput == 1) 
    		System.out.println(4 - pillarCount + " remaing pillars left to collect");
    	if(playerInput == 2 && character.healingPotCount > 0)
    		HealingPotion.use(character);
    	if(playerInput == 3 && character.visionPotCount > 0)
    		VisionPotion.use(character);
    	
    }
    
    protected void addHealingPot(Hero hero) {
    	hero.healingPotCount++;
    }
    protected void addVisionPot(Hero hero) {
    	hero.visionPotCount++;
    }
    protected void addPillar(Hero hero) {
    	hero.pillarCount++;
    }
	
    protected void removeHealingPot(Hero hero) {
    	hero.healingPotCount--;
    }
    protected void removeVisionPot(Hero hero) {
    	hero.visionPotCount--;
    }
    protected void removePillar(Hero hero) {
    	hero.pillarCount--;
    }
	
	
}
