package dungeon;

public class HeroView
{
    public void printHeroDetails(String name, int hitPoints, int maxHitPoints, int pillarCount, int healingPotCount,
	    int visionPotCount, Location point)
    {
	System.out.println("Hero Inventory");

	System.out.println("Name: " + name);
	System.out.println("hitPoints: " + hitPoints);
	System.out.println("Max Hit Points" + maxHitPoints);
	System.out.println("Pillar Count: " + pillarCount);
	System.out.println("Healing Potion Count: " + healingPotCount);
	System.out.println("Vision Potion Count: " + visionPotCount);
	System.out.println("Location: " + point);
    }
 
   
}
