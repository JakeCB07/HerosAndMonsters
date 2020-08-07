
public class DungeonAdventure {

	public static void main(String[] args)
    {
	GameManager gameManager = new GameManager();
	Hero theHero;
	Monster theMonster;

	do
	{
	    theHero = GameManager.chooseHero();
	    theMonster = GameManager.generateMonster();
	    gameManager.battle(theHero, theMonster);

	} while (gameManager.playAgain());

    }

}
