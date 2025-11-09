package net.sourdough.yarnballmod;

import net.fabricmc.api.ModInitializer;

import net.sourdough.yarnballmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YarnBallMod implements ModInitializer {
	public static final String MOD_ID = "yarnballmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}