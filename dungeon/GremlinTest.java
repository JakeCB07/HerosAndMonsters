package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GremlinTest
{

    Monster test;
    
    @Test
    void testGremlin()
    {
	test = new Gremlin();
	assertEquals("Gnarltooth the Gremlin", test.getName());
	assertEquals(70, test.getHitPoints());
	assertEquals(5, test.getAttackSpeed()); 
	assertEquals(.4, test.getChanceToHeal(), 0);
	assertEquals(new Kris(), test.getAttackBehavior());
	assertEquals(20, test.getMinHeal());
	assertEquals(40, test.getMaxHeal());
    }

    @Test
    void testAttack()
    {
	fail("Not yet implemented");
    }

    @Test
    void testMonster()
    {
	fail("Not yet implemented");
    }

    @Test
    void testHeal()
    {
	fail("Not yet implemented");
    }

    @Test
    void testSubtractHitPoints()
    {
	fail("Not yet implemented");
    }

}



