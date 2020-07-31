public abstract class CharacterFactory
{

    public static Monster createMonster(Monster theMonster, double chanceToHeal, AttackBehavior attackBehavior,
		 int minHeal, int maxHeal)
    {
	theMonster = createMonster(theMonster, chanceToHeal, attackBehavior, minHeal, maxHeal);
		return theMonster;
    }
    
    public static Hero createHero(Hero theHero, double chanceToBlock)
    {
	
	theHero = createHero(theHero, chanceToBlock);
	
	
	return theHero;
    }
    
}

}
