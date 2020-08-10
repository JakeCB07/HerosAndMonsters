
public abstract class Monster implements iDungeonCharacter, MonsterInterface, HealBehavior
{

    protected double chanceToHeal;
    protected int minHeal, maxHeal;

//-----------------------------------------------------------------
    public Monster(String name, int hitPoints, int attackSpeed, AttackBehavior attack, int minHeal, int maxHeal)
    {
	
	name = getName();
	hitPoints = getHitPoints();
	attackSpeed = getAttackSpeed();
	attack = getAttackBehavior();
	
	this.maxHeal = maxHeal;
	this.minHeal = minHeal;

    }// end monster construcotr

//-----------------------------------------------------------------
    public void heal()
    {
	boolean canHeal;
	int restoredHP;
	canHeal = (Math.random() <= chanceToHeal) && (getHitPoints() > 0);

	if (canHeal)
	{
	    restoredHP = ((int) Math.random() * (maxHeal - minHeal + 1) + minHeal);
	    this.addHitPoints(restoredHP);
	    System.out.println(getName() + "healed for " + restoredHP + "health points /n");
	    System.out.println("Total remaining HP: " + getHitPoints());

	}
    }
    
    public int addHitPoints(int restoredHP)
    {
	int healHP = getHitPoints() + restoredHP;
	return healHP;
    }

//-----------------------------------------------------------------
    public void subtractHitPoints(DungeonCharacter opponent)
    {
	opponent.attack(opponent, this);
	heal();

    }// end method

}// end Monster class