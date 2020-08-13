package dungeon;

public class MonsterFactory {
public static Monster createMonster(int choice) {
		
		if(choice == 1)
			return new Ogre();
		if(choice == 2)
			return new Gremlin();
		if(choice == 3)
			return new Skeleton();
		
		return null;
	}
}
