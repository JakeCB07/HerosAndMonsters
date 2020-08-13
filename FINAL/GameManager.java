import java.util.Random;
import java.util.Scanner;

public class GameManager {
private static Scanner kb = new Scanner(System.in);
	//private boolean MonsterIsDead=false;
	//private boolean HeroIsDead=false;
	
	private Dungeon dungeon = new Dungeon(5,5);
	private Trap trap = new Trap();
	
	public static Hero chooseHero()
	{
		int choice;
		Hero selectedHero;

		do {
			System.out.println("Choose a hero:\n" +
					"1. Warrior\n" +
					"2. Sorceress\n" +
					"3. Thief");
			choice = kb.nextInt();

			selectedHero = HeroFactory.createHero(choice);
			if(choice < 1 || choice > 3)
				System.out.println("Invalid selection, please choice the number 1, 2 or 3.");
		}while(choice < 1 || choice > 3);
		
		return selectedHero;
	}

	public Monster generateMonster()
	{
		int choice = 0;
		Monster selectedMonster;
		do {
			choice = (int)(Math.random() * 3) + 1;
			
			selectedMonster = MonsterFactory.createMonster(choice);
		}while(choice < 1 || choice > 3);
		
		return selectedMonster;
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
        
		if (!theMonster.isAlive()) {
		    System.out.println(theHero.getName() + " was victorious!");
		}
		else if (!theHero.isAlive()) {
			System.out.println(theHero.getName() + " was defeated :-(");
		}
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
				+ "are collected find the room containing the exit and you win!");
		System.out.println();
		System.out.println("Type the commands N, S, E, and W to move through the dungeon. \n"
				+ "Press I to access your Inventory and M to print the Map Legend. \n\n"
				+ "Good Luck ! \n");
		
	}
	
	public void generateDungeon() {
		this.dungeon.makeMap();
	}
	
	public boolean checkWin(Hero hero) {
		if(dungeon.getCurrentRoomSymbol(hero) == 'O') 
			if(hero.getPillarCount() > 3) {
				System.out.println("You Win!");
			}
			else
				System.out.println("I must find the remaining " + (4-hero.getPillarCount()) + " Pillars.");
		
		return hero.pillarCount > 3;
	}
	
	public void checkRoom(Hero hero) {
		dungeon.printLocation(hero);
		
		checkForTraps(hero);
		checkForMonsters(hero);
		checkForItems(hero);
		
		if(hero.isAlive()) {
			printControls();
			System.out.println("Command? ");
			char input = kb.next().charAt(0);
			playerController(input, hero);
		}
	}
	
	private void checkForMonsters(Hero hero) {
		if(dungeon.getCurrentRoomSymbol(hero)=='M') {
			Monster monster = generateMonster();
			battle(hero, monster);
			if(!monster.isAlive()) {
		    	dungeon.setCurrentRoomSymbol(hero,'E');
		    }
		}
	}
	
	private void checkForTraps(Hero hero) {
		if(dungeon.getCurrentRoomSymbol(hero)=='T') {
			 trap.attack(hero);
		 }
	}
	
	private void checkForItems(Hero hero) {
		if(dungeon.getCurrentRoomSymbol(hero)=='H') 
			HealingPotion.addToInventory(hero);
		if(dungeon.getCurrentRoomSymbol(hero) == 'V')
			VisionPotion.addToInventory(hero);
		if(dungeon.getCurrentRoomSymbol(hero)=='A') 
	    	Abstraction.addToInventory(hero);
		if(dungeon.getCurrentRoomSymbol(hero)=='P')
			Polymorphism.addToInventory(hero);
		if(dungeon.getCurrentRoomSymbol(hero)=='e') 
 			Encapsulation.addToInventory(hero);
		if(dungeon.getCurrentRoomSymbol(hero)=='I') 
 			Inheritance.addToInventory(hero);
		
		if(dungeon.getCurrentRoomSymbol(hero) != 'O' && dungeon.getCurrentRoomSymbol(hero) != 'N')
			dungeon.setCurrentRoomSymbol(hero, 'E');
	}
	
	private void playerController(char input, Hero hero) {
		input = Character.toUpperCase(input);
		
		if(input == 'I') {
			System.out.println(hero.printInventory(hero));
			hero.useItem(hero);
		}
		
		//cheat codes
		if(input == 'L')
			VisionPotion.use(hero);
		
		if(input == 'M')
			printLegend();
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
		do {
			Random rand=new Random();
			int loc1=rand.nextInt(5);
			int loc2=rand.nextInt(5);
			hero.setPoint(loc1,loc2);
			}while(dungeon.getCurrentRoomSymbol(hero) !='E');
			dungeon.setCurrentRoomSymbol(hero, 'N');
	}
	
	private void printControls() {
		System.out.println(" N: move North"+"\n W: move West"+"\n E: move East "+"\n S: move South"+"\n I: view Inventory\n");
	}
	
	private void printLegend() {
		System.out.println(" H: Healing Potion \n V: Vision Potion \n T: Trap \n "
				+ "M: Monster \n N: Entrance \n O: Exit \n");
	}
	
	public boolean gameOver(Hero hero) {
		
		return !hero.isAlive();
	}
}
