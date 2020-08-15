package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AbstractionTest
{
   
    Abstraction testPillar;

    @Test
    void testGetAbstractionSymbol()
    {
	testPillar = new Abstraction();
	assertEquals('A', testPillar.getAbstractionSymbol());
    }

}
