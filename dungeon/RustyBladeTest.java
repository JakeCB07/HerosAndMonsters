package dungeon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RustyBladeTest
{

    Attack test;
    @Test
    void testRustyBlade()
    {
	test = new RustyBlade();
		
		assertEquals("slices thier Rusty Blade at", test.getAttack());
		assertEquals(30, test.getMinDamage());
		assertEquals(50, test.getMaxDamage()); 
		assertEquals(.8, test.getChanceToHit(), 0);

    }
}
