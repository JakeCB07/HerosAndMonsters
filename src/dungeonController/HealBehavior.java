package dungeonController;

import dungeonModel.DungeonCharacter;

public interface HealBehavior {
	public void heal(DungeonCharacter character, int minHeal, int maxHeal);
}
