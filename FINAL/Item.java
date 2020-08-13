<<<<<<< HEAD


public abstract class Item {
	
	protected String itemDescription;
	protected String itemName;
	protected char symbol;
	
	Item(String itemDescription, String itemName){
		this.itemDescription = itemDescription;
		this.itemName = itemName;
		this.symbol = symbol;
	}
	
	public static void use(Hero character) {};
	
	public static void addToInventory(Hero character) {};
=======


public abstract class Item {
	
	protected String itemDescription;
	protected String itemName;
	protected char symbol;
	
	Item(String itemDescription, String itemName){
		this.itemDescription = itemDescription;
		this.itemName = itemName;
		this.symbol = symbol;
	}
	
	public static void use(Hero character) {};
	
	public static void addToInventory(Hero character) {};
>>>>>>> b10c09556709c7e5eb86065fd895458b5cd7fa91
}