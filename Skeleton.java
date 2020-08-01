
public class Skeleton extends Monster
{
	
	private static String name = "Sargath the Skeleton";
	private static int hitPoints = 100;
	private static int attackSpeed = 3;
    private static double chanceToHeal = .3;
    private static AttackBehavior attackBehavior = new RustyBlade();
	private static int minHeal = 30;
	private static int maxHeal = 50;

    public Skeleton()
	{
		super(name, hitPoints, attackSpeed, chanceToHeal, attackBehavior, minHeal, maxHeal);

    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		attackBehavior.attack(opponent, this);
	}//end override of attack


}//end class Skeleton