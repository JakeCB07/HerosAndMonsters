

public abstract class HeroFactory extends DungeonCharacterFactory
    {
    
       
        public static Sorceress createSorceress(Hero theHero, double chanceToBlock, AttackBehavior specialAttack)
        {
            
            
    		return new Sorceress(theHero, chanceToBlock, specialAttack);
        }
        
        public static Thief createThief(Hero theHero, double chanceToBlock, AttackBehavior specialAttack)
        {
    		return new Thief(theHero, chanceToBlock, specialAttack);
        }
        
        public static Warrior createWarrior(Hero theHero, double chanceToBlock, AttackBehavior specialAttack)
        {
    		return new Warrior(theHero, chanceToBlock, specialAttack);
        }
        
    
    }
