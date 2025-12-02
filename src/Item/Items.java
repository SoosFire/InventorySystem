package Item;

import Enums.ItemClass;
import Enums.ItemType;

public class Items {

    // Weapons
    public ItemSO sword = new ItemSO("Sword", 1, 1.0, ItemClass.Weapon, 0, "Common", false, ItemType.One_handed);
    public ItemSO dualSword = new ItemSO("DualSword", 1, 1.0, ItemClass.Weapon, 0, "Common", false, ItemType.Dual_handed);
    public ItemSO axe = new ItemSO("Axe", 1, 1.0, ItemClass.Weapon, 0, "Common", false, ItemType.One_handed);
    public ItemSO pickaxe = new ItemSO("Pickaxe", 1, 1.0, ItemClass.Weapon, 0, "Common", false, ItemType.Two_handed);
    public ItemSO shovel = new ItemSO("Shovel", 1, 1.0, ItemClass.Weapon, 0, "Common", false, ItemType.Two_handed);
    public ItemSO dagger = new ItemSO("Dagger", 1, 1.0, ItemClass.Weapon, 0, "Common", false, ItemType.One_handed);
    public ItemSO staff = new ItemSO("Staff", 1, 1.0, ItemClass.Weapon, 0, "Common", false, ItemType.Two_handed);
    public ItemSO bow = new ItemSO("Bow", 1, 1.0, ItemClass.Weapon, 0, "Common", false, ItemType.Bow);
    public ItemSO crossbow = new ItemSO("Crossbow", 1, 1.0, ItemClass.Weapon, 0, "Common", false, ItemType.Bow);
    public ItemSO lance = new ItemSO("Lance", 1, 1.0, ItemClass.Weapon, 0, "Common", false, ItemType.Two_handed);

    // Armor – chest
    public ItemSO steelChestplate = new ItemSO("SteelChestplate", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Steel);
    public ItemSO chainmail = new ItemSO("Chainmail", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Chainmail);
    public ItemSO leatherChestplate = new ItemSO("LeatherChestplate", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Leather);

    // Armor – helmet
    public ItemSO steelHelmet = new ItemSO("SteelHelmet", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Steel);
    public ItemSO leatherHelmet = new ItemSO("LeatherHelmet", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Leather);
    public ItemSO chainmailHelmet = new ItemSO("ChainmailHelmet", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Chainmail);

    // Armor – leggings
    public ItemSO steelLeggings = new ItemSO("SteelLeggings", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Steel);
    public ItemSO leatherLeggings = new ItemSO("LeatherLeggings", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Leather);
    public ItemSO chainmailLeggings = new ItemSO("ChainmailLeggings", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Chainmail);

    // Armor – boots
    public ItemSO steelBoots = new ItemSO("SteelBoots", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Steel);
    public ItemSO leatherBoots = new ItemSO("LeatherBoots", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Leather);
    public ItemSO chainmailBoots = new ItemSO("ChainmailBoots", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Chainmail);

    // Armor – gauntlets
    public ItemSO steelGauntlet = new ItemSO("SteelGauntlet", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Steel);
    public ItemSO leatherGauntlet = new ItemSO("LeatherGauntlet", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Leather);
    public ItemSO chainmailGauntlet = new ItemSO("ChainmailGauntlet", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Chainmail);

    // Armor – shoulders & cloak
    public ItemSO steelShoulderPiece = new ItemSO("SteelShoulderPiece", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Steel);
    public ItemSO leatherShoulderPiece = new ItemSO("LeatherShoulderPiece", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Leather);
    public ItemSO chainmailShoulderPiece = new ItemSO("ChainmailShoulderPiece", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Chainmail);
    public ItemSO cloak = new ItemSO("Cloak", 1, 1.0, ItemClass.Armor, 0, "Common", false, ItemType.Leather);

    // Weapon utilities (arrows)
    public ItemSO steelTippedArrow = new ItemSO("SteelTippedArrow", 1, 1.0, ItemClass.Utility, 0, "Common", false, ItemType.Arrow);
    public ItemSO boltArrow = new ItemSO("BoltArrow", 1, 1.0, ItemClass.Utility, 0, "Common", false, ItemType.Arrow);
    public ItemSO poisonArrow = new ItemSO("PoisonArrow", 1, 1.0, ItemClass.Utility, 0, "Common", false, ItemType.Arrow);
    public ItemSO fireArrow = new ItemSO("FireArrow", 1, 1.0, ItemClass.Utility, 0, "Common", false, ItemType.Arrow);

    // Consumables (potions)
    public ItemSO healthPotion = new ItemSO("HealthPotion", 1, 1.0, ItemClass.Utility, 0, "Common", false, ItemType.Potion);
    public ItemSO manaPotion = new ItemSO("ManaPotion", 1, 1.0, ItemClass.Utility, 0, "Common", false, ItemType.Potion);
    public ItemSO speedPotion = new ItemSO("SpeedPotion", 1, 1.0, ItemClass.Utility, 0, "Common", false, ItemType.Potion);
    public ItemSO strengthPotion = new ItemSO("StrengthPotion", 1, 1.0, ItemClass.Utility, 0, "Common", false, ItemType.Potion);
    public ItemSO staminaPotion = new ItemSO("StaminaPotion", 1, 1.0, ItemClass.Utility, 0, "Common", false, ItemType.Potion);
    public ItemSO agilityPotion = new ItemSO("AgilityPotion", 1, 1.0, ItemClass.Utility, 0, "Common", false, ItemType.Potion);

    // Stat-bonus items (jewelry)
    public ItemSO necklace = new ItemSO("Necklace", 1, 1.0, ItemClass.Utility, 0, "Common", false, ItemType.Jewelry);
    public ItemSO chalice = new ItemSO("Chalice", 1, 1.0, ItemClass.Utility, 0, "Common", false, ItemType.Jewelry);
    public ItemSO ring = new ItemSO("Ring", 1, 1.0, ItemClass.Utility, 0, "Common", false, ItemType.Jewelry);
    public ItemSO bracelet = new ItemSO("Bracelet", 1, 1.0, ItemClass.Utility, 0, "Common", false, ItemType.Jewelry);
    public ItemSO amulet = new ItemSO("Amulet", 1, 1.0, ItemClass.Utility, 0, "Common", false, ItemType.Jewelry);
}
