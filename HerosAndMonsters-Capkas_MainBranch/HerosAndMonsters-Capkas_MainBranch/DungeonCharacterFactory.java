public abstract class CharacterFactory
{

    
    public static Monster createMonster(String name, int hitPoints, int attackSpeed, double chanceToHeal, AttackBehavior attackBehavior,
		 int minHeal, int maxHeal)
    {
	Monster theMonster = createMonster(name, hitPoints, attackSpeed, chanceToHeal, attackBehavior, minHeal, maxHeal);
		return theMonster;
    }
    
    public static Hero createHero(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior, double chanceToBlock)
    {
	
	Hero theHero = createHero(name, hitPoints, attackSpeed, attackBehavior, chanceToBlock);
	
	return theHero;
    }
    
}
