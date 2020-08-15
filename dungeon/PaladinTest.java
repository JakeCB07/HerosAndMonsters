package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PaladinTest
{
    Hero test = new Paladin();
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
    

 

}
