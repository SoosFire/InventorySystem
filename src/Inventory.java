import java.util.ArrayList;

import Item.Item;

public class Inventory {

    protected ArrayList<Item> inventory = new ArrayList<>();
    protected int gold;


    public void addItemToInventory(Item item) {
        inventory.add(item);
    }

    public void showInventory() {
        for (Item item : inventory) {
            System.out.println(item.getTotalAmount() + "x " + item.getName());
        }
    }
}
