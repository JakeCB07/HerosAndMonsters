package dungeon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WarriorTest
{
    Hero test = new Warrior();
   

    @Test
    void testGotHitANDDefendTest()
    {	
	test.setHitPoints(5);
	
	
	test.gotHit(test);
	
	if(test.defend())
	{
	assertEquals(5, test.getHitPoints());
	}
	
	else
	    assertEquals(0, test.getHitPoints());
    }

       @Test
    void testAddHealingPot()
    {
	test.healingPotCount = 3; 
	test.removeHealingPot(test);
	assertEquals(2, test.getHealingPotCount());
    }

    @Test
    void testAddVisionPot()
    {
	test.visionPotCount = 3; 
	test.addVisionPot(test);
	assertEquals(4, test.getVisionPotCount());
    }

    @Test
    void testAddPillar()
    {
	test.pillarCount = 0; 
	test.addPillar(test);
	assertEquals(1, test.getPillarCount());
    }

    @Test
    void testRemoveHealingPot()
    {
	test.healingPotCount = 3; 
	test.removeHealingPot(test);
	assertEquals(2, test.getHealingPotCount());
    }

    @Test
    void testRemoveVisionPot()
    {
	test.visionPotCount = 3; 
	test.removeVisionPot(test);
	assertEquals(2, test.getVisionPotCount());
    }

    public void updateHero()
	{
	   test.printInventory(test);
	    
	}

  
   

}
