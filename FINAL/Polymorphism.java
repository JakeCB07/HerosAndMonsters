<<<<<<< HEAD
public class Polymorphism extends Item  {
	private static String PillarName1="Pillar of POLYMORPHISM";
    private static String PillarDescription1="ONE OF THE 4 PILLARS OF OO!!!";
	private static char PolyMorphismSymbol='P';
	Polymorphism() {
		super(PillarName1, PillarDescription1);
		
	}
	public static char getPolymorphismSymbol() {
		return PolyMorphismSymbol;
	}

	public static void addToInventory(Hero character) {
		System.out.println(PillarDescription1);
		character.addPillar(character);
		System.out.println(character.name + " put the " + PillarName1 + " in thier bag");
	}


=======
public class Polymorphism extends Item  {
	private static String PillarName1="Pillar of POLYMORPHISM";
    private static String PillarDescription1="ONE OF THE 4 PILLARS OF OO!!!";
	private static char PolyMorphismSymbol='P';
	Polymorphism() {
		super(PillarName1, PillarDescription1);
		
	}
	public static char getPolymorphismSymbol() {
		return PolyMorphismSymbol;
	}

	public static void addToInventory(Hero character) {
		System.out.println(PillarDescription1);
		character.addPillar(character);
		System.out.println(character.name + " put the " + PillarName1 + " in thier bag");
	}


>>>>>>> b10c09556709c7e5eb86065fd895458b5cd7fa91
}