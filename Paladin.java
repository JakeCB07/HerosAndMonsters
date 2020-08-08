package dungeon;

public class Paladin extends Hero{

	 private static String name = "Paladin";
	    private static int hitPoints = 140;
	    private static int attackSpeed = 4;
	    private static AttackBehavior attackBehavior = new Hammer();
	    private static AttackBehavior specialAttack = new DivineSmite();
	    private static double chanceToBlock = .2;
	    private static double chanceToHit;

	    Paladin createPaladin(String name, double chanceToBlock, AttackBehavior specialAttack)
	    {

		name = getName();
		chanceToBlock = getChanceToBlock();
		specialAttack = getSpecialAttack();

		return new Paladin();
	    }// end constructor

	    protected Paladin()
	    {
		super(name, hitPoints, attackSpeed, attackBehavior, chanceToBlock);
		name = getName();
		hitPoints = getHitPoints();
		attackSpeed = getAttackSpeed();
		attackBehavior = getAttackBehavior();
		chanceToBlock = getChanceToBlock();
		specialAttack = getSpecialAttack();
	    }

	    public void getSpecialAttack(DungeonCharacter opponent)
	    {
		specialAttack = new DivineSmite();

		attack(this, opponent);
	    }
	    
	    private void divineSmite(DungeonCharacter opponent) {
	    	specialAttack.attack(opponent, this);
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

	    public double getChanceToHit()
	    {
		return chanceToHit;
	    }

	    public void battleChoices(DungeonCharacter opponent)
	    {
		super.battleChoices(opponent);
		int choice;

		do
		{
		    System.out.println("1. Attack Opponent");
		    System.out.println("2. Special attacK: Crushing Blow");
		    System.out.print("Choose an option: ");
		    choice = playerInput.nextInt();

		    switch (choice)
		    {
		    case 1:
			attack(opponent, this);
			break;
		    case 2:
			divineSmite(opponent);
			break;
		    default:
			System.out.println("invalid choice!");
		    }

		    killTurn(); // decrements the number of turns the character has available
		    if (getTurns() > 0)
			System.out.println("Number of turns remaining is: " + getTurns());

		} while (getTurns() > 0 && getHitPoints() > 0 && opponent.getHitPoints() > 0);

	    }
}
