
public class Heal implements HealBehavior{
	
	public void heal(DungeonCharacter character, int minHeal, int maxHeal)
	  {

			int healPoints = (int)(Math.random() * (maxHeal - minHeal + 1)) + minHeal;
			addHitPoints(character, healPoints);
			System.out.println(character.name + " regenerated " + healPoints + " hit points.\n"
								+ "Total hit points remaining are: " + character.hitPoints);
			System.out.println();
	  }
	
	
	private void addHitPoints(DungeonCharacter character, int hitPointsHealed)
	{
		if (character.hitPoints <=0)
			System.out.println("Hitpoint amount must be positive.");
		else
		{
			character.hitPoints += hitPointsHealed;
		}
	}//end addHitPoints method
		
}
