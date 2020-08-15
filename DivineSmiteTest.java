package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivineSmiteTest
{

    DivineSmite test;
        @Test
    	void testCrushingBlow() {
    		test = new DivineSmite();
    		
    		assertEquals("brings down a Divine Light on top off", test.getAttack());
    		assertEquals(50, test.getMinDamage());
    		assertEquals(70, test.getMaxDamage()); 
    		assertEquals(0.5, test.getChanceToHit(), 0);
    		
    	
    	

        
        }


}
