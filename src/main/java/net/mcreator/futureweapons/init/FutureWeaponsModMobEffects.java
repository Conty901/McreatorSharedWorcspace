
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futureweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.futureweapons.potion.ElectricityMobEffect;
import net.mcreator.futureweapons.potion.BloodingMobEffect;
import net.mcreator.futureweapons.potion.AcidMobEffect;
import net.mcreator.futureweapons.FutureWeaponsMod;

public class FutureWeaponsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, FutureWeaponsMod.MODID);
	public static final RegistryObject<MobEffect> ELECTRICITY = REGISTRY.register("electricity", () -> new ElectricityMobEffect());
	public static final RegistryObject<MobEffect> BLOODING = REGISTRY.register("blooding", () -> new BloodingMobEffect());
	public static final RegistryObject<MobEffect> ACID = REGISTRY.register("acid", () -> new AcidMobEffect());
}
