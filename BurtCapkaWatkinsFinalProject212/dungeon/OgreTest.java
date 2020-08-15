package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OgreTest
{
    Monster test;
    
   @Test
   void ogreTest()
   {
	test = new Ogre();
	assertEquals("Oscar the Ogre", test.getName());
	assertEquals(200, test.getHitPoints());
	assertEquals(2, test.getAttackSpeed()); 
	assertEquals(0.1, test.getChanceToHeal(), 0.1);
	assertEquals(30, test.getMinHeal());
	assertEquals(50, test.getMaxHeal());
    }

}
