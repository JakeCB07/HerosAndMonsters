package Dungeon;
import java.util.ArrayList;

public class Dungeon
{
	
	private Room[][] dungeon;
	private String wallH=" *-*";
    private String wallV="*| |";
	private ArrayList<Room> roomPool = new ArrayList();
	private int maxRows = 5;
	private int maxColumns = 5;
	
	private void fillRoomPool() {
		int pillarRoomCount = 4;
		int randomRoomCount = 19;
		
		Room newRoom = new Room();
		roomPool.add(newRoom.makeEnterance(newRoom));
		roomPool.add(newRoom.makeExit(newRoom));
		
		for(int i = 0; i < pillarRoomCount; i++) 
			roomPool.add(newRoom.makePillarRoom(newRoom));
		
		for(int i = 0; i < randomRoomCount; i++) 
			roomPool.add(newRoom.makeRandomRoom(newRoom));
		
	}
	
	Dungeon() {
		dungeon=new Room[maxRows][maxColumns];
	}
	
	protected void makeMap() {
		
		 for (int r = 0; r < dungeon.length; r++) {
	            for (int c = 0; c < dungeon[r].length; c++) {
	            	
	                dungeon[r][c] = new Room();
	                dungeon[r][c].setRoomNumberX(r);
	                dungeon[r][c].setRoomNumberY(c);
	               
	                
	            }
		 }
	}
	
	protected void fillMap() {
		
		for(int row = 0; row < maxRows; row++) {
			for(int col = 0; col < maxColumns; col++) {
				int randRoom = (int) (Math.random() * (roomPool.size() + 1));
				dungeon[row][col] = roomPool.get(randRoom);
				roomPool.remove(randRoom);
			}
		}
	}
	
	public void printLocation(Hero hero) {
		System.out.println("Our hero is in: " +dungeon[hero.getPoint().getX()][hero.getPoint().getY()].printRoomNumber());
		System.out.println(dungeon[hero.getPoint().getX()][hero.getPoint().getY()]);
	}
	
	protected char getSymbol(Hero hero) {
		return dungeon[hero.getPoint().getX()][hero.getPoint().getY()].symbol;
	}
	
	protected Room getRoom(Hero hero) {
		return dungeon[hero.getPoint().getX()][hero.getPoint().getY()];
	}
	
	
	public void lookAtMap() {
		for(int i=0; i<dungeon.length; i++) {
		
			for(int x=0; x<dungeon[i].length;x++) {
                 
				 
		}
		
	}
	}

	protected Room findEnterance() {
		
		for(int row = 0; row < 5; row++) {
			for(int col = 0; col < 5; col++) {
				if(dungeon[row][col].symbol == 'I')
					return dungeon[row][col];
			}
		}
		
		System.out.println("Enterance not found");
		return null;
	}
}