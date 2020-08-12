package Dungeon;
public class AttackFactory
//MARK CREATED ATTACK FACTORY -> will be more useful once we continue final implementation
{
private static WoodenClub woodenClub; 
private static Shortbow shortBow;
private static RustyBlade rustyBlade;
private static MightySword mightySword;
private static Kris kris;
private static Firebolt fireBolt;




//TODO I BELIEVE that this is the flyweight pattern, however, need to confirm that is the case
	//-Mark Capka

public static WoodenClub WoodenClubFactory()
{
    if(woodenClub == null) 
	woodenClub = new WoodenClub();
    
    return woodenClub;
    
}


public static Shortbow ShortBowFactory()
{
    if(shortBow == null) 
	shortBow = new Shortbow();
    
    return shortBow;
    
}




public static RustyBlade RustyBladeFactory()
{
    if(rustyBlade == null) 
	rustyBlade = new RustyBlade();
    
    return rustyBlade;
    
}




public static MightySword MightySwordFactory()
{
    if(mightySword == null) 
	mightySword = new MightySword();
    
    return mightySword;
    
}

public static Kris KrisFactory()
{
    if(kris == null) 
	kris = new Kris();
    
    return kris;
}


public static Firebolt FireBoltFactory()
{
    if(fireBolt == null) 
	fireBolt = new Firebolt();
    
    return fireBolt;
}

   
    
}