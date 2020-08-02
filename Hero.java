
public class Hero extends DungeonCharacter {
    

	private int numTurns;
	
	public Hero(String name, int hitPoints, int attackSpeed, double chanceToHit, int damageMin, int damageMax,
			 int numTurns, double chanceToBlock, AttackBehavior attack) {
		super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, chanceToBlock, numTurns, attack);
	}
	

	public void subtractHitPoints(DungeonCharacter opponent) {
		opponent.getAttackBehavior().attack(opponent, this);
	}
	public void battleChoices(DungeonCharacter opponent)
	{
	    numTurns = getAttackSpeed()/opponent.getAttackSpeed();

		if (getNumTurns() < 0)
			setTurns(1);

		System.out.println("Number of turns this round is: " + getNumTurns());

	}
	
}
