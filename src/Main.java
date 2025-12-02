import Enums.ItemClass;
import Enums.ItemType;
import Item.ItemSO;
import Item.Items;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {

        Items items = new Items();

        ArrayList<ItemSO> inventory = new ArrayList<>();
        inventory.add(items.sword);
        inventory.add(items.dualSword);
        inventory.add(items.steelTippedArrow);
        inventory.add(items.boltArrow);
        inventory.add(items.steelChestplate);
        inventory.add(items.leatherChestplate);
        inventory.add(items.healthPotion);
        inventory.add(items.chainmailShoulderPiece);

        System.out.println("Search for items");
        System.out.println("Select category");
        System.out.println();
        System.out.println("1) Weapons");
        System.out.println("2) Utility");
        System.out.println("3) Armor");
        int choice = input.nextInt();

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
}
