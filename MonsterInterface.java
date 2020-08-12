package Dungeon;

public interface MonsterInterface
{
    abstract String getName();

    abstract int getHitPoints();

    abstract int getAttackSpeed();

    abstract AttackBehavior getAttackBehavior();

    abstract boolean isAlive();

    abstract int getMinHeal();

    abstract int getMaxHeal();

   abstract int subtractHitPoints(int damageReceived);
}
