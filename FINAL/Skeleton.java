
public class Skeleton extends Monster {
	  public Skeleton()
		{
			super("Skeleton", 100, 3, .8, .3, 30, 50, 2, 50, new RustyBlade());
            monsterFace();
	    }
        public void monsterFace() {
        	System.out.println("( O O ) "+"\n | > |"+"\n  -----");
        }
	
		}


