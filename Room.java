import java.util.ArrayList;

public class Room {
	
	private int roomNumberX;
	private int roomNumberY;
	protected char symbol = 'E';
	private char doorN,doorW,doorE,doorS;
	protected ArrayList<Object> roomContents = new ArrayList();
	
	public void setRoomNumberX(int roomNumberX) {
		this.roomNumberX=roomNumberX;
	}
	public int getRoomNumberX() {
		return this.roomNumberX;
	}
	public void setRoomNumberY(int roomNumberY) {
		this.roomNumberY=roomNumberY;

	}
	public int getRoomNumberY() {
		return this.roomNumberY;
	}
	public String printRoomNumber() {
	      return "Room: "+getRoomNumberX()+","+getRoomNumberY();
	}
	
	protected void setContents(char c) {
		this.symbol = c;
	}

	public String toString() {
		if(roomNumberX != 0 && roomNumberX != 4 && roomNumberY != 0 && roomNumberY !=4) {
		return "* - *\n| "+symbol+" |\n* - *";
		}
		else if(roomNumberX ==0 && roomNumberY==0) {
			return"* * *\n* "+symbol+" |"+"\n* - *";
		}
		else if(roomNumberX==4 && roomNumberY==0) {
			return "* * * "+"\n| "+symbol+" *"+"\n* - *";
		}
		else if(roomNumberX==4 && roomNumberY==4) {
			return "* - * \n| " +symbol+" *"+"\n* * *";
		}
		else if(roomNumberX==0 && roomNumberY==4) {
			return "* - *"+"\n* "+symbol+" |"+"\n* * *";
		}
		else if(roomNumberX==0 && roomNumberY !=0 && roomNumberY !=4) {
			return "* - *"+"\n* "+symbol+" |"+"\n* - *";
		}
		else if(roomNumberX==4 && roomNumberY !=0 && roomNumberY !=4) {
			return "* - *"+"\n| "+symbol+ " *"+" \n* - *";
		}
		else if(roomNumberY==0 && roomNumberX != 0 && roomNumberX !=4) {
			return "* * *"+"\n| "+symbol+" |"+"\n* - *";
		}
		else if(roomNumberY==4 && roomNumberX !=0 && roomNumberX != 4) {
			return "* - *"+"\n| "+symbol+" |"+"\n* * *";
		}

		    return " ";              
	}
	
	protected Room makeEnterance(Room room) {
		room.setContents('I');
		
		return room;
	}
	
	protected Room makeExit(Room room) {
		room.setContents('O');
		
		return room;
	}
	
	protected Room makePillarRoom(Room room) {
		room.setContents('K');
		room = generateContents(room);
		
		return room;
	}
	
	protected Room makeRandomRoom(Room room) {
		room = room.generateContents(room);
		
		return room;
	}
	
	private Room generateContents(Room room) {
		
		double healingPotSpawnRate = .25;
		double visionPotSpawnRate = .1;
		double monsterSpawnRate = .3;
		double trapSpawnRate = .3;
		
		if(Math.random() <= healingPotSpawnRate) {
			room.roomContents.add(new HealingPotion());
			room.symbol = 'H';
		}
		if(Math.random() <= visionPotSpawnRate) {
			room.roomContents.add(new VisionPotion());
			room.symbol = 'H';
		}
		if(Math.random() <= monsterSpawnRate) {
			room.roomContents.add(GameManager.generateMonster());
			room.symbol = 'X';
		}
		if(Math.random() <= trapSpawnRate) {
			room.roomContents.add(new Trap());
			room.symbol = 'T';
		}
		
		if(room.roomContents.size() > 1)
			room.symbol = 'M';
		
		
		return room;
	}

}
