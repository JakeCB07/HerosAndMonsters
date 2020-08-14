package dungeonController;

import java.util.Random;
import java.util.Scanner;

import dungeonModel.Abstraction;
import dungeonModel.Dungeon;
import dungeonModel.Encapsulation;
import dungeonModel.HealingPotion;
import dungeonModel.Hero;
import dungeonModel.HeroFactory;
import dungeonModel.Inheritance;
import dungeonModel.Monster;
import dungeonModel.MonsterFactory;
import dungeonModel.Polymorphism;
import dungeonModel.Trap;
import dungeonModel.VisionPotion;

public class GameManager {
	private static Scanner kb = new Scanner(System.in);
	private boolean win = false;

	private Dungeon dungeon = new Dungeon(5, 5);
	private Trap trap = new Trap();

	public static Hero chooseHero() {
		char choice;
		Hero selectedHero;

		do {
			System.out.println("Choose a hero:\n" + "1. Warrior\n" + "2. Sorceress\n" + "3. Thief\n"
		+ "4. Paladin\n" + "5. Frost Mage");
			choice = kb.next().charAt(0);

			selectedHero = HeroFactory.createHero(choice);
			if (selectedHero == null)
				System.out.println("Invalid selection, please choice the number 1, 2, 3, 4, or 5");
		} while (selectedHero == null);

		return selectedHero;
	}

	public Monster generateMonster() {
		int choice = 0;
		Monster selectedMonster;
		do {
			choice = (int) (Math.random() * 5) + 1;

			selectedMonster = MonsterFactory.createMonster(choice);
		} while (choice < 1 || choice > 5);

		return selectedMonster;
	}

	public boolean playAgain() {
		char again;

		System.out.println("Play again (y/n)?");
		again = kb.next().charAt(0);
		again = Character.toUpperCase(again);

		return (again == 'Y');
	}

	public void battle(Hero theHero, Monster theMonster) {

		char pause = 'p';
		System.out.println(theHero.getName() + " battles " + theMonster.getName());
		System.out.println("---------------------------------------------");

		while (theHero.isAlive() && theMonster.isAlive() && pause != 'q') {

			theHero.battleChoices(theMonster);

			if (theMonster.isAlive())
				theMonster.getAttackBehavior().attack(theHero, theMonster);

		}

		if (!theMonster.isAlive()) {
			System.out.println(theHero.getName() + " was victorious!");
		} else if (!theHero.isAlive()) {
			System.out.println(theHero.getName() + " was defeated :-(");
		} else
			System.out.println("Quitters never win ;-)");
	}

	public void printIntro() {
		System.out.println("Welcome to Dungeon Adventure!");
		System.out.println("---------------------------------------------");
		System.out.println();
		System.out.println("The Kingdom of Java is in great peril! The 4 Pillars of OO have been stolen!\n"
				+ "The Mad Wizard Steiner stole the Pillars in order to keep the power of OO all to himself. \n"
				+ "He has hidden the Pillars away in a dungeon far beneath Castle Java. The dungeon is filled with \n"
				+ "all sorts of vile monsters and deadly traps in order to guard the Pillars of OO. \n"
				+ "King Capaul has sent you on a quest to recover the Pillars and restore peace and prosperity \n"
				+ " to the Kingdom of Java\n"
				+ "Good Luck!\n");
		System.out.println();
		System.out.println("Type the commands N, S, E, and W to move through the dungeon. \n"
				+ "Press I to access your Inventory and M to print the Map Legend. \n\n" + "Good Luck ! \n");

	}

	public void generateDungeon() {
		win = false;
		this.dungeon.makeMap();
	}
	
	public boolean win() {
		return win;
	}

	public boolean checkWin(Hero hero) {
		if (dungeon.getCurrentRoomSymbol(hero) == 'X')
			if (hero.getPillarCount() > 3) {
				win = true;
			} else
				System.out.println("I must find the remaining " + (4 - hero.getPillarCount()) + " Pillars.");

		return win;
	}

	public void checkRoom(Hero hero) {
		dungeon.printLocation(hero);

		checkForTraps(hero);
		checkForMonsters(hero);
		checkForItems(hero);

		if (hero.isAlive()) {
			printControls();
			System.out.println("Command? ");
			char input = kb.next().charAt(0);
			playerController(input, hero);
		}
	}

	private void checkForMonsters(Hero hero) {
		if (dungeon.getCurrentRoomSymbol(hero) == 'M') {
			Monster monster = generateMonster();
			battle(hero, monster);
			if (!monster.isAlive()) {
				dungeon.setCurrentRoomSymbol(hero, 'E');
			}
		}
	}

	private void checkForTraps(Hero hero) {
		if (dungeon.getCurrentRoomSymbol(hero) == 'T') {
			trap.attack(hero);
		}
	}

	private void checkForItems(Hero hero) {
		if (dungeon.getCurrentRoomSymbol(hero) == 'H')
			HealingPotion.addToInventory(hero);
		if (dungeon.getCurrentRoomSymbol(hero) == 'V')
			VisionPotion.addToInventory(hero);
		if (dungeon.getCurrentRoomSymbol(hero) == 'A')
			Abstraction.addToInventory(hero);
		if (dungeon.getCurrentRoomSymbol(hero) == 'P')
			Polymorphism.addToInventory(hero);
		if (dungeon.getCurrentRoomSymbol(hero) == 'e')
			Encapsulation.addToInventory(hero);
		if (dungeon.getCurrentRoomSymbol(hero) == 'I')
			Inheritance.addToInventory(hero);

		if (dungeon.getCurrentRoomSymbol(hero) != 'X' && dungeon.getCurrentRoomSymbol(hero) != 'N')
			dungeon.setCurrentRoomSymbol(hero, 'E');
	}

	private void playerController(char input, Hero hero) {
		input = Character.toUpperCase(input);

		// cheat codes
		if (input == 'V') {
			hero.addVisionPot(hero);
			System.out.println("Cheat Actived: Vision potion added to inventory.");
		}
		if(input == 'H') {
			hero.addHealingPot(hero);
			System.out.println("Cheat Actived: Healing potion added to inventory.");
		}
		if(input == 'P') {
			hero.addPillar(hero);
			System.out.println("Cheat Actived: Pillar added to inventory.");
		}
		if(input == 'K') {
			System.out.println("Good bye");
			hero.setHitPoints(0);
		}
		//------------------------------------
		
		if (input == 'I') {
			System.out.println(hero.printInventory(hero));
			hero.useItem(hero);
		}
		if (input == 'M')
			printLegend();
		if (input == 'N') {
			hero.getPoint().moveNorth();
		}
		if (input == 'S') {
			hero.getPoint().moveSouth();
		}
		if (input == 'W') {
			hero.getPoint().moveWest();
		}
		if (input == 'E') {
			hero.getPoint().moveEast();
		}

	}

	public void spawnPlayer(Hero hero) {
		do {
			Random rand = new Random();
			int loc1 = rand.nextInt(5);
			int loc2 = rand.nextInt(5);
			hero.setPoint(loc1, loc2);
		} while (dungeon.getCurrentRoomSymbol(hero) != 'E');
		dungeon.setCurrentRoomSymbol(hero, 'N');
	}

	private void printControls() {
		System.out.println(" N: move North" + "\n W: move West" + "\n E: move East " + "\n S: move South"
				+ "\n I: view Inventory\n");
	}

	private void printLegend() {
		System.out.println(
				" H: Healing Potion \n V: Vision Potion \n T: Trap \n " + "M: Monster \n N: Entrance \n O: Exit \n");
	}
	
	public void printEnding(Hero hero) {
		System.out.println("The enterance to the dungeon collapses behind you as you make a narrow exit. \n" 
				+ "As you exit the dungeon you're greeted with the bright light of the sun.\n"
				+ "You bask in its warmth for a moment, then take a deep breath and \ncontinue on your way to "
				+ "return the Pillars to thier rightful place.\n\n"
				+ "The name " + hero.getName() + " shall forever live on in legend as the hero who gathered all 4 Pillars of OO.\n"
				+ "Restoring balance to the Kingdom of Java.");
	}

	public boolean gameOver(Hero hero) {

		return !hero.isAlive();
	}
}
