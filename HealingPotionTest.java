package dungeon;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

class HealingPotionTest
{

    Hero test;
    HealingPotion testPotion;
     
     @Test
     void testHealingPotion()
     {
 	test = new Warrior();
 	testPotion = new HealingPotion();
 	assertEquals("A Potion that heals 5 to 15 HP when consumed.", testPotion.getDescription());
 	assertEquals("Healing Potion", testPotion.getPotionName());
 	assertEquals('H', testPotion.getPotionSymbol());

     }
     
     

}