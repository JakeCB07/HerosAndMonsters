package dungeon;

public abstract class Item {
	
	protected String itemDescription;
	protected String itemName;
	
	Item(String itemDescription, String itemName){
		this.itemDescription = itemDescription;
		this.itemName = itemName;
	}
	
	public abstract void use(Hero character, int index);
	
	public abstract void addToInventory(Hero character);
}
