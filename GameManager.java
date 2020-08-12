import java.util.Scanner;

public class GameManager {
private static Scanner kb = new Scanner(System.in);
	private boolean MonsterIsDead=false;
	private boolean HeroIsDead=false;
	public Hero chooseHero()
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
    public boolean getMonsterIsDead() {
    	return this.MonsterIsDead;
    }
    public boolean getHeroIsDead() {
    	return this.HeroIsDead;
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
		    MonsterIsDead=true;
		}
		else if (!theHero.isAlive()) {
			System.out.println(theHero.getName() + " was defeated :-(");
		    HeroIsDead=true;
		}
		else 
			System.out.println("Quitters never win ;-)");
		

	}
}
