package pik.wrongmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pik.wrongmod.WrongMod;

public class ModItems {

    public static final Item WOOD_CROSS = registerItem("wood_cross", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(WrongMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WrongMod.LOGGER.info("Registering Mod Items for " + WrongMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(WOOD_CROSS);

        });

    }
}