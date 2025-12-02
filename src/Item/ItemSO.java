package Item;

import Enums.ItemClass;
import Enums.ItemType;

public class ItemSO {

    String name;
    int stackSize;
    double weight;
    ItemClass classType;
    int cost;
    String rarity;
    boolean consumable;
    ItemType itemType;


    public ItemSO(String name, int stackSize, double weight, ItemClass type, int cost, String rarity, boolean consumable, ItemType itemType) {
        this.name = name;
        this.stackSize = stackSize;
        this.weight = weight;
        this.classType = type;
        this.cost = cost;
        this.rarity = rarity;
        this.consumable = consumable;
        this.itemType = itemType;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Stack Size: " + this.stackSize);
        System.out.println("Weight: " + this.weight);
        System.out.println("Type: " + this.classType);
        System.out.println("Cost: " + this.cost);
        System.out.println("Rarity: " + this.rarity);
        System.out.println("Consumable: " + this.consumable);
    }

    public int stackSize() {
        return stackSize;
    }
    public int setStackSize(int stackSize) {
        this.stackSize = stackSize;
        return stackSize;
    }

    public void updateStackSize(int amount) {
        this.stackSize = stackSize + amount;
    }

    public ItemClass getClassType() {
        return classType;
    }

    public String getName() {
        return name;
    }
    public ItemType getItemType() {
        return itemType;
    }
}
