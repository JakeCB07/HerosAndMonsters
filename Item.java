package Dungeon;

public abstract class Item {
	
	protected String itemDescription;
	protected String itemName;
	
	Item(String itemDescription, String itemName){
		this.itemDescription = itemDescription;
		this.itemName = itemName;
	}
	
	public static void use(Hero character) {};
	
	public static void addToInventory(Hero character) {};
}
