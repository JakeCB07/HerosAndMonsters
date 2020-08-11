
public class VisionPotion extends Item {
	
	private static String description = "A potion that allows you to see the contents of adjacent rooms.";
	private static String potionName = "Potion of Seeing";
	
	
	VisionPotion() {
		super(description, potionName);
		// TODO Auto-generated constructor stub
	}


	public static void use(Hero hero) {
		System.out.println(hero.getName() + " used a " + potionName);
		Dungeon.printSoundingArea(hero);
		hero.removeVisionPot(hero);
	}

	public static void addToInventory(Hero hero) {
		hero.addVisionPot(hero);
		System.out.println(hero.name + " put the " + potionName + " in thier bag");
	}
	
	
}
