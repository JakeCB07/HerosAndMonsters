package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DungeonTest {

	Dungeon test;
	
	@BeforeEach
	public void setUp() 
	{
		test = new Dungeon(6,6);  //TODO adjust size of dungeon
	}
	
	@Test
	void testMakeMap() { //tests dungeon map creation
	
		Dungeon testRoom1 = new Dungeon(4, 4);	//test to have alternate to 5 size dungon1
		Dungeon testRoom2 = new Dungeon(8, -8); //test to have alternate to 5 size dungon, y negative
		Dungeon testRoom3 = new Dungeon(-5, -5); ////test to have alternate to 5 size dungon, x & y negative
		Dungeon testRoom4 = new Dungeon(-3, 8); //test to have alternate to 5 size dungon, x negative and x, y different sizes.

		assertEquals(4, testRoom1.getY());
		assertEquals(8, -8); 
		assertEquals(-5, -5); 
		assertEquals(-3, 8);
	}

	@Test
	void testPrintLocationHero()
	
	{
		
	test = room[hero.getPoint().getX()][hero.getPoint().getY()];
	}
	
	@Test
	void testLookAtMap()
	{
		
	}
	
}
