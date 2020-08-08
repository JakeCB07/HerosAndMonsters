package dungeon;


interface iDungeonCharacter
{

    abstract String getName();

    abstract int getHitPoints();

    

    abstract int getAttackSpeed();

    abstract AttackBehavior getAttackBehavior();

    abstract boolean isAlive();

    abstract void subtactHitPoints(DungeonCharacter opponent); // TODO these two may be the same

    interface iMonster
    {
	abstract void attack(DungeonCharacter opponent, DungeonCharacter attacker);

	abstract double getChanceToHeal();

    }

    interface iHero
    {
	abstract void attack(DungeonCharacter opponent, DungeonCharacter attacker);

	abstract AttackBehavior getSpecialAttack();

	String getName();

	

   
    }
    
}