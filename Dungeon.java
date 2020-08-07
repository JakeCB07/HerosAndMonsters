
public class Dungeon
{
	
	private Room[][] room;
	private String wallH=" *-*";
    private String wallV="*| |";
	
	public Dungeon(int rows, int columns) {
		rows=5;
		columns=5;
		room=new Room[rows][columns];
	}
	public void makeMap() {
		
		 for (int r = 0; r < room.length; r++) {
	            for (int c = 0; c < room[r].length; c++) {
	            	
	                room[r][c] = new Room();
	                room[r][c].setRoomNumberX(r);
	                room[r][c].setRoomNumberY(c);
	               
	                
	            }
		 }
	}
	public void printLocation(Hero hero) {
		System.out.println("Our hero is in: " +room[hero.getPoint().getX()][hero.getPoint().getY()].printRoomNumber());
		System.out.println(room[hero.getPoint().getX()][hero.getPoint().getY()]);
	}
	public void lookAtMap() {
		for(int i=0; i<room.length; i++) {
		
			for(int x=0; x<room[i].length;x++) {
                 
				 
		}
		
	}
	}

}