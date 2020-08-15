package dungeon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FireboltTest
{

    Attack test;
    @Test
    void testFirebolt()
    {
	test = new Firebolt();
		
		assertEquals("shoots a firebolt at", test.getAttack());
		assertEquals(30, test.getMinDamage());
		assertEquals(55, test.getMaxDamage()); 
		assertEquals(.7, test.getChanceToHit(), 0.1);

    }

}
