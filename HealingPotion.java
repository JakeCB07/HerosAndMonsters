


public class HealingPotion extends Item{
	protected HealBehavior healBehavior;
	protected int minHeal;
	protected int maxHeal;

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
	public void use(Hero character, int index) {
		healBehavior.heal(character, minHeal, maxHeal);
		character.inventory.remove(index);
		System.out.println(character.name + " used a " + potionName);
	}

	public void addToInventory(Hero character) {
		character.inventory.add(new HealingPotion());
		System.out.println(character.name + " put the " + potionName + " in thier bag");
		
	}
	

}
