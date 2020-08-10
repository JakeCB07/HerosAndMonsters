import java.util.Scanner;

public class GameManager {
private static Scanner kb = new Scanner(System.in);
	

	private boolean hasWon = false;
    static Hero theHero;
    //static Monster theMonster;
    Dungeon dungeon;
    
	static Hero chooseHero()
	{
		int choice;
		

	
			System.out.println("Choose a hero:\n" +
					"1. Warrior\n" +
					"2. Sorceress\n" +
					"3. Thief\n" + 
					"4. Paladin");
			choice = kb.nextInt();
			
			switch (choice)
			{
			
			case 1: return theHero = HeroFactory.createWarrior();
			
			case 2: return theHero = HeroFactory.createSorceress();
			
			case 3: return theHero = HeroFactory.createThief();
			
			case 4: return theHero = HeroFactory.createPaladin();
			
				default: System.out.println("invalid choice, Error, returning Thief");
					return HeroFactory.createThief();
		
			}
	}

	static Monster generateMonster()
	{
		int choice;
	
	
		choice = (int)(Math.random() * 3) + 1;
			
		  switch(choice)
		        {
		            case 1: return MonsterFactory.createOgre();

		            case 2: return MonsterFactory.createGremlin();

		            case 3: return MonsterFactory.createSkeleton();
	
		            default: System.out.println("Error: invalid choice");
		            	return MonsterFactory.createSkeleton();
		        
			}
	}

	public boolean playAgain()
	{
		char again;

		System.out.println("Play again (y/n)?");
		again = kb.next().charAt(0);
		again = Character.toUpperCase(again);

		return (again == 'Y');
	}

	public void battle(Hero theHero, Monster theMonster)
	{
		char pause = 'p';
		System.out.println(theHero.getName() + " battles " +
							theMonster.getName());
		System.out.println("---------------------------------------------");


		
		while (theHero.isAlive() && theMonster.isAlive() && pause != 'q'){

			theHero.battleChoices(theMonster);
              

			if (theMonster.isAlive())
			    theMonster.getAttackBehavior().attack(theHero, theMonster);

		

		}

		if (!theMonster.isAlive())
		    System.out.println(theHero.getName() + " was victorious!");
		else if (!theHero.isAlive())
			System.out.println(theHero.getName() + " was defeated :-(");
		else
			System.out.println("Quitters never win ;-)");

	}
	
	public void printIntro() {
		System.out.println("Welcome to Dungeon Adventure!");
		System.out.println("---------------------------------------------");
		System.out.println();
		System.out.println("The goal of the game is to find all 4 pillars of OO. \n"
				+ "Traverse the dungeon and collect these pillars while defending \n"
				+ "yourself from any monsters that want to stop you. When all 4 pillars \n"
				+ "are collected find the room containing the exit and you win!.");
		System.out.println();
		System.out.println("Type the commands N, S, E, and W to move through the dungeon. \n"
				+ "Press I to access your Inventory and M to check the map. \n\n"
				+ "Good Luck ! \n");
		
	}
	
	public void generateDungeon() {
		dungeon.makeMap();
		dungeon.fillMap();
	}
	
	public boolean checkWin(Hero hero) {
		if(hero.pillarCount == 4 && dungeon.getSymbol(hero) == 'O') 
			System.out.println("You Win!");
		
		return hero.pillarCount > 3;
	}
	
	public void checkRoom(Hero hero) {
		dungeon.printLocation(hero);
		
		checkForTraps(hero);
		Monster monster = getMonster(hero);
		if(monster != null)
			battle(hero, monster);
		checkForItems(hero);
		if(dungeon.getSymbol(hero) == 'I' || dungeon.getSymbol(hero) == 'O')
			dungeon.printLocation(hero);
		else
			dungeon.getRoom(hero).setContents('E');
		
		System.out.println("Command? \n");
		char input = kb.next().charAt(0);
		
		playerController(input, hero);
	}
	
	private Monster getMonster(Hero hero) {
		for(Object content: dungeon.getRoom(hero).roomContents) {
			if(content instanceof Monster)
				return (Monster) content;
		}
		
		return null;
	}
	
	private void checkForTraps(Hero hero) {
		for(Object content: dungeon.getRoom(hero).roomContents) {
			if(content instanceof Trap)
				Trap.attack(hero);
		}
	}
	
	private void checkForItems(Hero hero) {
		for(Object content: dungeon.getRoom(hero).roomContents) {
			if(content instanceof Item)
				Item.addToInventory(hero);
		}
	}
	
	private void playerController(char input, Hero hero) {
		
		if(input == 'I') {
			hero.printInventory(hero);
			char c = kb.next().charAt(0);
			if(c > 48 && c < 52) {
				int num = Character.getNumericValue(c);
				hero.useItem(hero, c);
			}
		}
		
		if(input == 'M')
			dungeon.lookAtMap();
		
		if(input == 'N') {
			hero.getPoint().moveNorth();
		}
		if(input == 'S') {
			hero.getPoint().moveSouth();
		}
		if(input == 'W') {
			hero.getPoint().moveWest();
		}
		if(input == 'E') {
			hero.getPoint().moveEast();
		}
			
	}
	
	public void spawnPlayer(Hero hero) {
		Room enterance = dungeon.findEnterance();
		
		hero.setPoint(enterance.getRoomNumberX(), enterance.getRoomNumberY());
	}
	
	public boolean gameOver(Hero hero) {
		
		return !hero.isAlive();
	}

	public boolean isHasWon()
	{
	    return hasWon;
	}

	public void setHasWon(boolean hasWon)
	{
	    this.hasWon = hasWon;
	}
}
