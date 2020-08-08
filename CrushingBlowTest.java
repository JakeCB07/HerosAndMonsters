package dungeon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CrushingBlowTest {

	Attack test;
	
	
	@Test
	void testCushingBlow() {
		test = new CrushingBlow(test.getAttack(), test.getMinDamage() ,test.getMaxDamage(),test.getChanceToHit());
	
		assertEquals("goes for a Crushing Blow against", .4, 100, 175); //TODO maybe use variables instead 
		
	}

	
}
