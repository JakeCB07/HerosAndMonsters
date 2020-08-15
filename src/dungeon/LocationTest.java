package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LocationTest
{

    // TODO not quite finished with this test
    Location test;

    @BeforeEach
    public void setUp()
    {
	test = new Location(0, 0);

    }

    @Test
    void testLocation()
    {
	Location l1 = new Location(5, 5); // test standard

	Location l3 = new Location(0, 0); // testing reset to home location
	Location l4 = new Location(-7, 8); // testing x negative
	Location l5 = new Location(-5, -5); // testing double negative standard size

	assertEquals(5, l1.getX());
	assertEquals(5, l1.getY());

	Location l2 = new Location(10, 10); // test larger
	assertEquals(10, l2.getX());
	assertEquals(10, l2.getY());

	assertEquals(0, l3.getX());
	assertEquals(0, l3.getY());

	test = new Location(l1.getX(), l4.getY());

	assertEquals(5, test.getX());
	assertEquals(8, test.getY());

	assertEquals(-7, l4.getX());
	assertEquals(8, l4.getY());

	test = new Location(-6, -9);

	assertEquals(-6, test.getX());
	assertEquals(-9, test.getY());

	assertEquals(-5, l5.getX());
	assertEquals(-5, l5.getY());

    }

    @Test
    void testMoveNorth()
    {
	test = new Location(3, 2);

	test.moveNorth();

	assertEquals(3, test.getX());
	assertEquals(1, test.getY());
	test.moveNorth();
	assertEquals(3, test.getX());
	assertEquals(0, test.getY());
	test.moveNorth();
	// assertEquals("I'm stuck at the top of the map", test.getY());
	assertEquals(3, test.getX());
	assertEquals(0, test.getY());

    }

    @Test
    void testLocationMoveSouth()
    {
	test = new Location(1, 1);
	test.moveSouth();
	assertEquals(1, test.getX());
	assertEquals(2, test.getY());

	test.moveSouth();
	assertEquals(1, test.getX());
	assertEquals(3, test.getY());
	test.moveSouth();
	assertEquals(1, test.getX());
	assertEquals(4, test.getY());
	test.moveSouth();
	// assertEquals("I'm at the bottom of the map", test.getY());
	assertEquals(1, test.getX());
	assertEquals(4, test.getY());

    }

    @Test
    void testLocationMoveEast()
    {
	test = new Location(1, 1);
	test.moveEast();
	assertEquals(2, test.getX());
	assertEquals(1, test.getY());

	test.moveEast(); // puts us at the most southern point
	assertEquals(3, test.getX());
	assertEquals(1, test.getY());

	test.moveEast();
	assertEquals(4, test.getX());
	assertEquals(1, test.getY());
	test.moveEast();
	// assertEquals("I'm as far east as I can go", test.getX());

	assertEquals(4, test.getX());
	assertEquals(1, test.getY());

    }

    @Test
    void testMoveWest()
    {
	test = new Location(1, 1);
	test.moveWest();
	assertEquals(0, test.getX());
	assertEquals(1, test.getY());

	test.moveWest();
	assertEquals(0, test.getX());
	assertEquals(1, test.getY());

    }
    
    @Test
    void testSouthEastCombos()
    {
	test = new Location(2, 2);
	test.moveSouth();
	test.moveEast();
	
	assertEquals(3 ,test.getX());
	assertEquals(3, test.getY());
	
	test.moveSouth();
	test.moveEast();
	
	assertEquals(4, test.getX());
	assertEquals(4, test.getY());
	
	test.moveSouth();
	test.moveEast();
	
	assertEquals(4, test.getX());
	assertEquals(4, test.getY());
	
    }
    
    @Test
    void testNorthEastCombos()
    {
	test = new Location(2, 2);
	test.moveNorth();
	test.moveEast();
	
	assertEquals(3 ,test.getX());
	assertEquals(1, test.getY());
	
	test.moveNorth();
	test.moveEast();
	
	assertEquals(4, test.getX());
	assertEquals(0, test.getY());
	
	test.moveNorth();
	test.moveEast();
	
	assertEquals(4, test.getX());
	assertEquals(0, test.getY());
	
    }
    
    
    @Test
    void testSouthWestCombos()
    {
	test = new Location(2, 2);
	test.moveSouth();
	test.moveWest();
	
	assertEquals(1 ,test.getX());
	assertEquals(3, test.getY());
	
	test.moveSouth();
	test.moveWest();
	
	assertEquals(0, test.getX());
	assertEquals(4, test.getY());
	
	test.moveSouth();
	test.moveWest();
	
	assertEquals(0, test.getX());
	assertEquals(4, test.getY());
	
    }
    
    
    @Test
    void testNorthWestCombos()
    {
	test = new Location(2, 2);
	test.moveNorth();
	test.moveWest();
	
	assertEquals(1 ,test.getX());
	assertEquals(1, test.getY());
	
	test.moveNorth();
	test.moveWest();
	
	assertEquals(0, test.getX());
	assertEquals(0, test.getY());
	
	test.moveNorth();
	test.moveWest();
	
	assertEquals(0, test.getX());
	assertEquals(0, test.getY());
	
    }
    
    

}