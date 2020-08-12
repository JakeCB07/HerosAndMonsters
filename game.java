import java.util.Random;
import java.util.Scanner;
public class game {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int choice=0;
		Dungeon n=new Dungeon(5,5);
		n.makeMap();
		n.lookAtMap();
		Hero samurai=new Warrior();
		do {
		Random rand=new Random();
		int loc1=rand.nextInt(5);
		int loc2=rand.nextInt(5);
		samurai.setPoint(loc1,loc2);
		}while(n.getCurrentRoomSymbol(samurai) !='E');
		n.setCurrentRoomSymbol(samurai, 'N');
        Trap T=new Trap();
     
        int winToken=0;
        GameManager master=new GameManager();
        System.out.println("Welcome to my dungeon!!!");
        System.out.println("Submit by typing 7");
        System.out.println("Our hero is currently: "+samurai.getPoint().getX()+","+samurai.getPoint().getY());
        System.out.println("What move should our hero make: "+  "\n 1: moveNorth"+"\n 2: moveWest"+"\n 3: moveEast "+"\n 4: moveSouth"+"\n 5: view Inventory");
        while(choice !=7 && !master.getHeroIsDead() && winToken !=777) {
        	choice=kb.nextInt();
        	if(choice==1) {
        
        		samurai.getPoint().moveNorth();
        	
        		
        		
        	}
        	else if(choice==2) {
        		samurai.getPoint().moveWest();
	
        	}
        	else if(choice==3) {
        		samurai.getPoint().moveEast();

        	}
        	else if(choice==4) {
        		samurai.getPoint().moveSouth();

        	}
        	else if(choice==5) {
        		System.out.println(samurai.printInventory(samurai));
        		
        	}
        	else if(choice==6) {
        		System.out.println("What should the warrior use in his quest for vengence.....I mean to get out of the dungeon "+"\n 1: pillar count "+"\n 2: Healing potion "+"\n Vison potion");
        		choice=kb.nextInt();
        		samurai.useItem(samurai, choice);
        	}
        	else if(choice==7) {
        		System.out.println("COWARD!!! Link and Kratos wouldn't give up like this");
        	}
        	n.printLocation(samurai);
    		if(n.getCurrentRoomSymbol(samurai)=='M') {
    			master.battle(samurai, master.generateMonster());
    			if(master.getMonsterIsDead()==true) {
    		    	n.setCurrentRoomSymbol(samurai,'E');
    		    }
    		}
    		 if(n.getCurrentRoomSymbol(samurai)=='H') {
    			HealingPotion.addToInventory(samurai);
    			n.setCurrentRoomSymbol(samurai, 'E');
    		}
    		else if(n.getCurrentRoomSymbol(samurai)=='A') {
		    	Abstraction.addToInventory(samurai);
		    	n.setCurrentRoomSymbol(samurai, 'E');
		    }
    		else if(n.getCurrentRoomSymbol(samurai)=='P') {
    			Polymorphism.addToInventory(samurai);
    			n.setCurrentRoomSymbol(samurai,'E');
    		}
    		 else if(n.getCurrentRoomSymbol(samurai)=='e') {
     			Encapsulation.addToInventory(samurai);
     			n.setCurrentRoomSymbol(samurai,'E');
     		}
    		 else if(n.getCurrentRoomSymbol(samurai)=='I') {
     			Inheritance.addToInventory(samurai);
     			n.setCurrentRoomSymbol(samurai,'E');
     		}
    		 else if(n.getCurrentRoomSymbol(samurai)=='T') {
    			 System.out.println("Warrior falls into trap");
    			 T.subtractHitPoints(samurai, choice);
    		 }
    		 else if(n.getCurrentRoomSymbol(samurai)=='X') {
    			 if(samurai.getPillarCount()==4) {
    				 	System.out.println("YOU'RE WINNER!!!");
    				 	winToken=777;
    			 }
    			 else {
    				 System.out.println("What are you doin go get the other pillars ya crazy kid");
    			 }
    		 }
        	
        	
        }
	}

}
