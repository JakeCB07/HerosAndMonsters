
public class Encapsulation extends Item {
	private static String PillarName2="Pillar of Encapsulation";
    private static String PillarDescription2="ONE OF THE 4 PILLARS OF OO!!!";
	private static char EncapsulationSymbol='e';
	Encapsulation() {
		super(PillarName2, PillarDescription2);
		
	}
	public static char getEncapsulationSymbol() {
		return EncapsulationSymbol;
	}
	public void use(Hero character, int index) {
		
		System.out.println(PillarDescription2);
	}

	public static void addToInventory(Hero character) {
		System.out.println(PillarDescription2);
		character.addPillar(character);
		System.out.println(character.name + " put the " + PillarName2 + " in thier bag");
	}

}
