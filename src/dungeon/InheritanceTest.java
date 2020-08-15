package dungeon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InheritanceTest
{

        
        Inheritance testPillar;

        @Test
        void testGetAbstractionSymbol()
        {
    	testPillar = new Inheritance();
    	assertEquals('I', testPillar.getInheritanceSymbol());
        }

    


}
