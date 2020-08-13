package dungeon;

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
