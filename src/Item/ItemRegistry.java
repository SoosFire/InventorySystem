package Item;
import Enums.*;

import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {

    private static final Map<ItemName, Item> DEFINITIONS = new HashMap<>();

    static {
        DEFINITIONS.put(ItemName.Sword,
                new Weapon("Sword", 2.0,100,10,ItemType.WEAPON, WeaponSlotType.ONE_HANDED,1));

        DEFINITIONS.put(ItemName.Axe,
                new Weapon("Axe", 10,200,20,ItemType.WEAPON,WeaponSlotType.TWO_HANDED,1));
    }

    public static Item getDefinition(ItemName itemName) {
        return DEFINITIONS.get(itemName);
    }
}
