
class Skeleton extends Monster implements MonsterInterface
{

    public String getName()
    {
	return name;
    }

    private static String name = "Sargath the Skeleton";
    private static int hitPoints = 100;
    private static int attackSpeed = 3;
    private static double chanceToHeal = .3;
    private static AttackBehavior attackBehavior = new RustyBlade();
    private static int minHeal = 30;
    private static int maxHeal = 50;

    protected Skeleton()
    {

	super(name, hitPoints, attackSpeed, attackBehavior, minHeal, maxHeal);

	name = getName();
	hitPoints = getHitPoints();
	attackBehavior = getAttackBehavior();

	chanceToHeal = getChanceToHeal();
	minHeal = getMinHeal();
	maxHeal = getMaxHeal();

    }

    public boolean isAlive()
    {
	if (getHitPoints() > 0)
	    return true;

	return false;

    }

    public int getHitPoints()
    {
	return hitPoints;
    }

    public void setHitPoints(int hitPoints)
    {
	Skeleton.hitPoints = hitPoints;
    }

    public int getAttackSpeed()
    {
	return attackSpeed;
    }

    public double getChanceToHeal()
    {
	return chanceToHeal;
    }

    public AttackBehavior getAttackBehavior()
    {
	return attackBehavior;
    }

    public int getMinHeal()
    {
	return minHeal;
    }

    public int getMaxHeal()
    {
	return maxHeal;
    }

    public void attack(DungeonCharacter opponent, DungeonCharacter attacker)
    {
	opponent.getAttackBehavior().attack(opponent, attacker);

    }

    protected String readName()
    {

	return getName();
    }

}
