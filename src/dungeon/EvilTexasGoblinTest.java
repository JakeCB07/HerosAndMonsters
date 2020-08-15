package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvilTexasGoblinTest
{

    Monster test;
    
    @Test
    void testEvilTexasGoblin()
    {
	test = new EvilTexasGoblin();
	assertEquals("Boby texas goblin", test.getName());
	assertEquals(150, test.getHitPoints());
	assertEquals(2, test.getAttackSpeed()); 
	assertEquals(.2, test.getChanceToHeal(), 0.2);
	
	assertEquals(15, test.getMinHeal());
	assertEquals(25, test.getMaxHeal());
    }
   

}


