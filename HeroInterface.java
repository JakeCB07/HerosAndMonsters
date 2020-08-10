
public interface HeroInterface
{

    abstract String getName();

    abstract int getHitPoints();

    abstract int getAttackSpeed();

    abstract AttackBehavior getAttackBehavior();

    abstract boolean isAlive();

    abstract double getChanceToBlock();

}
