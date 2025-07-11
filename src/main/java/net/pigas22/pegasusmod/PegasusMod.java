package net.pigas22.pegasusmod;

import net.fabricmc.api.ModInitializer;

import net.pigas22.pegasusmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PegasusMod implements ModInitializer {
	public static final String MOD_ID = "pegasusmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItems.registerModItems();
	}
}