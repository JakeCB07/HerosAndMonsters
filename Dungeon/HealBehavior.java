package Dungeon;

public interface HealBehavior {
	public void heal(DungeonCharacter character, int minHeal, int maxHeal, int maxHitPoints);
}
