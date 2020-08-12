package Dungeon;


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

    public static Monster createMonster(int choice)
	{
		 choice = 0;
		
		Monster selectedMonster;
		do {
			choice = (int)(Math.random() * 3) + 1;
			
			selectedMonster = MonsterFactory.createMonster(choice);
		}while(choice < 1 || choice > 3);
		
		return selectedMonster;
	
   
   	}
    
}