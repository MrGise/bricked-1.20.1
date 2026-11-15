package net.MrGise.bricked.content.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.MrGise.bricked.Bricked;

public class BrickedItems {
    public static final Item MAROON_BRICK = register(new Item(new Item.Properties()), "medium/maroon");

    public static Item register(Item item, String name) {
        return Registry.register(BuiltInRegistries.ITEM, Bricked.id(name), item);
    }

    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries ->
                entries.addAfter(Items.BRICK, MAROON_BRICK));
    }
}
