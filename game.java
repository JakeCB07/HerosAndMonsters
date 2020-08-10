import java.util.Random;
import java.util.Scanner;
public class game {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int choice=0;
		Dungeon n=new Dungeon(5,5);
		n.makeMap();
		n.lookAtMap();
		Random rand=new Random();
		int loc1=rand.nextInt(5);
		int loc2=rand.nextInt(5);
        Hero samurai=new Warrior();
        samurai.setPoint(loc1,loc2);
        GameManager master=new GameManager();
        System.out.println("Welcome to my dungeon!!!");
        System.out.println("Submit by typing 5");
        System.out.println("Our hero is currently: "+samurai.getPoint().getX()+","+samurai.getPoint().getY());
        System.out.println("What move should our hero make: "+  "\n 1: moveNorth"+"\n 2: moveWest"+"\n 3: moveEast "+"\n 4: moveSouth");
        while(choice !=5 && !master.getHeroIsDead()) {
        	choice=kb.nextInt();
        	if(choice==1) {
        
        		samurai.getPoint().moveNorth();
        	
        		n.printLocation(samurai);
        		if(n.getCurrentRoomSymbol(samurai)=='M') {
        			master.battle(samurai, master.generateMonster());
        		    if(master.getMonsterIsDead()==true) {
        		    	n.setCurrentRoomSymbol(samurai,'E');
        		    }
        		}
        	}
        	else if(choice==2) {
        		samurai.getPoint().moveWest();
        		n.printLocation(samurai);
        		if(n.getCurrentRoomSymbol(samurai)=='M') {
        			master.battle(samurai, master.generateMonster());
        			if(master.getMonsterIsDead()==true) {
        		    	n.setCurrentRoomSymbol(samurai,'E');
        		    }
        		}
        		
        	}
        	else if(choice==3) {
        		samurai.getPoint().moveEast();
        		n.printLocation(samurai);
        		if(n.getCurrentRoomSymbol(samurai)=='M') {
        			master.battle(samurai, master.generateMonster());
        			if(master.getMonsterIsDead()==true) {
        		    	n.setCurrentRoomSymbol(samurai,'E');
        		    }
        		}
        	}
        	else if(choice==4) {
        		samurai.getPoint().moveSouth();
        		n.printLocation(samurai);
        		if(n.getCurrentRoomSymbol(samurai)=='M') {
        			master.battle(samurai, master.generateMonster());
        			if(master.getMonsterIsDead()==true) {
        		    	n.setCurrentRoomSymbol(samurai,'E');
        		    }
        		}
        		
        	}
        	else if(choice==5) {
        		System.out.println("COWARD!!! Link and Kratos wouldn't give up like this");
        	}
        	
        	
        	
        }
	}

}
