package dungeon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FreezingTouchTest
{

    Attack test;
    @Test
    void testFreezingTouch()
    {
	test = new FreezingTouch();
		
		assertEquals("begins freezing", test.getAttack());
		assertEquals(20, test.getMinDamage());
		assertEquals(30, test.getMaxDamage()); 
		assertEquals(.8, test.getChanceToHit(), 0.1);

    }
}
