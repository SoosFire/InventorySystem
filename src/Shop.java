import Enums.ItemName;
import Enums.ItemType;
import Enums.WeaponSlotType;
import Item.*;

import java.util.ArrayList;

public class Shop {

    ArrayList<Item> shop = new ArrayList<>();

    public void buyIronSword(Inventory inventory) {
        Item sword = ItemRegistry.getDefinition(ItemName.Sword).createInstance();
        inventory.addItemToInventory(sword);
        System.out.println("Sword has been added to the inventory!");
    }
    public void buyIronAxe(Inventory inventory) {
        Item axe = ItemRegistry.getDefinition(ItemName.Axe).createInstance();
        inventory.addItemToInventory(axe);
        System.out.println("Axe has been added to the inventory!");
    }
}
