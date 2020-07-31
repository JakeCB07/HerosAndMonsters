public abstract class CharacterFactory
{

    
    public Monster createMonster(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior,double chanceToHeal,
		 int minHeal, int maxHeal)
    {
	Monster theMonster = createMonster(name, hitPoints, attackSpeed,  attackBehavior, chanceToHeal,minHeal, maxHeal);
		return theMonster;
    }
    
    public Hero createHero(String name, int hitPoints, int attackSpeed, AttackBehavior attackBehavior, double chanceToBlock)
    {
	
	Hero theHero = createHero(name, hitPoints, attackSpeed, attackBehavior, chanceToBlock);
	
	return theHero;
    }
    
}
