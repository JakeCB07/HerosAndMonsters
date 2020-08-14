package dungeonView;

import java.awt.Color;

import Dungeon.View;
import dungeonModel.Dungeon;

public class DungeonRenderer implements Renderer
{ 
	 private Dungeon dungeon;
	 
	 public DungeonRenderer(Dungeon dungeon) {
	  this.dungeon = dungeon;
	 }
	 
	 @Override
	 public void render(View view) {
	  // render the grid
	  int cellSize = 32; // hard coded
	  view.setColor(new Color(0, 0.5f, 0, 0.75f));
	  for (int i = 0; i <= Dungeon.WIDTH; i++) {
	      view.drawLine(i * cellSize, 0, i * cellSize, Dungeon.HEIGHT * cellSize);
	   if (i <= Dungeon.WIDTH)
	       view.drawLine(0, i * cellSize, Dungeon.WIDTH * cellSize, i * cellSize);
	  }
	 
	  // render the obstacles
	  view.setColor(new Color(0, 0, 1f));
	  for (Trap trap : dungeon.getObstacles()) {
	   int x = (int) (trap.getX() * cellSize) + 2;
	   int y = (int) (trap.getY() * cellSize) + 2;
	   view.fillRect(x, y, cellSize - 4, cellSize - 4);
	  }
	 
	  // render the enemies
	  view.setColor(new Color(1f, 0, 0));
	  for (Monster monster : dungeon.getEnemies()) {
	   int x = (int) (monster.getX() * cellSize);
	   int y = (int) (monster.getY() * cellSize);
	   view.fillOval(x + 2, y + 2, cellSize - 4, cellSize - 4);
	  }
	 
	  // render player droid
	  view.setColor(new Color(0, 1f, 0));
	  Hero hero = dungeon.getHero();
	  int x = (int) (hero.getX() * cellSize);
	  int y = (int) (hero.getY() * cellSize);
	  view.fillOval(x + 2, y + 2, cellSize - 4, cellSize - 4);
	  // render square on droid
	  view.setColor(new Color(0.7f, 0.5f, 0f));
	  view.fillRect(x + 10, y + 10, cellSize - 20, cellSize - 20);
	 }
	}
}
