
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futureweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.futureweapons.block.VtsftsvifvBlock;
import net.mcreator.futureweapons.block.TsvutsuvutsBlock;
import net.mcreator.futureweapons.block.SerebrooreBlock;
import net.mcreator.futureweapons.block.EngeneertableBlock;
import net.mcreator.futureweapons.FutureWeaponsMod;

public class FutureWeaponsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FutureWeaponsMod.MODID);
	public static final RegistryObject<Block> ENGENEERTABLE = REGISTRY.register("engeneertable", () -> new EngeneertableBlock());
	public static final RegistryObject<Block> SEREBROORE = REGISTRY.register("serebroore", () -> new SerebrooreBlock());
	public static final RegistryObject<Block> VTSFTSVIFV = REGISTRY.register("vtsftsvifv", () -> new VtsftsvifvBlock());
	public static final RegistryObject<Block> TSVUTSUVUTS = REGISTRY.register("tsvutsuvuts", () -> new TsvutsuvutsBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
