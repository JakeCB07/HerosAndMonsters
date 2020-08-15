package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ItemTest
{
    Hero test;
    Encapsulation testPillar;
    VisionPotion vPotion;
    
  
    @Test
    void testAddToInventory()
    {
	test = new Warrior();
	
	test.addVisionPot(test);
	assertEquals(1, test.getVisionPotCount());
	test.addVisionPot(test);
	assertEquals(2, test.getVisionPotCount());
    }
    
}
