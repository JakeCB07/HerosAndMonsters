package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DungeonAdventureTest {

	Hero test;
	
	@Test
	void testChooseHero() {
		Hero testWarrior = new Warrior();
		Hero testSorceress = new Sorceress();
		Hero testThief = new Thief();
		Hero testPaladin = new Paladin();
		
		assertEquals(testWarrior.getName(), testWarrior.getHitPoints());
		assertEquals(testSorceress.getName(), testSorceress.getHitPoints());
		assertEquals(testThief.getName(), testThief.getHitPoints());
		assertEquals(testPaladin.getName(), testPaladin.getHitPoints());
		
		
	}

}
