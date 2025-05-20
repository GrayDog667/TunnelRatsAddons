package com.grayson.traddons;

import com.grayson.traddons.block.ModBlocks;
import com.grayson.traddons.item.ModItemGroups;
import com.grayson.traddons.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


// Comment
public class TunnelRatsAddons implements ModInitializer {
		public static final String MOD_ID = "traddons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

		@Override
		public void onInitialize() {
			ModItemGroups.registerItemGroups();

			ModItems.registerModItems();
			ModBlocks.registerModBlocks();

		}
}