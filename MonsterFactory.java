package dungeon;

public class MonsterFactory
{

    public static Ogre createOgre()
    {
	return new Ogre();
    }

    public static Gremlin createGremlin()
    {
	return new Gremlin();
    }

    public static Skeleton createSkeleton()
    {
	return new Skeleton();
    }

}