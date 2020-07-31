
/**
 * Title: DungeonCharacter.java
 *
 * Description: Abstract Base class for inheritance hierarchy for a role playing
 * game
 *
 * class variables (all will be directly accessible from derived classes): name
 * (name of character) hitPoints (points of damage a character can take before
 * killed) attackSpeed (how fast the character can attack) chanceToHit (chance
 * an attack will strike the opponent) damageMin, damageMax (range of damage the
 * character can inflict on opponent)
 *
 * class methods (all are directly accessible by derived classes):
 * DungeonCharacter(String name, int hitPoints, int attackSpeed, double
 * chanceToHit, int damageMin, int damageMax) public String getName() public int
 * getHitPoints() public int getAttackSpeed() public void addHitPoints(int
 * hitPoints) public void subtractHitPoints(int hitPoints) -- this method will
 * be overridden public boolean isAlive() public void attack(DungeonCharacter
 * opponent) -- this method will be overridden
 *
 * Copyright: Copyright (c) 2001 Company:
 * 
 * @author
 * @version 1.0
 * @param <AttackBehavior>
 */

interface DungeonCharacterInterface
{

    abstract String getName();

    abstract int getHitPoints();

    abstract int getAttackSpeed();

    abstract AttackBehavior getAttackBehavior();

    abstract boolean isAlive();

    abstract void subtactHitPoints(DungeonCharacter opponent); // TODO these two may be the same

    interface MonsterInterface
    {
	abstract void attack(DungeonCharacter opponent, DungeonCharacter attacker);

	abstract double getChanceToHeal();

    }

    interface HeroInterface
    {
	void attack(DungeonCharacter opponent, DungeonCharacter attacker);

	abstract AttackBehavior getSpecialAttack();

    }

}// end class DungeonCharacter interface
