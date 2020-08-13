<<<<<<< HEAD

public class DungeonAdventure {

	public static void main(String[] args)
    {
		
	GameManager gameManager = new GameManager();
	
	do
	{
		Hero theHero = GameManager.chooseHero();
		gameManager.generateDungeon();
		gameManager.printIntro();
		gameManager.spawnPlayer(theHero);
		
	    do {
	    	gameManager.checkRoom(theHero);
	    	
	    }while(!gameManager.gameOver(theHero) && !gameManager.checkWin(theHero));
	} while (gameManager.playAgain());

    }

}
=======

public class DungeonAdventure {

	public static void main(String[] args)
    {
		
	GameManager gameManager = new GameManager();
	
	do
	{
		Hero theHero = GameManager.chooseHero();
		gameManager.generateDungeon();
		gameManager.printIntro();
		gameManager.spawnPlayer(theHero);
		
	    do {
	    	gameManager.checkRoom(theHero);
	    	
	    }while(!gameManager.gameOver(theHero) && !gameManager.checkWin(theHero));
	} while (gameManager.playAgain());

    }

}
>>>>>>> b10c09556709c7e5eb86065fd895458b5cd7fa91
