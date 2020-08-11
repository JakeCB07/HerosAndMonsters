
public class Inheritance extends Item {
    private static String PillarName4="Pillar of INHERITANCE";
    private static String PillarDescription4="ONE OF THE 4 PILLARS OF OO!!!";
	private static char InheritanceSymbol='I';
	Inheritance() {
		super(PillarName4, PillarDescription4);
		
	}
	public static char getInheritanceSymbol() {
		return InheritanceSymbol;
	}
	public static void use(Hero character, int index) {
		
		System.out.println(PillarDescription4);
	}

	public static void addToInventory(Hero character) {
		System.out.println(PillarDescription4);
		character.addPillar(character);
		System.out.println(character.name + " put the " + PillarName4 + " in thier bag");
	}

}
