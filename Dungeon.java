
public class Dungeon {
	 public static void main(String[] args)
		{
		 GameManager gameManager = new GameManager();
			Hero theHero;
			Monster theMonster;

			do
			{
			    theHero = gameManager.chooseHero();
			    theMonster = gameManager.generateMonster();
				gameManager.battle(theHero, theMonster);

			} while (gameManager.playAgain());

	    }


	}