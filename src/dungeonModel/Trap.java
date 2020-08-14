package dungeonModel;

import dungeonController.Attack;

public class Trap extends Attack {
	
	private static String attack = "has encountered a pitfall trap.";
	private static double chanceToHit = .5;
private static int minDamage = 1;
private static int maxDamage = 20; 
private static char TrapSymbol='T';

	

public void attack(DungeonCharacter opponent)
{
	boolean canAttack;
	int damage;

	System.out.println(opponent.getName() + " " + attack);
	canAttack = Math.random() <= chanceToHit;

	if (canAttack)
	{
	    damage = (int) (Math.random() * (maxDamage - minDamage + 1)) + minDamage;
	    subtractHitPoints(opponent, damage);

	    System.out.println();
	} // end if can attack
	else
	{

	    System.out.println(opponent.getName() + " avoided the trap!");
	    System.out.println();
	} // end else
}
public static char getTrapSymbol() {
	return TrapSymbol;
}

	public Trap() {
		super(attack, minDamage, maxDamage, chanceToHit);
		// TODO Auto-generated constructor stub
	}

}