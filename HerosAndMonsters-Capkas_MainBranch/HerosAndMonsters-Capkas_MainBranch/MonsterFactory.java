    public class MonsterFactory 
    {
    
        public static Ogre createOgre(Monster theMonster, int chanceToHeal, int minHeal, int maxHeal)
        {
            
            
    		return  new Ogre(theMonster, chanceToHeal, minHeal, maxHeal);
        }
        
        public static Skeleton createSkeleton(Monster theMonster, int chanceToHeal, int minHeal, int maxHeal)
        {
    		return new Skeleton(theMonster, chanceToHeal, minHeal, maxHeal);
        }
        
        public static Gremlin createGremlin(Monster theMonster, int chanceToHeal, int minHeal, int maxHeal)
        {
    		return new Gremlin(theMonster, chanceToHeal, minHeal, maxHeal);
        }
        
    
    }
