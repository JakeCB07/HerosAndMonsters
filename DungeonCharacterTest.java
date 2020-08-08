package dungeon;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DungeonCharacterTest {

	DungeonCharacter test;
	
	@BeforeEach
	public void setUp()    //TODO throws exception
	{
		test = new DungeonCharacter();
	}

	
	
	@Test 		//TODO still fleshing this one out
	public void testAddHitPoints()
	{
		DungeonCharacter c1 = new DungeonCharacter();
		c1 = new Sorceress(c1.getName(), 75, 5, null, .3); //TODO apass alla ctual stats
	}

	@Test
	public void testCreateSorceress()
	{
		
		DungeonCharacter sorceress = new Sorceress();
		sorceress = new Sorceress(sorceress.getName(), sorceress.getHitPoints(), sorceress.getAttackSpeed(), sorceress.getAttackBehavior(), 0.0);
		
		assertEquals("Sorceress", 75, 5, .3);
	}
	
	@Test
	public void testCreateThief()
	{
		DungeonCharacter thief = new Thief();
		thief = new Thief(thief.getName(), thief.getHitPoints(), thief.getAttackSpeed(), thief.getAttackBehavior(), 0.0); //TODO chanceToBlock is currently set to 0 
	}
	
	@Test
	public void testCreateWarrior()
	{
		DungeonCharacter warrior = new Warrior();
		warrior = new Warrior(warrior.getName(), warrior.getHitPoints(), warrior.getAttackSpeed(), warrior.getAttackBehavior(), 0.0); //TODO chanceToBlock is currently set to 0 
	}
	
}
