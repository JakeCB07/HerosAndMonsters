package dungeon;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

class ShortbowTest
{

    Attack test;
    @Test
    void testShortbow()
    {
	test = new Shortbow();
		
		assertEquals("fires their Shortbow at", test.getAttack());
		assertEquals(20, test.getMinDamage());
		assertEquals(40, test.getMaxDamage()); 
		assertEquals(.8, test.getChanceToHit(), 0);

    }

}
