import java.util.ArrayList;
import java.util.Random;
public class Dungeon {
	private static Room[][] room;
	private String wallH=" *-*";
    private String wallV="*| |";
    private int flag1,flag2,flag3,flag4,flag5;
    protected ArrayList<Item> treasureChests;
    protected Inheritance pillar4;
    protected Abstraction pillar3;
    protected Encapsulation pillar2;
    protected Polymorphism pillar1;
    //GameManager master=new GameManager();
    Random rand,rand1,rand2,rand3;
    int loc1, loc2, loc3, loc4,loc5,loc6,loc7,loc8,loc9,loc10;
	Dungeon(int rows, int columns) {
		rows=5;
		columns=5;
		room=new Room[rows][columns];
		 this.rand=new Random();
	     this.rand1=new Random();
		 this.rand2=new Random();
		 this.rand3=new Random();
		
	}
	public void makeMap() {
		
		 for (int r = 0; r < room.length ; r++) {
	            for (int c = 0; c < room[r].length; c++) {
	            	
	                room[r][c] = new Room();
	      
	                room[r][c].setRoomNumberX(r);
	                room[r][c].setRoomNumberY(c);
	               
	                
	            }
		 }
		 do {
			 this.loc1=rand.nextInt(room.length);
				this.loc2=rand.nextInt(room.length);
				this.loc3=rand.nextInt(room.length);
				this.loc4=rand.nextInt(room.length);
				this.loc5=rand.nextInt(room.length);
				this.loc6=rand.nextInt(room.length);
			    this.loc7=rand.nextInt(room.length);
				this.loc8=rand.nextInt(room.length);
				this.loc9=rand.nextInt(room.length);
				this.loc10=rand.nextInt(room.length);
		 }while(loc1==loc3 || loc3==loc5 || loc5==loc7 || loc7==loc1 || loc5==loc1 || loc7==loc3 || loc10==loc2 || loc10==loc4 || loc10==loc6 || loc10==loc8);
		 room[loc1][loc2].setRoomSymbol(Polymorphism.getPolymorphismSymbol());
		 
		 room[loc3][loc4].setRoomSymbol(Abstraction.getAbstractionSymbol());
		 room[loc5][loc6].setRoomSymbol(Inheritance.getInheritanceSymbol());
		 room[loc7][loc8].setRoomSymbol(Encapsulation.getEncapsulationSymbol());
		 room[loc9][loc10].setRoomSymbol('X');
		 System.out.println(loc1+" "+loc2+" "+loc3+" "+loc4+" "+loc5+" "+loc6+" "+loc7+" "+loc8+" \n"+loc9+loc10);
		 
	}
	public void setCurrentRoomSymbol(Hero hero, char roomSymbol) {
		room[hero.getPoint().getX()][hero.getPoint().getY()].setRoomSymbol(roomSymbol);
	}
	public char getCurrentRoomSymbol(Hero hero) {
		return room[hero.getPoint().getX()][hero.getPoint().getY()].getRoomSymbol();
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
	
	private static char[][] getSurroundingArea(Hero hero) {
		char emptyStr = '*';
		char[][] area = new char[3][3];
		int heroX = hero.getPoint().getX();
		int heroY = hero.getPoint().getY();
		
		for(int row = 0; row < area.length; row++) {
			for(int col = 0; col < area[row].length; col++) {
				area[row][col] = '*';
			}
		}	
		
		//upper left
		if(heroX > 0 && heroY >0)
			area[0][0] = room[heroX -1][heroY-1].getRoomSymbol();
		//above
		if(heroY >0)
			area[0][1] = room[heroX][heroY-1].getRoomSymbol();
		//upper right
		if(heroX < 4 && heroY > 0)
			area[0][2] = room[heroX+1][heroY-1].getRoomSymbol();
		//middle left
		if(heroX > 0)
			area[1][0] = room[heroX-1][heroY].getRoomSymbol();
		//middle
		area[1][1] = room[heroX][heroY].getRoomSymbol();
		//middle right
		if(heroX < 4)
			area[1][2] = room[heroX+1][heroY].getRoomSymbol();
		//bottom left
		if(heroX > 0 && heroY < 4)
			area[2][0] = room[heroX-1][heroY+1].getRoomSymbol();
		//bottom middle
		if(heroY < 4)
			area[2][1] = room[heroX][heroY+1].getRoomSymbol();
		//bottom right
		if(heroX < 4 && heroY < 4)
			area[2][2] += room[heroX+1][heroY+1].getRoomSymbol();
		
		return area;
	}
	
	protected static String printSurroundingArea(Hero hero) {
		String retStr = "";
		char[][] surroundingArea = getSurroundingArea(hero); 
		
		for(int row = 0; row < surroundingArea.length; row++) {
			for(int col = 0; col < surroundingArea[row].length; col++) {
					retStr += "[" + surroundingArea[row][col] + "]";
			}
			retStr += "\n";
		}
		
		return retStr;
	}

	
}