
public class DungeonAdventure {

	public static void main(String[] args)
    {
	  HeroModelInterface heroModel = new HeroModel();
	    ControllerInterface controller = new HeroController(heroModel);
	    
	    HeroModel.initialize();
	 

    }
}