package dungeon;

public abstract class Attack  implements AttackBehavior {
	
	protected String attack;
	protected int minDamage;
	protected int maxDamage;
	protected double chanceToHit;
	
	protected Attack(String attack, int minDamage, int maxDamage, double chanceToHit){
		
		this.attack = attack;
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.chanceToHit = chanceToHit;
	}
	
	@Override
	public void attack(DungeonCharacter opponent, DungeonCharacter attacker) {
		boolean canAttack;
		int damage;

		System.out.println(attacker.getName() + " " + attack + " " + opponent.getName());
		canAttack = Math.random() <= chanceToHit;

		if (canAttack)
		{
			damage = (int)(Math.random() * (maxDamage - minDamage + 1)) + minDamage;
			subtractHitPoints(opponent, damage);



			System.out.println();
		}
		else
		{

			System.out.println(attacker.getName() + "'s attack on " + opponent.getName() +
								" failed!");
			System.out.println();
		}
	}
	
	protected void subtractHitPoints(DungeonCharacter opponent, int damageRecieved)
	{
		if (opponent.getHitPoints() <0)
			System.out.println("Hitpoint amount must be positive.");
		else if (opponent.getHitPoints() >0)
		{
			int newTotal = opponent.getHitPoints() - damageRecieved;
			opponent.setHitPoints(newTotal); 
			//-= damageRecieved;
			if (opponent.getHitPoints() < 0)
				opponent.setHitPoints(0);
			System.out.println(opponent.getName() + " hit " +
								" for <" + damageRecieved + "> points damage.");
			System.out.println(opponent.getName() + " now has " +
								opponent.getHitPoints() + " hit points remaining.");
			System.out.println();
		}//end else if

		if (opponent.getHitPoints() == 0)
			System.out.println(opponent.getName() + " has been killed :-(");

	}

	public String getAttack()
	{
	    
	    return attack;
	}

	public int getMinDamage()
	{
	    // TODO Auto-generated method stub
	    return minDamage;
	}

	public int getMaxDamage()
	{
	   
	    return maxDamage;
	}

	public double getChanceToHit()
	{
	   
	    return chanceToHit;
	}


	

}
