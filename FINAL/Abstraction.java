<<<<<<< HEAD

public class Abstraction extends Item {
	   private static String PillarName3="Pillar of Abstraction";
	    private static String PillarDescription3="ONE OF THE 4 PILLARS OF OO!!!";
		private static char AbstractionSymbol='A';
		Abstraction() {
			super(PillarName3, PillarDescription3);
			
		}
		public static char getAbstractionSymbol() {
			return AbstractionSymbol;
		}

		public static void addToInventory(Hero character) {
			System.out.println(PillarDescription3);
			character.addPillar(character);
			System.out.println(character.name + " put the " + PillarName3 + " in thier bag");
		}

=======

public class Abstraction extends Item {
	   private static String PillarName3="Pillar of Abstraction";
	    private static String PillarDescription3="ONE OF THE 4 PILLARS OF OO!!!";
		private static char AbstractionSymbol='A';
		Abstraction() {
			super(PillarName3, PillarDescription3);
			
		}
		public static char getAbstractionSymbol() {
			return AbstractionSymbol;
		}

		public static void addToInventory(Hero character) {
			System.out.println(PillarDescription3);
			character.addPillar(character);
			System.out.println(character.name + " put the " + PillarName3 + " in thier bag");
		}

>>>>>>> b10c09556709c7e5eb86065fd895458b5cd7fa91
}