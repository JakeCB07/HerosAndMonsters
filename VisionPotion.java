package Dungeon;

public class VisionPotion extends Item {
	
	private static String description = "A potion that allows you to see the contents of adjacent rooms.";
	private static String potionName = "Potion of Seeing";
	
	
	VisionPotion() {
		super(description, potionName);
		// TODO Auto-generated constructor stub
	}


	public static void use(Hero character) {
		// TODO Auto-generated method stub
		
	}

	public static void addToInventory(Hero character) {
		character.visionPotCount++;
		System.out.println(character.getName() + " put the " + potionName + " in thier bag");
	}
	
	
	
}
