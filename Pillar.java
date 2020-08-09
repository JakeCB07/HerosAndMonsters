
public class Pillar extends Item {
	
	private static String name = "Pillar of OO";
	private static String description = "It glows with power.";
	
	Pillar(){
		super(name, description);
	}
	
	public static void use(Hero character) {
		System.out.println("It glows with power.");
	}

	public static void addToInventory(Hero character) {
		character.pillarCount++;
	}

}
