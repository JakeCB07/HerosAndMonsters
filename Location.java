package dungeon;

public class Location {
	
	private int x, y;

	public Location(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
		
	}
	public void moveNorth() {
		if(y !=0) {
		y-=1;
		}
		else {
			System.out.println("I'm stuck at the top of the map");
		}
	}
	public void moveSouth() {
		if(y !=4) {
		y+=1;
		}
		else {
			System.out.println("I'm at the bottom of the map");
		}
	}
	public void moveEast() {
		if(x !=4) {
		x+=1;
		}
		else {
			System.out.println("I'm as far east as I can go");
		}
	}
	public void moveWest() {
		if(x !=0) {
		x-=1;
		}
		else {
			System.out.println("I'm as far west as I can go");
		}
	}

}
