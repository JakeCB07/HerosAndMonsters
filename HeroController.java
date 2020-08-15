package dungeon;

public class HeroController
{
    private HeroModel model;
    private HeroView view;

    public HeroController(HeroModel model, HeroView view)
    {
	this.model = model;
	this.view = view;
    }

   
    public String getName()
    {
        return model.getName();
    }
     
    public void setName(String name)
    {
       model.setName(name);
        
    }
    
     public int getHitPoints()
     {
 	return model.getHitPoints();
     }
     
     public int getAttackSpeed()
     {
 	return model.getAttackSpeed();
     }
     
     AttackBehavior getAttackBehavior()
     {
 	return model.getAttackBehavior();
     }
     
     public boolean isAlive()
     {
 	return model.getIsAlive();
     }
    
     void setHitPoints(int hitPoints)
     {
	 model.setHitPoints(hitPoints);
     }
    
     void subtractHitPoints(int hitPoints)
     {
 	model.subtractHitPoints(hitPoints);
     }
     
        public double getChanceToblock()
     {
 	return model.getChanceToBlock();
     }

     public void setChanceToblock(double chanceToBlock)
     {
 	model.setChanceToBlock(chanceToBlock);
     }

     public int getNumTurns()
     {
 	return model.getNumTurns();
     }

     public void setNumTurns(int numTurns)
     {
 	model.setNumTurns(numTurns);
     }


    protected int getTurns()
    {
	return model.getNumTurns();
    }

    
    public void updateHeroView(Hero hero)
    {
	model.printInventory(hero);

    }

    public HeroView getView()
    {
	return this.view;
    }
   

}
