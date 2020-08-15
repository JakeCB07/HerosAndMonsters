package dungeon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CowBoyHatTest
{
    Attack test;
    @Test
    void testCowBoyHat()
    {
	test = new CowBoyHat();
		
		assertEquals("rants about how everythings bigger in Texas to ", test.getAttack());
		assertEquals(5, test.getMinDamage());
		assertEquals(50, test.getMaxDamage()); 
		assertEquals(.3, test.getChanceToHit(), 0.1);

    }



}
