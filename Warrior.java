
public class Warrior extends Hero implements iDungeonCharacter.iHero
{

    private static String name = "Warrior";
    private static int hitPoints = 125;
    private static int attackSpeed = 4;
    private static AttackBehavior attackBehavior = new MightySword();
    private AttackBehavior specialAttack = new CrushingBlow();
    private static double chanceToBlock = .2;

    // ----------------------------------------------------------------
    Warrior(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior, double chanceToBlock)
    {
	super(name, hitPoints, attackSpeed, attackBehavior, chanceToBlock);
	name = getName();
	hitPoints = getHitPoints();
	attack = getAttackBehavior();
	chanceToBlock = getChanceToBlock();
	specialAttack = getSpecialAttack();
    }

    private void crushingBlow(DungeonCharacter opponent)
    {
	getSpecialAttack().attack(opponent, this);
    }// end crushingBlow method

    private void attack(DungeonCharacter opponent)
    {
	getSpecialAttack().attack(opponent, this);
    }// end override of attack method

    public void battleChoices(DungeonCharacter opponent)
    {
	int choice;

	battleChoices(opponent);

	do
	{
	    System.out.println("1. Attack Opponent");
	    System.out.println("2. Crushing Blow on Opponent");
	    System.out.print("Choose an option: ");
	    choice = DungeonCharacter.getKeyBoard().nextInt();

	    switch (choice)
	    {
	    case 1:
		attack(opponent);
		break;
	    case 2:
		crushingBlow(opponent);
		break;
	    default:
		System.out.println("invalid choice!");
	    }// end switch

	    killTurn();
	    if (getTurns() > 0)
		System.out.println("Number of turns remaining is: " + getTurns());

	} while (getTurns() > 0 && hitPoints > 0 && opponent.hitPoints > 0);

    }// end battleChoices method

    public int getTurns()
    {

	return numTurns;
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

    public int getAttackSpeed()
    {
	return attackSpeed;
    }

    public void attack(DungeonCharacter opponent, DungeonCharacter attacker)
    {
	getAttackBehavior().attack(opponent, this);

    }


    @Override
    public int getHitPoints()
    {
	return hitPoints;
    }

    @Override
    public void subtactHitPoints(DungeonCharacter opponent)
    {
	return;
	
    }

    @Override
    protected int subtractHitPoints()
    {
	
	return getHitPoints();
    }

}// end Hero class