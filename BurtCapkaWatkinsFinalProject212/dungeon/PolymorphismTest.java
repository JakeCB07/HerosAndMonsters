package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PolymorphismTest
{
          
       Polymorphism testPillar;

        @Test
        void testGetAbstractionSymbol()
        {
    	testPillar = new Polymorphism();
    	assertEquals('P', testPillar.getPolymorphismSymbol());
        }




}
