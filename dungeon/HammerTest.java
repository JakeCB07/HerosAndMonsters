package dungeon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HammerTest
{

    Attack test;
    @Test
    void testHammer()
    {
	test = new Hammer();
		
		assertEquals("swings thier War Hammer at", test.getAttack());
		assertEquals(40, test.getMinDamage());
		assertEquals(65, test.getMaxDamage()); 
		assertEquals(.6, test.getChanceToHit(), 0.1);

    }
}
