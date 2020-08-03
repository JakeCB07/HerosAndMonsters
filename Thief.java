import java.util.Scanner;

class Thief extends Hero implements iDungeonCharacter.iHero  {

	private static String name = "Thief";
	private static int hitPoints = 75;
	private static int attackSpeed = 6;
	private static AttackBehavior attack = new Shortbow();
	private static AttackBehavior specialAttack = new SurpriseAttack();
	private static double chanceToBlock = .5;

	
	
	  Thief(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior, double chanceToBlock,
		    AttackBehavior specialAttack)
	    {
	      super(name, attackSpeed, attackSpeed, specialAttack, chanceToBlock);
	  	  name= getName();
		  hitPoints = getHitPoints();
		  attack = getAttackBehavior();
		chanceToBlock = getChanceToBlock();
		specialAttack = getSpecialAttack();
		chanceToBlock = getChanceToBlock();
		specialAttack = getSpecialAttack();
	    }// end constructor

	
	private void SurpriseAttack(DungeonCharacter opponent) {
		double surprise = Math.random();
		
		if (surprise <= .4) {
			System.out.println("Surprise attack was successful!\n" + getName() + " gets an additional turn.");
			addTurn();
			getAttackBehavior().attack(opponent, opponent); //TODO both are set as opponenet currently 
		} 
		else if (surprise >= .9) {
			System.out.println("Uh oh! " + opponent.getName() + " saw you and" + " blocked your attack!");
		} else
			attack(opponent, opponent);
		
	}
	 public int getTurns()
	    {
		
		return numTurns;
	    }
	
	public void addTurn()
	{
	     numTurns = numTurns++;
	}

	

	public void battleChoices(DungeonCharacter opponent) {
		battleChoices(opponent);
		int choice;

		Scanner keyBoard = new Scanner(System.in);
		
		do {
			System.out.println("1. Attack Opponent");
			System.out.println("2. Surprise Attack");
			System.out.print("Choose an option: ");
			choice = keyBoard.nextInt();

			switch (choice) {
			case 1:
				attack(opponent, this);
				break;
			case 2:
				SurpriseAttack(opponent);
				break;
			default:
				System.out.println("invalid choice!");
			}

			killTurn();
			if (getTurns() > 0)
				System.out.println("Number of turns remaining is: " + getTurns());

		} while (getTurns() > 0 && hitPoints > 0 && opponent.getHitPoints() > 0);

	}

		    
	    public AttackBehavior getSpecialAttack()
	    {
		return specialAttack;
	    }
	    
	
	    @Override
	    public void attack(DungeonCharacter opponent, DungeonCharacter attacker)
	    {
		 getAttackBehavior().attack(opponent,  this);
		
	    }

	    @Override
	    public static String getName()
	    {
		
		return name;
	    }


	 
	    public void subtactHitPoints(DungeonCharacter opponent)
	    {
		return;
		
	    }


	    protected int subtractHitPoints()
	    {
		
		return getHitPoints();
	    }


	}