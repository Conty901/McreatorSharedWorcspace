
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futureweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.futureweapons.block.entity.VtsftsvifvBlockEntity;
import net.mcreator.futureweapons.block.entity.TsvutsuvutsBlockEntity;
import net.mcreator.futureweapons.block.entity.OnBlockEntity;
import net.mcreator.futureweapons.block.entity.OffBlockEntity;
import net.mcreator.futureweapons.FutureWeaponsMod;

public class FutureWeaponsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FutureWeaponsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> VTSFTSVIFV = register("vtsftsvifv", FutureWeaponsModBlocks.VTSFTSVIFV, VtsftsvifvBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TSVUTSUVUTS = register("tsvutsuvuts", FutureWeaponsModBlocks.TSVUTSUVUTS, TsvutsuvutsBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OFF = register("off", FutureWeaponsModBlocks.OFF, OffBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ON = register("on", FutureWeaponsModBlocks.ON, OnBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
