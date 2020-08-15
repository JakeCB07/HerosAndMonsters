package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ShatterTest
{

    Attack test;

    @Test
    void testShatter()
    {
	test = new Shatter(1);

	assertEquals("begins freezing", test.getAttack());
	assertEquals(20, test.getMinDamage());
	assertEquals(30, test.getMaxDamage());
	assertEquals(.8, test.getChanceToHit(), 0);

	test = new Shatter(5);
	assertEquals("begins freezing", test.getAttack());
	assertEquals(100, test.getMinDamage());
	assertEquals(150, test.getMaxDamage());
	assertEquals(.8, test.getChanceToHit(), 0);
	
		
    }

}
