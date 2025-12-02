import java.util.ArrayList;
import Enums.*;
import Item.ItemSO;
import Item.Items;

public class InventorySystem {

    Items item = new Items();
    ArrayList<ItemSO> items = new ArrayList<>();

    public void onStart() {
    items.add(item.sword);
    }

    public ArrayList<ItemSO> getItems() {
        return items;
    }

    public void addItem(ItemSO item) {
        items.add(item);
    }

    public ArrayList<ItemSO> getItemsByClass(ArrayList<ItemSO> inventory, ItemClass classType) {
        ArrayList<ItemSO> result = new ArrayList<>();

        for (ItemSO item : inventory) {
            if (item.getClassType() == classType) {  // or equals() for non-enum types
                result.add(item);
            }
        }

        return result;
    }

}
