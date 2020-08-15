package dungeon;

public class DungeonAdventure  {

	public static void main(String[] args)
    {
	   HeroModel model = new HeroModel();
	   
	   HeroView view = new HeroView();
	   
	   HeroController controller = new HeroController(model, view);
		
	  
	GameManager gameManager = new GameManager();
	
	do
	{
		Hero theHero = GameManager.chooseHero();
		gameManager.generateDungeon();
		gameManager.printIntro();
		gameManager.spawnPlayer(theHero);
		 
		controller.updateHeroView(theHero);
		
	    do {
	    	gameManager.checkRoom(theHero);
	    	controller.updateHeroView(theHero);
	    }while(!gameManager.gameOver(theHero) && !gameManager.checkWin(theHero));
	    
	    if(gameManager.win())
	    	gameManager.printEnding(theHero);
	    controller.updateHeroView(theHero);
	    gameManager.printMap();
	} while (gameManager.playAgain());

    }
	
	

}
