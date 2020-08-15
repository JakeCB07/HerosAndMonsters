package dungeon;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

class BlueBerryDragonTest
{

    Monster test;

    @Test
    void testBlueBerryDragonTest()
    {
	test = new BlueBerryDragon();
	assertEquals("Bubbles the Blueberry Dragon ", test.getName());
	assertEquals(300, test.getHitPoints());
	assertEquals(2, test.getAttackSpeed());
	assertEquals(20, test.getMinHeal());
	assertEquals(55, test.getMaxHeal());

    }

}
