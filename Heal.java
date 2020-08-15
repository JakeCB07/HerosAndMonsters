package dungeon;

public class Heal implements HealBehavior {

	public void heal(DungeonCharacter character, int minHeal, int maxHeal) {

		if(character.getHitPoints() == character.getMaxHitPoints())
			System.out.println(character.getName() + " is already at full HP.");
		if (character.getHitPoints() < character.getMaxHitPoints()) {
			int healPoints = (int) (Math.random() * (maxHeal - minHeal + 1)) + minHeal;
			addHitPoints(character, healPoints);
			System.out.println(character.getName() + " regenerated " + healPoints + " hit points.\n"
					+ "Total hit points remaining are: " + character.getHitPoints() + "/"
					+ character.getMaxHitPoints());
			System.out.println();
		}
	}

	private void addHitPoints(DungeonCharacter character, int hitPointsHealed) {
		if (character.getHitPoints() <= 0)
			System.out.println("Hitpoint amount must be positive.");
		else {
			int newTotal = character.getHitPoints() + hitPointsHealed;
			if (newTotal > character.getMaxHitPoints()) {
				newTotal = character.getMaxHitPoints();
			}
			character.setHitPoints(newTotal);
		}
	}

	
	
}
