
public class Polymorphism extends Item  {
	private static String PillarName1="Pillar of POLYMORPHISM";
    private static String PillarDescription1="ONE OF THE 4 PILLARS OF OO!!!";
	private static char PolyMorphismSymbol='p';
	Polymorphism() {
		super(PillarName1, PillarDescription1);
		
	}
	public static char getPolymorphismSymbol() {
		return PolyMorphismSymbol;
	}
	public void use(Hero character, int index) {
		
		System.out.println(character.name + " cannot use " +PillarName1);
	}

	public void addToInventory(Hero character) {
		character.inventory.add(new HealingPotion());
		System.out.println(character.name + " put the " + PillarName1 + " in thier bag");
	}


}
