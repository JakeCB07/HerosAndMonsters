package Dungeon;

public interface HeroInterface
{
    
    abstract String getName();

    abstract int getHitPoints();

    abstract int getAttackSpeed();

    abstract AttackBehavior getAttackBehavior();
    
    abstract AttackBehavior attack(DungeonCharacter opponent, DungeonCharacter attacker);

    abstract double getChanceToBlock();
    
    abstract void battleChoices(DungeonCharacter opponent, DungeonCharacter attacker);
    
    

    boolean isAlive();
}
