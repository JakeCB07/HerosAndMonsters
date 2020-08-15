package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulationTest
{
   
    Encapsulation testPillar;
   

    
    @Test
    void testGetEncapsulationSymbol()
    {
	
	testPillar = new Encapsulation();

	assertEquals('e', testPillar.getEncapsulationSymbol());
    }

}
