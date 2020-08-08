package dungeon;

public abstract class Monster extends DungeonCharacter implements MonsterInterface
{

    protected double chanceToHeal;
    protected int minHeal, maxHeal;

//-----------------------------------------------------------------
    public Monster(String name, int hitPoints, int attackSpeed, AttackBehavior attack, int minHeal, int maxHeal)
    {
	super(name, hitPoints, attackSpeed, attack);
	this.attackSpeed = attackSpeed;
	this.maxHeal = maxHeal;
	this.minHeal = minHeal;

    }// end monster construcotr

//-----------------------------------------------------------------
    public void heal()
    {
	boolean canHeal;
	int restoredHP;
	canHeal = (Math.random() <= chanceToHeal) && (hitPoints > 0);

	if (canHeal)
	{
	    restoredHP = ((int) Math.random() * (maxHeal - minHeal + 1) + minHeal);
	    addHitPoints(restoredHP);
	    System.out.println(this.name + "healed for " + restoredHP + "health points /n");
	    System.out.println("Total remaining HP: " + getHitPoints());

	}
    }

//-----------------------------------------------------------------
    public void subtractHitPoints(DungeonCharacter opponent)
    {
	opponent.attack(opponent, this);
	heal();

    }// end method

}// end Monster class