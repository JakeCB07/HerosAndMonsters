import java.util.ArrayList;
import java.util.Random;
public class Dungeon {
	private Room[][] room;
	private String wallH=" *-*";
    private String wallV="*| |";
    protected ArrayList<Item> treasureChests;
    protected Inheritance pillar4;
    protected Abstraction pillar3;
    protected Encapsulation pillar2;
    protected Polymorphism pillar1;
    GameManager master=new GameManager();
    Random rand,rand1,rand2,rand3;
    int loc1, loc2, loc3, loc4,loc5,loc6,loc7,loc8,loc9,loc10;
	public Dungeon(int rows, int columns) {
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

	
}