package Dungeon;
public class HealingPotion extends Item implements HealBehavior
{
    protected static HealBehavior healBehavior;
    protected static int minHeal;
    protected static int maxHeal;
    protected static int maxHitPoints;
    private static String potionName = "Healing Potion";
    private static String potionDescription = "A Potion that heals 5 to 15 HP when consumed.";

    HealingPotion()
    {
	super(potionDescription, potionDescription);

	this.minHeal = 5;
	this.maxHeal = 15;
    }

    public static void use(DungeonCharacter character)
    {
	healBehavior.heal(character, minHeal, maxHeal, maxHitPoints);
	character.healingPotCount--; // TODO not reaching healingPot since declared at DungeonCharacter level but
				     // only Heros can use potions
	System.out.println(character.getName() + " used a " + potionName);
    }

    public static void addToInventory(Hero character)
    {
	character.healingPotCount++;
	System.out.println(character.getName() + " put the " + potionName + " in thier bag");
    }

    @Override
    public void heal(DungeonCharacter character, int minHeal, int maxHeal, int maxHitPoints)
    {
	if (character.getHitPoints() > maxHitPoints)
	    character.setHitPoints(maxHitPoints);
	int healPoints = increaseHitPoints(character);

	int currentHitPoints = character.getHitPoints() + healPoints;

	character.hitPoints = currentHitPoints;
    }

    public int increaseHitPoints(DungeonCharacter character)
    {
	int healPoints;

	healPoints = (int) (Math.random() * (maxHeal - minHeal + 1)) + minHeal;

	System.out.println(character.getName() + " added [" + healPoints + "] points.\n"
		+ "Total hit points remaining are: " + character.getHitPoints());
	System.out.println();
	return healPoints;
    }
}
