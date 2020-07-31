
public class DungeonFactory {

public static Gremlin makeGremlin(String name, AttackBehavior attack) {
	if(name==null || attack==null) {
		throw new IllegalArgumentException("name and attack cannot be null");
	}
	return new Gremlin("gabe the goofy Gremlin", attack);
	
}
public static Skeleton makeSkeleton(String name, AttackBehavior attack) {
	if(name==null || attack==null) {
		throw new IllegalArgumentException("name and attack shall not be null");
	}
	return new Skeleton(name, attack);
}

public static Ogre makeOgre(String name, AttackBehavior attack) {
	if(name==null || attack==null) {
		throw new IllegalArgumentException("name and attack cannot be null");
	}
	return new Ogre(name, attack);
}
public static Warrior Warrior(String name, AttackBehavior attack) {
	if(name==null || attack==null) {
		throw new IllegalArgumentException("Name Shan't be null");
	}
	return new Warrior(name, attack);
}
public static Thief Thief(String name, AttackBehavior attack) {
	if(name==null || attack==null) {
		throw new IllegalArgumentException("Name and attack cant be null");
	}
	return new Thief(name, attack);
}
public static Sorceress makeSorceress(String name, AttackBehavior attack) {
	if(name==null || attack==null) {
		throw new IllegalArgumentException("Name and attack shan't be null");
	}
	return new Sorceress(name, attack);
		
}



}
