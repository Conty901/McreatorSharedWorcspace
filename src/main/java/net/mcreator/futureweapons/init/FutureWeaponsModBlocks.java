
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futureweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.futureweapons.block.VolframoreBlock;
import net.mcreator.futureweapons.block.Volframore2Block;
import net.mcreator.futureweapons.block.SerebrooreBlock;
import net.mcreator.futureweapons.block.OnBlock;
import net.mcreator.futureweapons.block.OffBlock;
import net.mcreator.futureweapons.block.LeadoreBlock;
import net.mcreator.futureweapons.block.Leadore2Block;
import net.mcreator.futureweapons.block.EngeneertableBlock;
import net.mcreator.futureweapons.block.BlockofwolframBlock;
import net.mcreator.futureweapons.block.BlockofwhiteserebroBlock;
import net.mcreator.futureweapons.block.BlockofserebroBlock;
import net.mcreator.futureweapons.block.BlockofleadBlock;
import net.mcreator.futureweapons.block.BlockofaluminumBlock;
import net.mcreator.futureweapons.block.AluminumoreBlock;
import net.mcreator.futureweapons.block.Aluminumore2Block;
import net.mcreator.futureweapons.FutureWeaponsMod;

public class FutureWeaponsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FutureWeaponsMod.MODID);
	public static final RegistryObject<Block> ENGENEERTABLE = REGISTRY.register("engeneertable", () -> new EngeneertableBlock());
	public static final RegistryObject<Block> SEREBROORE = REGISTRY.register("serebroore", () -> new SerebrooreBlock());
	public static final RegistryObject<Block> OFF = REGISTRY.register("off", () -> new OffBlock());
	public static final RegistryObject<Block> ON = REGISTRY.register("on", () -> new OnBlock());
	public static final RegistryObject<Block> BLOCKOFSEREBRO = REGISTRY.register("blockofserebro", () -> new BlockofserebroBlock());
	public static final RegistryObject<Block> BLOCKOFWHITESEREBRO = REGISTRY.register("blockofwhiteserebro", () -> new BlockofwhiteserebroBlock());
	public static final RegistryObject<Block> LEADORE = REGISTRY.register("leadore", () -> new LeadoreBlock());
	public static final RegistryObject<Block> LEADORE_2 = REGISTRY.register("leadore_2", () -> new Leadore2Block());
	public static final RegistryObject<Block> BLOCKOFLEAD = REGISTRY.register("blockoflead", () -> new BlockofleadBlock());
	public static final RegistryObject<Block> VOLFRAMORE = REGISTRY.register("volframore", () -> new VolframoreBlock());
	public static final RegistryObject<Block> VOLFRAMORE_2 = REGISTRY.register("volframore_2", () -> new Volframore2Block());
	public static final RegistryObject<Block> ALUMINUMORE = REGISTRY.register("aluminumore", () -> new AluminumoreBlock());
	public static final RegistryObject<Block> ALUMINUMORE_2 = REGISTRY.register("aluminumore_2", () -> new Aluminumore2Block());
	public static final RegistryObject<Block> BLOCKOFWOLFRAM = REGISTRY.register("blockofwolfram", () -> new BlockofwolframBlock());
	public static final RegistryObject<Block> BLOCKOFALUMINUM = REGISTRY.register("blockofaluminum", () -> new BlockofaluminumBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
