package dungeon;

public class MightySword extends Attack{

	private static String attack = "swings thier Mighty Sword at";
    private static double chanceToHit = .8;
    private static int minDamage = 35;
    private static int maxDamage = 60; 

	MightySword() {
		super(attack, minDamage, maxDamage, chanceToHit);
	}
}
