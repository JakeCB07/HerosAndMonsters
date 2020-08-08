package dungeon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AttackFactoryTest {

	@Test
	void testWoodenClub() {
		AttackBehavior woodenClubTest = new WoodenClub();
		assertEquals("slowly swings a Club at", .6, 30, 50 );
	}

	
	@Test
	void testShortBow() {
		AttackBehavior shortBowTest = new Shortbow();
		assertEquals("fires their Shortbow at", .8, 20, 40);
	}
	
	@Test
	void testRustyBlade() {
		AttackBehavior RustyBladeTest = new RustyBlade();
		assertEquals("slices their Rusty Blade at", .8, 30, 50 );
	}

	@Test
	void testMightySword() {
		AttackBehavior migthySwordTest = new MightySword();
		assertEquals("swings thier Mighty Sword at", .8, 35, 60 );
	}
	
	
}
