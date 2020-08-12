package Dungeon;
import java.util.Scanner;

public class HeroFactory 
{

  
   public static iDungeonCharacter createSorceress()
    {       
       
	return new Sorceress();
    }

    public static iDungeonCharacter createThief()
    {
	
	return new Thief();
    }

   public static iDungeonCharacter createWarrior()
   {
       
       return new Warrior();
   }

   public static Paladin createPaladin() {
	   return new Paladin();
   }
 
   public static iDungeonCharacter createHero(int choice)
   {
       Scanner playerInput = new Scanner(System.in);
     
       choice = playerInput.nextInt();
       
       do {
               switch (choice)
        	{
        	
        	case 1: return  HeroFactory.createWarrior();
        	
        	case 2: return  HeroFactory.createSorceress();
        	
        	case 3: return  HeroFactory.createThief();
        	
        		default: System.out.println("invalid choice, Error, returning Thief");
        			return  HeroFactory.createThief();
        
        	}
	}while(choice < 1 || choice >3);
       
    
   }

}