public class Warrior extends Hero implements HeroInterface
{

    private static String name = "Warrior";
    private static int hitPoints = 125;
    private static int attackSpeed = 4;
    private static AttackBehavior attackBehavior = new MightySword();
    private static AttackBehavior specialAttack;
    private static double chanceToBlock = .2;
    private static double chanceToHit;

    Warrior createWarrior(String name, double chanceToBlock, AttackBehavior specialAttack)
    {

	name = getName();
	chanceToBlock = getChanceToBlock();
	specialAttack = getSpecialAttack();

	return new Warrior();
    }// end constructor

    protected Warrior()
    {
	super(name, hitPoints, attackSpeed, attackBehavior, chanceToBlock);
	name = getName();
	hitPoints = getHitPoints();
	attackSpeed = getAttackSpeed();
	attackBehavior = getAttackBehavior();
	chanceToBlock = getChanceToBlock();
	specialAttack = getSpecialAttack();
    }

    public void CrushingBlow(DungeonCharacter opponent)
    {
	double surprise = Math.random();
	if (surprise <= .4)
	{
	    System.out.println("Surprise attack was successful!\n" + this.getName() + " gets an additional turn.");
	    addTurn();
	    attack(opponent, this);
	} else if (surprise >= .9)
	{
	    System.out.println("Uh oh! " + opponent.getName() + " saw you and" + " blocked your attack!");
	} else
	    attack(opponent, this);

    }

    public void getSpecialAttack(DungeonCharacter opponent)
    {
	specialAttack = new CrushingBlow();

	attack(this, opponent);
    }

    public void crushingBlow(DungeonCharacter opponent)
    {
	if (Math.random() <= .4)
	{
	    int blowPoints = (int) (Math.random() * 76) + 100;
	    System.out.println(this.getName() + " lands a CRUSHING BLOW for " + blowPoints + " damage!");
	    opponent.subtractHitPoints(blowPoints);
	} // end blow succeeded
	else
	{
	    System.out.println(getName() + " failed to land a crushing blow");
	    System.out.println();
	} // blow failed

    }// end crushingBlow method

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
		this.crushingBlow(opponent);
		break;
	    default:
		System.out.println("invalid choice!");
	    }

	    killTurn(); // decrements the number of turns the character has available
	    if (getTurns() > 0)
		System.out.println("Number of turns remaining is: " + getTurns());

	} while (getTurns() > 0 && getHitPoints() > 0 && opponent.getHitPoints() > 0);

    }

}// end Hero class