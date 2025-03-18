
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futureweapons.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.futureweapons.FutureWeaponsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FutureWeaponsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FutureWeaponsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(FutureWeaponsModBlocks.ENGENEERTABLE.get().asItem());
			tabData.accept(FutureWeaponsModBlocks.BLOCKOFSEREBRO.get().asItem());
			tabData.accept(FutureWeaponsModBlocks.BLOCKOFWHITESEREBRO.get().asItem());
			tabData.accept(FutureWeaponsModBlocks.BLOCKOFLEAD.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(FutureWeaponsModItems.KINGALLEZVIE.get());
			tabData.accept(FutureWeaponsModItems.KINGALOSNOVA.get());
			tabData.accept(FutureWeaponsModItems.ELECTSWRUCHKA.get());
			tabData.accept(FutureWeaponsModItems.ELECTRACUM.get());
			tabData.accept(FutureWeaponsModItems.ACUMEMPTY.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(FutureWeaponsModBlocks.OFF.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(FutureWeaponsModItems.KINGAL.get());
			tabData.accept(FutureWeaponsModItems.ELECTRICSWORD.get());
			tabData.accept(FutureWeaponsModItems.KATANA.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(FutureWeaponsModItems.SCHEMATICKINGAL.get());
			tabData.accept(FutureWeaponsModItems.BIONICHEART_2.get());
			tabData.accept(FutureWeaponsModItems.SCHEMATICELECTROSWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(FutureWeaponsModItems.TESTWEIGHTEDITADD.get());
			tabData.accept(FutureWeaponsModItems.TESTWEIGHTEDITREMOVE.get());
			tabData.accept(FutureWeaponsModItems.SEREBRORAW.get());
			tabData.accept(FutureWeaponsModItems.SEREBRO.get());
			tabData.accept(FutureWeaponsModItems.WHITESEREBRO.get());
			tabData.accept(FutureWeaponsModItems.LEAD.get());
			tabData.accept(FutureWeaponsModItems.RAWLEAD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(FutureWeaponsModItems.BIONICHEART.get());
			tabData.accept(FutureWeaponsModItems.MOLOT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(FutureWeaponsModBlocks.SEREBROORE.get().asItem());
			tabData.accept(FutureWeaponsModBlocks.LEADORE.get().asItem());
			tabData.accept(FutureWeaponsModBlocks.LEADORE_2.get().asItem());
		}
	}
}
