package dungeonController;

import dungeonModel.DungeonCharacter;

public interface AttackBehavior {
	
    public void attack(DungeonCharacter opponent, DungeonCharacter attacker);

	
}
