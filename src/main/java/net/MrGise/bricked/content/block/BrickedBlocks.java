package net.MrGise.bricked.content.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.MrGise.bricked.Bricked;
import net.MrGise.bricked.content.block.custom.BrickStation;

public class BrickedBlocks {
    public static final Block BRICK_STATION = register(new BrickStation(BlockBehaviour.Properties.copy(Blocks.SMITHING_TABLE)),
            "brick_station", true);

    public static Block register(Block block, String name, boolean registerItem) {
        ResourceLocation id = Bricked.id(name);

        if (registerItem) {
            BlockItem item = new BlockItem(block, new Item.Properties());
            Registry.register(BuiltInRegistries.ITEM, id, item);
        }

        return Registry.register(BuiltInRegistries.BLOCK, id, block);
    }

    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries ->
                        entries.addAfter(Blocks.SMITHING_TABLE, BRICK_STATION
                        ));
    }
}
