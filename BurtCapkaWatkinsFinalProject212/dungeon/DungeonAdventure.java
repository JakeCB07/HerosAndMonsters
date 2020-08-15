package dungeon;

/*
// cheat codes
		'V' to add vision potion to inventory
		'H" to add healing potion to inventory
		'P' to add pillar to inventory
		'K' to die
		'M' to display entire dungeon map
		//------------------------------------
*/

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
	    
	    if(gameManager.win())
	    	gameManager.printEnding(theHero);
	    	
	    gameManager.printMap();
	} while (gameManager.playAgain());

    }

}
