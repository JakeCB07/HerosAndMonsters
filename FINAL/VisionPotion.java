
public class VisionPotion extends Item {
	private static String description = "A potion that allows you to see the contents of adjacent rooms.";
	private static String potionName = "Potion of Seeing";
	
	private static char VisionPotionSymbol='H';
	
	VisionPotion() {
		
		super(description, potionName);
	}

	public static  char getHealingSymbol() {
		return VisionPotionSymbol;
	}

	public static void use(Hero hero) {
		System.out.println(hero.getName() + " used a " + potionName);
		System.out.println(Dungeon.printSurroundingArea(hero));
		hero.removeVisionPot(hero);
	}

	public static void addToInventory(Hero hero) {
		hero.visionPotCount++;
		System.out.println(hero.name + " put the " + potionName + " in thier bag");
	}
}
