class Ogre extends Monster implements MonsterInterface, HealBehavior
{
    public String getName()
    {
	return name;
    }

    private static String name = "Oscar the Ogre";
    private static int hitPoints = 200;
    private static int attackSpeed = 2;
    private static double chanceToHeal = .1;
    private static AttackBehavior attackBehavior = new WoodenClub();
    private static int minHeal = 30;
    private static int maxHeal = 50;

    // super("Oscar the Ogre", 200, 2, .6, .1, 30, 50, 30, 50);

    protected Ogre()
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
	Ogre.hitPoints = hitPoints;
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
	getAttackBehavior().attack(opponent, this);

    }

    @Override
    public void heal(DungeonCharacter character, int minHeal, int maxHeal)
    {
	character.addHitPoints(hitPoints);

    }

}