
public class Ogre extends Monster {
	public Ogre()
	{
		super("Ogre", 200, 2, .6, .1, 30, 50, 2, 50, new WoodenClub());
             makeFace();

    }
    public void makeFace() {
    	System.out.println("0( > < )0"+"\n    >  ");
    }

}
