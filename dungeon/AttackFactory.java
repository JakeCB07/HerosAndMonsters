package dungeon;
public class AttackFactory
//MARK CAPKA EXTRA CREDIT CREATED ATTACK FACTORY FLYWEIGHT POOL
{
private static WoodenClub woodenClub; 
private static Shortbow shortbow;
private static RustyBlade rustyBlade;
private static MightySword mightySword;
private static Kris kris;
private static Firebolt fireBolt;
private static Hammer hammer;
private static FreezingTouch freezingTouch;
private static CowBoyHat cowBoyHat;
private static BlueBerryBreath blueBerryBreath;

	

public static WoodenClub WoodenClubFactory()
{
    if(woodenClub == null) 
	woodenClub = new WoodenClub();
    
    return woodenClub;
    
}


public static Shortbow ShortbowFactory()
{
    if(shortbow == null) 
	shortbow = new Shortbow();
    
    return shortbow;
    
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


public static Hammer HammerFactory()
{
    if(hammer == null) 
   	hammer = new Hammer();
       
       return hammer;
}


public static FreezingTouch FreezingTouchFactory()
{
    if(freezingTouch == null) 
	freezingTouch = new FreezingTouch();
       
       return freezingTouch;
}


public static CowBoyHat CowBoyHatFactory()
{
    if(cowBoyHat == null) 
	cowBoyHat = new CowBoyHat();
          
          return cowBoyHat;
}


public static BlueBerryBreath BlueBerryBreath()
{
    if(blueBerryBreath == null) 
	blueBerryBreath = new BlueBerryBreath();
             
             return blueBerryBreath;
}

   
    
}