import java.util.Scanner;

public abstract class Hero extends DungeonCharacter implements iDungeonCharacter.iHero
{
	
	protected static Scanner playerInput = new Scanner(System.in);
	protected double chanceToBlock;
	protected int numTurns;
	
	
	Hero(String name, int hitPoints, int attackSpeed, AttackBehavior attack, double chanceToBlock) {
		super(name, hitPoints, attackSpeed, attack);
		name = getName();
		this.hitPoints = getHitPoints();
		this.attackSpeed = getAttackSpeed();
		this.attack = getAttackBehavior();
		this.chanceToBlock = getChanceToBlock();
		
		readName();
	}

	public double getChanceToBlock()
	{
	 
	    return chanceToBlock;
	}

	protected String readName() {
		System.out.print("Enter character name: ");
		 return name = playerInput.nextLine();
	}

	private boolean defend() {
		return Math.random() <= chanceToBlock;
	}

	protected void gotHit(DungeonCharacter opponent) {
		if (defend()) {
			System.out.println(name + " BLOCKED the attack!");
		} else {
			opponent.getAttackBehavior().attack(opponent, this);
		}
	}

	protected void battleChoices(DungeonCharacter opponent) {
		numTurns = getAttackSpeed() / opponent.getAttackSpeed();
		
		if (numTurns == 0)
			numTurns++;

		System.out.println("Number of turns this round is: " + getTurns());

	}

	

	protected void killTurn() {
		this.numTurns--;
	}

	public void addTurn() {
		this.numTurns++;
	}

	protected int getTurns() {
		return this.numTurns;
		
		
	}

	    public void setTurns(int numTurns)
	    {
		this.numTurns = numTurns;
	    }

	    public int getNumTurns()
	    {

		return numTurns;
			
		
	    }   

}// end Hero class