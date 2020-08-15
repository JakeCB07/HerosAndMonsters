package dungeon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BlueBerryBreathTest
{

    Attack test;
    @Test
    void testBlueBerryBreath()
    {
	test = new BlueBerryBreath();
		
		assertEquals(" uses his fierce Blueberry-Breath against ", test.getAttack());
		assertEquals(25, test.getMinDamage());
		assertEquals(55, test.getMaxDamage()); 
		assertEquals(.3, test.getChanceToHit(), 0.1);
		
    }

}


