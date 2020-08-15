package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AttackTest
{
    Attack test;
	
    @Test
	void testAttack() 
    {
	test = new Attack("attacking", 3, 6, 1.0);
	    assertEquals("attacking", test.attack);
	    assertEquals(3, test.minDamage);
	    assertEquals(6, test.maxDamage);
	    assertEquals(1.0, test.chanceToHit);
	    
	     Attack a1 = new Attack("I am attacking", 4, 6, .8);
	  
	   
	  test = a1;
	  assertEquals("I am attacking" , a1.attack);
	  assertEquals(4, a1.minDamage);
	  assertEquals(6, a1.maxDamage);
	  assertEquals(.8, a1.chanceToHit);
	  
	
	}	

  
}
