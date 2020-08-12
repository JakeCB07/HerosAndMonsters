package Dungeon;
public class DungeonAdventure {
    
    public static void main(String[] args)
    {

	 // HeroModelInterface heroModel = new HeroModel();
	 //   ControllerInterface controller = new HeroController(heroModel);
	    
	    
	GameManager gameManager = new GameManager();
	do
	{
		iDungeonCharacter theHero = GameManager.chooseHero();
		gameManager.generateDungeon();
		gameManager.printIntro();
		gameManager.spawnPlayer(theHero);

	    do {
	    	gameManager.checkRoom(theHero);

	    }while(!gameManager.gameOver(theHero) && gameManager.checkWin(theHero));
	} while (gameManager.playAgain());
	
	
	
	//HeroModel.initialize();
    
    
    }


	
	    
	    
	 
	 

    
}