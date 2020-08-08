package dungeon;

//Written by Mark Capka 
//will add on later as we will need to have things like an inventory for our Hero
public class Player
{
    private String name;
    private Hero character;

    public Player(String name, Hero character)
    {
	this.setName(name);
	this.name = name;
	this.character = character;
    }

    public Hero getHero()
    {
	return character;
    }

    public String getName()
    {
	return name;
    }

    public void setName(String name)
    {
	this.name = name;
    }

}
