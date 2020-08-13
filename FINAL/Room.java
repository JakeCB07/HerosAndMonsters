import java.util.ArrayList;
import java.util.Random;
public class Room  {
private int roomNumberX;
private int roomNumberY;
Random rand=new Random();
protected char item;
private static Location roomPoint;
protected HealingPotion potion;
protected ArrayList<Character> roomSymbol=new ArrayList<Character>();
Room(){
	roomSymbol.add('E');
	roomSymbol.add(Trap.getTrapSymbol());
	roomSymbol.add(potion.getHealingSymbol());
   
	roomSymbol.add('M');
	this.item=randomRoomSymbol();
}
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
public boolean hasVisited() {
	if(Hero.getPoint().getX()==roomNumberX && Hero.getPoint().getY()==roomNumberY) {
		return true;
	}
	return false;
}
public void setRoomPoint() {
	roomPoint=new Location(getRoomNumberX(),getRoomNumberY());
}
public static Location getRoomPoint() {
	return roomPoint;
}
public String printRoomNumber() {
      return "Room: "+getRoomNumberX()+","+getRoomNumberY();
}
public char randomRoomSymbol() {
	int randomCharGenerator=rand.nextInt(4);
	item=roomSymbol.get(randomCharGenerator);
	return item;
}
public void setRoomSymbol(char symbol) {
    
	this.item=symbol;
}
public char getRoomSymbol() {
	return this.item;
}
public String toString() {
	if(roomNumberX != 0 && roomNumberX != 4 && roomNumberY != 0 && roomNumberY !=4) {
	
	return "* - *\n| "+item+" |\n* - *";
	}
	else if(roomNumberX ==0 && roomNumberY==0) {
//		int randomCharGenerator=rand.nextInt(6);
//		item=roomSymbol.get(randomCharGenerator);
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
