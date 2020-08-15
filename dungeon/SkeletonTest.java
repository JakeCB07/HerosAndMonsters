package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SkeletonTest
{

 Monster test;
    
    @Test
    void skeletonTest()
    {
	test = new Skeleton();
	assertEquals("Sargath the Skeleton", test.getName());
	assertEquals(100, test.getHitPoints());
	assertEquals(3, test.getAttackSpeed()); 
	assertEquals(0.1, test.getChanceToHeal(), 0.1);
	assertEquals(30, test.getMinHeal());
	assertEquals(50, test.getMaxHeal());
    }

}
