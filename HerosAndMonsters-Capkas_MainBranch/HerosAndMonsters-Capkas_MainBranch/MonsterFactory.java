

public abstract class MonsterFactory implements CharacterFactory<Monster>
    {
    


	@Override
	public Monster create(String name)
	{

		int choice;

		choice = (int)(Math.random() * 3) + 1;

		switch(choice)
		{
			case 1: return createOgre(Ogre.getName(), Ogre.getHitPoints(), Ogre.getAttackSpeed(), Ogre.getAttackBehavior());

			case 2: return createGremlin(Gremlin.getName(), Gremlin.getHitPoints(), Gremlin.getAttackSpeed(), Gremlin.getAttackBehavior());

			case 3: return createSkeleton(Skeleton.getName(), Skeleton.getHitPoints(), Skeleton.getAttackSpeed(), Skeleton.getAttackBehavior());

			default: System.out.println("invalid choice, returning Skeleton");
				     return createSkeleton(Skeleton.getName(), Skeleton.getHitPoints(), Skeleton.getAttackSpeed(), Skeleton.getAttackBehavior());
		}//end switch
	}

	protected abstract Monster createOgre(String name, int hitPoints, int attackSpeed,
		AttackBehavior attackBehavior);

	protected abstract Monster createGremlin(String name, int hitPoints, int attackSpeed,
		AttackBehavior attackBehavior);

	protected abstract Monster createSkeleton(String name, int hitPoints, int attackSpeed,
		AttackBehavior attackBehavior);

	
	
	
	        
    
}
