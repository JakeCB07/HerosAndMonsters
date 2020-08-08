package dungeon;

public class Thief extends Hero
{

    public String getName()
    {
	return name;
    }

    private static String name = "Thief";
    private static int hitPoints = 75;
    private static int attackSpeed = 6;
    private static AttackBehavior attackBehavior = new Shortbow();
    private static double chanceToBlock = .5;

    private AttackBehavior getSpecialAttack()
    {
	return attack;
    }

    protected Thief()
    {
	super(name, hitPoints, attackSpeed, attackBehavior, chanceToBlock);
    }

    Thief createThief(String name, double chanceToBlock, AttackBehavior specialAttack)
    {
	name = getName();
	chanceToBlock = getChanceToBlock();
	specialAttack = getSpecialAttack();

	return new Thief();
    }// end constructor

    Thief(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior, double chanceToBlock)
    {
	super(name, hitPoints, attackSpeed, attackBehavior, chanceToBlock);
	name = getName();
	hitPoints = getHitPoints();
	attackSpeed = getAttackSpeed();
	chanceToBlock = getChancetoBlock();

    }

    public void surpriseAttack(DungeonCharacter opponent)
    {
	double surprise = Math.random();
	if (surprise <= .4)
	{
	    System.out.println("Surprise attack was successful!\n" + this.getName() + " gets an additional turn.");
	    addTurn();
	    attack(this, opponent);
	} else if (surprise >= .9)
	{
	    System.out.println("Uh oh! " + opponent.getName() + " saw you and" + " blocked your attack!");
	} else
	    attack(opponent, this);

    }

    public void battleChoices(DungeonCharacter opponent)
    {
	super.battleChoices(opponent);
	int choice;

	do
	{
	    System.out.println("1. Attack Opponent");
	    System.out.println("2. Surprise Attack");
	    System.out.print("Choose an option: ");
	    choice = playerInput.nextInt();

	    switch (choice)
	    {
	    case 1:
		getAttackBehavior().attack(opponent, this);
		break;
	    case 2:
		surpriseAttack(opponent);
		break;
	    default:
		System.out.println("invalid choice!");
	    }// end switch

	    killTurn();
	    if (getTurns() > 0)
		System.out.println("Number of turns remaining is: " + getTurns());

	} while (getTurns() > 0);

    }

    public double getChanceToBlock()
    {
	return chanceToBlock;
    }

    public AttackBehavior getAttackBehavior()
    {
	return attackBehavior;
    }

    public static void setAttackBehavior(AttackBehavior attackBehavior)
    {
	Thief.attackBehavior = attackBehavior;
    }

    public int getAttackSpeed()
    {
	return attackSpeed;
    }

    public static void setAttackSpeed(int attackSpeed)
    {
	Thief.attackSpeed = attackSpeed;
    }

    public int getHitPoints()
    {
	return hitPoints;
    }

}
