import Enums.ItemType;
import Item.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Shop shop = new Shop();

        shop.buyIronSword(inventory);
        shop.buyIronAxe(inventory);

        inventory.showInventory();

    }



    // METHODS

    public static ArrayList<Item> getItemsByType (ArrayList < Item > inventory, ItemType type){
        ArrayList<Item> result = new ArrayList<>();

        for (Item item : inventory) {
            if (item.getType() == type) {  // or equals() for non-enum types
                result.add(item);
            }
        }

        return result;
    }
}

/*
        // Search System
        switch (choice) {
            case 1:
                System.out.println("Item Types:");
                // ItemType Search System
                ArrayList<ItemSO> weapons = getItemsByType(inventory, ItemType.Chainmail);
                for (ItemSO item : weapons) {
                    System.out.println(item.getName());
                }
                System.out.println();
                System.out.println("Item Class:");
                // ItemClass Search System
                ArrayList<ItemSO> bob = getItemsByClass(inventory, ItemClass.Weapon);
                for (ItemSO item : bob) {
                    System.out.println(item.getName());
                }
                break;
            case 2:
                ArrayList<ItemSO> utility = getItemsByType(inventory, ItemType.Arrow);
                for (ItemSO item : utility) {
                    System.out.println(item.getName());
                }
                break;
            case 3:
                ArrayList<ItemSO> armorList = getItemsByType(inventory, ItemType.Potion);
                for (ItemSO item : armorList) {
                    System.out.println(item.getName());
                }
        }
    }


    // Search for Enums.ItemClass
    public static ArrayList<ItemSO> getItemsByClass(ArrayList<ItemSO> inventory, ItemClass classType) {
        ArrayList<ItemSO> result = new ArrayList<>();

        for (ItemSO item : inventory) {
            if (item.getClassType() == classType) {  // or equals() for non-enum types
                result.add(item);
            }
        }

        return result;
    }

    // Search for Enums.ItemType
    public static ArrayList<ItemSO> getItemsByType(ArrayList<ItemSO> inventory, ItemType type) {
        ArrayList<ItemSO> result = new ArrayList<>();

        for (ItemSO item : inventory) {
            if (item.getItemType() == type) {  // or equals() for non-enum types
                result.add(item);
            }
        }

        return result;
        }
   */

