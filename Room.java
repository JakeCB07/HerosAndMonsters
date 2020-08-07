
public class Room {
	
	private int roomNumberX;
	private int roomNumberY;
	private char item='P';
	private char doorN,doorW,doorE,doorS;
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

	public String toString() {
		if(roomNumberX != 0 && roomNumberX != 4 && roomNumberY != 0 && roomNumberY !=4) {
		return "* - *\n| "+item+" |\n* - *";
		}
		else if(roomNumberX ==0 && roomNumberY==0) {
			return"* * *\n* "+item+" |"+"\n* - *";
		}
		else if(roomNumberX==4 && roomNumberY==0) {
			return "* * * "+"\n| "+item+" *"+"\n* - *";
		}
		else if(roomNumberX==4 && roomNumberY==4) {
			return "* - * \n| " +item+" *"+"\n* * *";
		}
		else if(roomNumberX==0 && roomNumberY==4) {
			return "* - *"+"\n* "+item+" |"+"\n* * *";
		}
		else if(roomNumberX==0 && roomNumberY !=0 && roomNumberY !=4) {
			return "* - *"+"\n* "+item+" |"+"\n* - *";
		}
		else if(roomNumberX==4 && roomNumberY !=0 && roomNumberY !=4) {
			return "* - *"+"\n| "+item+ " *"+" \n* - *";
		}
		else if(roomNumberY==0 && roomNumberX != 0 && roomNumberX !=4) {
			return "* * *"+"\n| "+item+" |"+"\n* - *";
		}
		else if(roomNumberY==4 && roomNumberX !=0 && roomNumberX != 4) {
			return "* - *"+"\n| "+item+" |"+"\n* * *";
		}

		    return " ";              
	}

}
