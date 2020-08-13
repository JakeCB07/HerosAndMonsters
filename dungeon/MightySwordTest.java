package dungeon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MightySwordTest
{

    Attack test;
    @Test
    void testMightySword()
    {
	test = new MightySword();
		
		assertEquals("swings thier Mighty Sword at", test.getAttack());
		assertEquals(35, test.getMinDamage());
		assertEquals(60, test.getMaxDamage()); 
		assertEquals(.8, test.getChanceToHit(), 0);

    }
}
