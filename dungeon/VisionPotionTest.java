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
	assertEquals("A potion that allows you to see the contents of adjacent rooms.", testPotion.getDescription());
	assertEquals("Potion of Seeing", testPotion.getPotionName());
	assertEquals('V', testPotion.getPotionSymbol());

    }

    @Test
    void testUse()
    {
	test = new Warrior();
	testPotion = new VisionPotion();

	test.visionPotCount = 2;
	testPotion.use(test);
	assertEquals(1, test.visionPotCount);
	
	testPotion.use(test);
	assertEquals(0, test.visionPotCount);
	assertEquals(Dungeon.printSurroundingArea(test), Dungeon.getSurroundingArea(test));
		//TODO not sure what this should be for correct statement... the toSTring?
	
	
    }

    @Test
    void testAddToInventory()
    {
	test = new Warrior();
	testPotion = new VisionPotion();
	
	VisionPotion.addToInventory(test);
	assertEquals(1, test.visionPotCount);
	
	VisionPotion.addToInventory(test);
	assertEquals(2, test.visionPotCount);
	
    }

    

}
