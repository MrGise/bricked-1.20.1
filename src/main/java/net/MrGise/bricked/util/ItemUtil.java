package net.MrGise.bricked.util;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

public class ItemUtil {
    private final String modid;

    public ItemUtil(String modid) {
        this.modid = modid;
    }

    public ItemStack toStack(ItemLike item) {
        return item.asItem().getDefaultInstance();
    }
}
