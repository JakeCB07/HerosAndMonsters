
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
	public void use(Hero character, int index) {
		
		System.out.println(character.name + " cannot use " +PillarName4);
	}

	public void addToInventory(Hero character) {
		character.inventory.add(new HealingPotion());
		System.out.println(character.name + " put the " + PillarName4 + " in thier bag");
	}

}
