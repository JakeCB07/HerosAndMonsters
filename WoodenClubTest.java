package dungeon;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class WoodenClubTest
{

        Attack test;
        @Test
    	void testWoodenClub() {
    		test = new WoodenClub();
    		
    		assertEquals("slowly swings a Club at", test.getAttack());
    		assertEquals(30, test.getMinDamage());
    		assertEquals(50, test.getMaxDamage()); 
    		assertEquals(.6, test.getChanceToHit(), 0);
    		
    		
    	}

        
  }
