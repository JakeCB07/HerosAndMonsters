
public class Heal implements HealBehavior {
	
	public void heal(DungeonCharacter character, int minHeal, int maxHeal) {

		int healPoints = (int) (Math.random() * (maxHeal - minHeal + 1)) + minHeal;
		addHitPoints(character, healPoints);
		System.out.println(character.getName() + " regenerated " + healPoints + " hit points.\n"
				+ "Total hit points remaining are: " + character.getHitPoints());
		System.out.println();
	}

	private void addHitPoints(DungeonCharacter character, int hitPointsHealed) {
		if (character.getHitPoints() <= 0)
			System.out.println("Hitpoint amount must be positive.");
		else {
			int newTotal = character.getHitPoints() + hitPointsHealed;
			character.setHitPoints(newTotal);
		}
	}
}
