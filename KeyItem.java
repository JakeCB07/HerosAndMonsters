package dungeon;

public class KeyItem extends Item {
	
	KeyItem(String itemName, String itemDescription){
		super(itemDescription, itemDescription);
	}
	
	public void use(Hero character, int index) {
		System.out.println(this.itemDescription);
	}

	public void addToInventory(Hero character) {
		character.inventory.add(this);
		
	}

}
