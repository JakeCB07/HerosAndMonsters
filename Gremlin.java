package dungeon;

public class Gremlin extends Monster implements HealBehavior, MonsterInterface
{

    public String getName()
    {
	return name;
    }

    private static String name = "Gnarltooth the Gremlin";
    private static int hitPoints = 70;
    private static int attackSpeed = 5;
    private static double chanceToHeal = .4;
    private static AttackBehavior attackBehavior = AttackFactory.KrisFactory();
    private static int minHeal = 20;
    private static int maxHeal = 40;

    protected Gremlin()
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
	return Gremlin.hitPoints;
    }

    public void setHitPoints(int hitPoints)
    {
	Gremlin.hitPoints = hitPoints;
    }

    public int getAttackSpeed()
    {
	return Gremlin.attackSpeed;
    }

    public double getChanceToHeal()
    {
	return Gremlin.chanceToHeal;
    }

    public AttackBehavior getAttackBehavior()
    {
	return Gremlin.attackBehavior;
    }

    public int getMinHeal()
    {
	return Gremlin.minHeal;
    }

    public int getMaxHeal()
    {
	return Gremlin.maxHeal;
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
