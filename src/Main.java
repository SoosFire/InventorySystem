import Enums.ItemClass;
import Enums.ItemType;
import Item.ItemSO;
import Item.Items;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Items items = new Items();

        InventorySystem InventorySystem = new InventorySystem();

        InventorySystem.onStart();
        InventorySystem.addItem(items.bow);
        InventorySystem.addItem(items.chainmailBoots);

        System.out.println(InventorySystem.getItems().size());
        for (ItemSO item : InventorySystem.getItems()) {
            System.out.println(item.getName());
        }

        System.out.println("Item Class:");
        // ItemType Search System
        InventorySystem.items = InventorySystem.getItemsByClass(InventorySystem.items, ItemClass.Weapon);
        for (ItemSO item : InventorySystem.items) {
            System.out.println(item.getName());
        }

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

