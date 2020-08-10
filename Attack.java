/*
 *BURTS CONTRIBUTION 
 */

public abstract class Attack implements AttackBehavior
{

    protected String attack;
    protected int minDamage;
    protected int maxDamage;
    protected double chanceToHit;

    Attack(String attack, int minDamage, int maxDamage, double chanceToHit)
    {

	this.attack = attack;
	this.minDamage = minDamage;
	this.maxDamage = maxDamage;
	this.chanceToHit = chanceToHit;
    }

    public void attack(DungeonCharacter opponent, DungeonCharacter attacker)
    {
	boolean canAttack;
	int damage;

	System.out.println(attacker.getName() + " " + attack + " " + opponent.getName());
	canAttack = Math.random() <= chanceToHit;

	if (canAttack)
	{
	    damage = (int) (Math.random() * (maxDamage - minDamage + 1)) + minDamage;
	    subtractHitPoints(opponent, attacker, damage);

	    System.out.println();
	} // end if can attack
	else
	{

	    System.out.println(attacker.getName() + "'s attack on " + opponent.getName() + " failed!");
	    System.out.println();
	} // end else
    }

    protected void subtractHitPoints(DungeonCharacter opponent, DungeonCharacter attacker, int damageRecieved)
    {
	if (opponent.getHitPoints() < 0)
	    System.out.println("Hitpoint amount must be positive.");
	else if (opponent.getHitPoints() > 0)
	{
	    opponent.subtractHitPoints(opponent.getHitPoints() - damageRecieved);
	    if (opponent.getHitPoints() < 0)
		opponent.subtractHitPoints(0);
	    System.out.println(opponent.getName() + " hit " + " for <" + damageRecieved + "> points damage.");
	    System.out.println(attacker.getName() + " now has " + attacker.getHitPoints() + " hit points remaining.");
	    System.out.println();
	} // end else if

	if (opponent.getHitPoints() == 0)
	    System.out.println(opponent.getName() + " has been killed :-(");

    }// end method

}
