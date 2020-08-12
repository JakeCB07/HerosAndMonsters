package Dungeon;

interface iDungeonCharacter
{

    abstract String getName();

    abstract int getHitPoints();

    abstract int getAttackSpeed();

    abstract AttackBehavior getAttackBehavior();

    interface iMonster
    {
	abstract void attack(DungeonCharacter opponent, DungeonCharacter attacker);

	abstract double getChanceToHeal();

	abstract boolean isAlive();

	abstract void subtractHitPoints(DungeonCharacter opponent, DungeonCharacter attacker);

    }

    interface iHero
    {
	abstract void attack(DungeonCharacter opponent, DungeonCharacter attacker);

	abstract AttackBehavior getSpecialAttack();

	String getName();

	abstract boolean isAlive();

	abstract void subtractHitPoints(DungeonCharacter opponent, DungeonCharacter attacker);

    }

}
