package dungeon;


public class HeroFactory {
public static Hero createHero(char choice) {
		
		if(choice == '1')
			return new Warrior();
		if(choice == '2')
			return new Sorceress();
		if(choice == '3')
			return new Thief();
		if(choice == '4')
			return new Paladin();
		if(choice == '5')
			return new FrostMage();
		
		return null;
	}
}
