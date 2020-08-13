package dungeon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShortbowTest
{

    Attack test;
    @Test
    void testShortbow()
    {
	test = new Shortbow();
		
		assertEquals("fires thier Shortbow at", test.getAttack());
		assertEquals(20, test.getMinDamage());
		assertEquals(40, test.getMaxDamage()); 
		assertEquals(.8, test.getChanceToHit(), 0);

    }

}
