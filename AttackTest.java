package dungeon;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AttackTest {

	Attack test;
	
	@Test
	void testSubtractHitPoints()
	{
		test = new Attack(test.getAttack(), test.getMinDamage(), test.getMaxDamage(), test.getChanceToHit());
	
			assert(test.getHitPoints() - test.getDamageReceived());
		}
	
}
