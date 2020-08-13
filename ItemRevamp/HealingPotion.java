


public class HealingPotion extends Item{
	protected static HealBehavior healBehavior;
	protected static int minHeal;
	protected static int maxHeal;

	private static char HealingPotionSymbol='H';
	private static String potionName = "Healing Potion";
	private static String potionDescription = "A Potion that heals 5 to 15 HP when consumed.";
	
	HealingPotion(){
		super(potionDescription, potionDescription);
		
		this.minHeal = 5;
		this.maxHeal = 15;
	}
	
	public static  char getHealingSymbol() {
		return HealingPotionSymbol;
	}
	public static void use(Hero character, int index) {
		System.out.println(character.name + " used a " + potionName);
		healBehavior.heal(character, minHeal, maxHeal);
		character.removeHealingPot(character);
	}

	public static void addToInventory(Hero character) {
		character.addHealingPot(character);
		System.out.println(character.name + " put the " + potionName + " in thier bag");
		
	}
	

}
