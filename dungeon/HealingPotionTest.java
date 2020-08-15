package dungeon;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

class HealingPotionTest
{

    Hero test;
    HealingPotion testPotion;
     
     @Test
     void testVisionPotion()
     {
 	test = new Warrior();
 	testPotion = new HealingPotion();
 	assertEquals("A Potion that heals 5 to 15 HP when consumed.", testPotion.getDescription());
 	assertEquals("Healing Potion", testPotion.getPotionName());
 	assertEquals('H', testPotion.getPotionSymbol());

     }

     @Test
     void testUse()
     {
 	test = new Warrior();
 	testPotion = new HealingPotion();

 	test.healingPotCount = 1;
 	testPotion.use(test);
 	assertEquals(0, test.healingPotCount);
 	
 
 	
 	
     }

     @Test
     void testAddToInventory()
     {
 	test = new Warrior();
 	testPotion = new HealingPotion();
 	
 	HealingPotion.addToInventory(test);
 	assertEquals(1, test.healingPotCount);
 	
 	HealingPotion.addToInventory(test);
 	assertEquals(2, test.healingPotCount);
 	
     }

}
