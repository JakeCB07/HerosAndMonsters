package dungeon;

public class HealingPotion extends Item{
	protected static HealBehavior healBehavior = new Heal();
	protected static int minHeal = 5;
	protected static int maxHeal = 15;

	private static char HealingPotionSymbol='H';
	private static String potionName = "Healing Potion";
	private static String potionDescription = "A Potion that heals 5 to 15 HP when consumed.";
	
	HealingPotion(){
		super(potionDescription, potionDescription, HealingPotionSymbol);
	}
	
	public static  char getHealingSymbol() {
		return HealingPotionSymbol;
	}
	public static void use(Hero character) {
		System.out.println(character.getName() + " used a " + potionName);
		healBehavior.heal(character, minHeal, maxHeal);
		character.removeHealingPot(character);
		
	}

	public static void addToInventory(Hero character) {
		character.addHealingPot(character);
		System.out.println(character.getName() + " put the " + potionName + " in thier bag");
		
	}
	

}


