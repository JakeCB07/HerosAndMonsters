package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


    class TrapTest
    {
        Trap test;

        @Test
        void testTrap()
        {
    	test = new Trap();

    	assertEquals("has encountered a pitfall trap.", test.getAttack());
    	assertEquals(1, test.getMinDamage());
    	assertEquals(20, test.getMaxDamage());
    	assertEquals(.5, test.getChanceToHit(), 0);
    	assertEquals('T', test.getTrapSymbol());

     }

    
}
