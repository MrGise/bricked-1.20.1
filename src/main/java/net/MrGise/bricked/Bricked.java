package net.MrGise.bricked;

import net.MrGise.bricked.util.UtilCollection;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;
import net.MrGise.bricked.content.block.BrickedBlocks;
import net.MrGise.bricked.content.item.BrickedItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bricked implements ModInitializer {
	public static final String MOD_ID = "bricked";

	public static UtilCollection util = new UtilCollection(MOD_ID);

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BrickedBlocks.init();
		BrickedItems.init();
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(MOD_ID, path);
	}
}
