
public interface HeroModelInterface
{
    void initialize();
    
    void setUpAdventure();
    
    void startAdventure();
    
    void getName();
    
    void getHitPoints();
    
    void getAttackSpeed();
    
    void getAttackBehavior();		
    
    void isAlive();
    
    void subtractHitPoints();
    
    void attack();		//attack(opponenet, attacker)
    
    void registerObserver(Hero observer);
    
    void removeObserver(Hero observer);
    
    //TODO add any additional observers here... may have to make this method abstract and go down a level in order to register more specific observers
    
}
