package dungeon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivineSmiteTest {

	DivineSmite test = new DivineSmite();
	
	@Test
	void testDivineSmite() {
		
			test = new DivineSmite(DivineSmite.getAttack(),  DivineSmite.getMinDamage() ,DivineSmite.getMaxDamage(), DivineSmite.getChanceToHit());
		
			assertEquals("brings down a Divine Light on top off", .4, 100, 175); //TODO maybe do variables instead 
			
		
	}

}