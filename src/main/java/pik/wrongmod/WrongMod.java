package pik.wrongmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pik.wrongmod.item.ModItems;

public class WrongMod implements ModInitializer {

	public static final String MOD_ID = "wrong-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}