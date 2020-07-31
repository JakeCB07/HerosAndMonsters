
public abstract class HeroFactory extends CharacterFactory
{

    public Hero create(String name)
    {

	int choice;

	choice = (int) (Math.random() * 3) + 1;

	switch (choice)
	{
	case 1:
	    return createSorceress(Sorceress.getName(), Sorceress.getHitPoints(), Sorceress.getAttackSpeed(),
		    Sorceress.getAttackBehavior());

	case 2:
	    return createThief(Thief.getName(), Thief.getHitPoints(), Thief.getAttackSpeed(),
		    Thief.getAttackBehavior());

	case 3:
	    return createWarrior(Warrior.getName(), Warrior.getHitPoints(), Warrior.getAttackSpeed(),
		    Warrior.getAttackBehavior());

	default:
	    System.out.println("invalid choice, returning Skeleton");
	    return createWarrior(Warrior.getName(), Warrior.getHitPoints(), Warrior.getAttackSpeed(),
		    Warrior.getAttackBehavior());
	}// end switch
    }

    protected abstract Hero createSorceress(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior);

    protected abstract Hero createThief(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior);

    protected abstract Hero createWarrior(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior);
}
