

public abstract class Item {
	
	protected String itemDescription;
	protected String itemName;
	protected char symbol;
	
	Item(String itemDescription, String itemName, char symbol){
		this.itemDescription = itemDescription;
		this.itemName = itemName;
		this.symbol = symbol;
	}
	
	public static void use(Hero character) {};
	
	public static void addToInventory(Hero character) {};
}