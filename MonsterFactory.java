
public class MonsterFactory {
public static Monster createMonster(int choice) {
		
		if(choice == 1)
			return new Ogre();
		if(choice == 2)
			return new Gremlin();
		if(choice == 3)
			return new Skeleton();
		if(choice==4)
			return new EvilTexasGoblin();
		if(choice==5)
			return new blueBerryDragon();
		return null;
	}
}
