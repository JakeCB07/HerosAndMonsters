package Dungeon;
/*
 * import java.util.*;
 * 
 * 
 * public abstract class HeroModel implements HeroModelInterface { static
 * DungeonAdventure dungeonAdventure; ArrayList<Hero> heroObserver = new
 * ArrayList(); //TODO may not need arraylist here as we only have a singular
 * hero, however, may want stats in arraylist, or maybe needed for model
 * GameManager gameManager = new GameManager(); Hero theHero; Monster
 * theMonster;
 * 
 * public void initialize() { setUpAdventure(); //choose character //begin
 * adventure at entrance to dungeon
 * 
 * }
 * 
 * 
 * public void setUpAdventure() { ((HeroModelInterface)
 * dungeonAdventure).startAdventure();
 * 
 * }
 * 
 * public void startAdventure() { theHero = GameManager.chooseHero();
 * gameManager.generateDungeon(); gameManager.printIntro();
 * gameManager.spawnPlayer(theHero); }
 * 
 * public void continueAdventure() {
 * 
 * 
 * do {
 * 
 * gameManager.checkRoom(theHero);
 * 
 * }while(!gameManager.gameOver(theHero) && gameManager.checkWin(theHero));
 * endAdventure();
 * 
 * }
 * 
 * public void endAdventure() {
 * 
 * if(gameManager.gameOver(theHero) && gameManager.checkWin(theHero)) {
 * System.out.println("Congratulations, you beat the game!"); playAgain(); }
 * 
 * System.out.println("YOU DIED"); playAgain(); }
 * 
 * public void playAgain() {
 * 
 * Scanner kb = new Scanner(System.in);
 * System.out.println("Would you like to play again?\n");
 * System.out.println("Y/N");
 * 
 * String playAgainInput = kb.nextLine();
 * 
 * do {
 * 
 * if(playAgainInput.equals("Y") || playAgainInput.equals("y")) {
 * System.out.println("Starting your new adventure"); setUpAdventure();
 * 
 * } else if(playAgainInput.equals("N") || playAgainInput.equals("n")) { break;
 * }
 * 
 * }while(!(playAgainInput.equals("Y") || playAgainInput.equals("N")));
 * 
 * 
 * }
 * 
 * public void registerObserver(Hero obsHero) //TODO see if Hero needs to be of
 * type HeroObserver { heroObserver.add(obsHero); }
 * 
 * public void notifyObservers() { for(int i = 0; i < heroObserver.size(); i++)
 * { Hero observer = (Hero) heroObserver.get(i); observer.updateHero(); } }
 * 
 * public void removeObserver(Hero obsHero) { int i =
 * heroObserver.indexOf(obsHero); if(i >= 0) { heroObserver.remove(i); } }
 * 
 * }
 */
