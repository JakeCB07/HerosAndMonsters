package dungeon;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

class RustyBladeTest
{
    Attack test;
    @Test
    void RustyBladetest()
    {
	test = new RustyBlade();
	assertEquals("slices their Rusty Blade at", test.getAttack());
	assertEquals(30, test.getMinDamage());
	assertEquals(50, test.getMaxDamage());
	assertEquals(.8, test.getChanceToHit(), 0);
    }

}
