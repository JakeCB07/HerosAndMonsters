
public abstract interface CharacterFactoryInterface<T>
{
    public interface MonsterFactory
    {
	abstract double getChanceToHeal();
	abstract int getMinHeal();
	abstract int getMaxHeal();
    }
    
    public interface HeroFactory
    {
	   abstract double getChanceToBlock();
    }

    T create(String name);
 
}