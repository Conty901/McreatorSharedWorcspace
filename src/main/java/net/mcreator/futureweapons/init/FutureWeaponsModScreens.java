
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futureweapons.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.futureweapons.client.gui.TsivftsiivtsfScreen;
import net.mcreator.futureweapons.client.gui.FusGUIScreen;
import net.mcreator.futureweapons.client.gui.EngineertableScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FutureWeaponsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(FutureWeaponsModMenus.ENGINEERTABLE.get(), EngineertableScreen::new);
			MenuScreens.register(FutureWeaponsModMenus.TSIVFTSIIVTSF.get(), TsivftsiivtsfScreen::new);
			MenuScreens.register(FutureWeaponsModMenus.FUS_GUI.get(), FusGUIScreen::new);
		});
	}
}
