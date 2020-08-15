package dungeon;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

class CrushingBlowTest
{
    CrushingBlow test;
    @Test
	void testCrushingBlow() {
		test = new CrushingBlow();
		
		assertEquals("goes for a Crushing Blow against", test.getAttack());
		assertEquals(100, test.getMinDamage());
		assertEquals(175, test.getMaxDamage()); 
		assertEquals(0.4, test.getChanceToHit(), 0.1);
		
		
	}

    
}


