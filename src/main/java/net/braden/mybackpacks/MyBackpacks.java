package net.braden.mybackpacks;

import net.braden.mybackpacks.Item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyBackpacks implements ModInitializer {
	public static final String MOD_ID = "mybackpacks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
