package com.bg03.experimental;

import com.bg03.experimental.block.ModBlocks;
import com.bg03.experimental.block.entity.ModBlockEntities;
import com.bg03.experimental.item.ModItemGroups;
import com.bg03.experimental.item.ModItems;
import com.bg03.experimental.util.HammerUsageEvent;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Experimental implements ModInitializer {

	public static final String MOD_ID = "experimental";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600);

		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
	}
}