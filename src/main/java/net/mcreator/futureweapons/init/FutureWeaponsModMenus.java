
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futureweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.futureweapons.world.inventory.FusGUIMenu;
import net.mcreator.futureweapons.world.inventory.EngineertableMenu;
import net.mcreator.futureweapons.world.inventory.Choicegui2Menu;
import net.mcreator.futureweapons.FutureWeaponsMod;

public class FutureWeaponsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, FutureWeaponsMod.MODID);
	public static final RegistryObject<MenuType<EngineertableMenu>> ENGINEERTABLE = REGISTRY.register("engineertable", () -> IForgeMenuType.create(EngineertableMenu::new));
	public static final RegistryObject<MenuType<FusGUIMenu>> FUS_GUI = REGISTRY.register("fus_gui", () -> IForgeMenuType.create(FusGUIMenu::new));
	public static final RegistryObject<MenuType<Choicegui2Menu>> CHOICEGUI_2 = REGISTRY.register("choicegui_2", () -> IForgeMenuType.create(Choicegui2Menu::new));
}
