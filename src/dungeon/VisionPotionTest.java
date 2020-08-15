package dungeon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VisionPotionTest
{
    
   Hero test;
   VisionPotion testPotion;
    
    @Test
    void testVisionPotion()
    {
	test = new Warrior();
	testPotion = new VisionPotion();
	assertEquals("A potion that allows you to see the contents of adjacent rooms.", testPotion.getPotionDescription());
	assertEquals("Potion of Seeing", testPotion.getPotionName());
	assertEquals('V', testPotion.getPotionSymbol());

    }

  

    

}
