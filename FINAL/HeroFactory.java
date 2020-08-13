
public class HeroFactory {
public static Hero createHero(int choice) {
		
		if(choice == 1)
			return new Warrior();
		if(choice == 2)
			return new Sorceress();
		if(choice == 3)
			return new Thief();
		
		return null;
	}
}
