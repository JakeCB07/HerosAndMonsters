package dungeon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KrisTest
{

    Attack test;
    @Test
    void testKris()
    {
	test = new Kris();
		
		assertEquals("jabs thier Kris at", test.getAttack());
		assertEquals(15, test.getMinDamage());
		assertEquals(30, test.getMaxDamage()); 
		assertEquals(.8, test.getChanceToHit(), 0);

    }

}
