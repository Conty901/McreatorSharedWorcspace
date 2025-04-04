
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futureweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.futureweapons.item.WolframnuggetItem;
import net.mcreator.futureweapons.item.WolframItem;
import net.mcreator.futureweapons.item.WhiteserebroItem;
import net.mcreator.futureweapons.item.WhitesIlvernuggetItem;
import net.mcreator.futureweapons.item.TestweighteditremoveItem;
import net.mcreator.futureweapons.item.TestweighteditaddItem;
import net.mcreator.futureweapons.item.SerebrorawItem;
import net.mcreator.futureweapons.item.SerebroingotItem;
import net.mcreator.futureweapons.item.SerebroItem;
import net.mcreator.futureweapons.item.SchematickingalItem;
import net.mcreator.futureweapons.item.SchematicelectroswordItem;
import net.mcreator.futureweapons.item.RawwolframItem;
import net.mcreator.futureweapons.item.RawlithiumItem;
import net.mcreator.futureweapons.item.RawleadItem;
import net.mcreator.futureweapons.item.RawaluminumItem;
import net.mcreator.futureweapons.item.RailgunItem;
import net.mcreator.futureweapons.item.MolotItem;
import net.mcreator.futureweapons.item.LithiumnuggetItem;
import net.mcreator.futureweapons.item.LithiumingotItem;
import net.mcreator.futureweapons.item.LeadnuggetItem;
import net.mcreator.futureweapons.item.LeadnuggeItem;
import net.mcreator.futureweapons.item.LeadingotItem;
import net.mcreator.futureweapons.item.LeadItem;
import net.mcreator.futureweapons.item.KingalosnovaItem;
import net.mcreator.futureweapons.item.KingallezvieItem;
import net.mcreator.futureweapons.item.KingalItem;
import net.mcreator.futureweapons.item.KatanaItem;
import net.mcreator.futureweapons.item.ElectswruchkaItem;
import net.mcreator.futureweapons.item.ElectricswordItem;
import net.mcreator.futureweapons.item.ElectracumItem;
import net.mcreator.futureweapons.item.BionicheartItem;
import net.mcreator.futureweapons.item.Bionicheart2Item;
import net.mcreator.futureweapons.item.AluminumnuggetItem;
import net.mcreator.futureweapons.item.AluminumingotItem;
import net.mcreator.futureweapons.item.AcidgunItem;
import net.mcreator.futureweapons.item.ACUMEMPTYItem;
import net.mcreator.futureweapons.FutureWeaponsMod;

public class FutureWeaponsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FutureWeaponsMod.MODID);
	public static final RegistryObject<Item> KINGAL = REGISTRY.register("kingal", () -> new KingalItem());
	public static final RegistryObject<Item> ELECTRICSWORD = REGISTRY.register("electricsword", () -> new ElectricswordItem());
	public static final RegistryObject<Item> ENGENEERTABLE = block(FutureWeaponsModBlocks.ENGENEERTABLE);
	public static final RegistryObject<Item> SCHEMATICKINGAL = REGISTRY.register("schematickingal", () -> new SchematickingalItem());
	public static final RegistryObject<Item> BIONICHEART = REGISTRY.register("bionicheart", () -> new BionicheartItem());
	public static final RegistryObject<Item> BIONICHEART_2 = REGISTRY.register("bionicheart_2", () -> new Bionicheart2Item());
	public static final RegistryObject<Item> TESTWEIGHTEDITADD = REGISTRY.register("testweighteditadd", () -> new TestweighteditaddItem());
	public static final RegistryObject<Item> TESTWEIGHTEDITREMOVE = REGISTRY.register("testweighteditremove", () -> new TestweighteditremoveItem());
	public static final RegistryObject<Item> KINGALLEZVIE = REGISTRY.register("kingallezvie", () -> new KingallezvieItem());
	public static final RegistryObject<Item> KINGALOSNOVA = REGISTRY.register("kingalosnova", () -> new KingalosnovaItem());
	public static final RegistryObject<Item> MOLOT = REGISTRY.register("molot", () -> new MolotItem());
	public static final RegistryObject<Item> ELECTSWRUCHKA = REGISTRY.register("electswruchka", () -> new ElectswruchkaItem());
	public static final RegistryObject<Item> ELECTRACUM = REGISTRY.register("electracum", () -> new ElectracumItem());
	public static final RegistryObject<Item> ACUMEMPTY = REGISTRY.register("acumempty", () -> new ACUMEMPTYItem());
	public static final RegistryObject<Item> SCHEMATICELECTROSWORD = REGISTRY.register("schematicelectrosword", () -> new SchematicelectroswordItem());
	public static final RegistryObject<Item> SEREBRORAW = REGISTRY.register("serebroraw", () -> new SerebrorawItem());
	public static final RegistryObject<Item> SEREBROORE = block(FutureWeaponsModBlocks.SEREBROORE);
	public static final RegistryObject<Item> SEREBRO = REGISTRY.register("serebro", () -> new SerebroItem());
	public static final RegistryObject<Item> WHITESEREBRO = REGISTRY.register("whiteserebro", () -> new WhiteserebroItem());
	public static final RegistryObject<Item> OFF = block(FutureWeaponsModBlocks.OFF);
	public static final RegistryObject<Item> ON = block(FutureWeaponsModBlocks.ON);
	public static final RegistryObject<Item> KATANA = REGISTRY.register("katana", () -> new KatanaItem());
	public static final RegistryObject<Item> BLOCKOFSEREBRO = block(FutureWeaponsModBlocks.BLOCKOFSEREBRO);
	public static final RegistryObject<Item> BLOCKOFWHITESEREBRO = block(FutureWeaponsModBlocks.BLOCKOFWHITESEREBRO);
	public static final RegistryObject<Item> KOBALT = REGISTRY.register("kobalt", () -> new LeadItem());
	public static final RegistryObject<Item> LEADORE = block(FutureWeaponsModBlocks.LEADORE);
	public static final RegistryObject<Item> LEADORE_2 = block(FutureWeaponsModBlocks.LEADORE_2);
	public static final RegistryObject<Item> RAWLEAD = REGISTRY.register("rawlead", () -> new RawleadItem());
	public static final RegistryObject<Item> BLOCKOFLEAD = block(FutureWeaponsModBlocks.BLOCKOFLEAD);
	public static final RegistryObject<Item> VOLFRAMORE = block(FutureWeaponsModBlocks.VOLFRAMORE);
	public static final RegistryObject<Item> VOLFRAMORE_2 = block(FutureWeaponsModBlocks.VOLFRAMORE_2);
	public static final RegistryObject<Item> RAWWOLFRAM = REGISTRY.register("rawwolfram", () -> new RawwolframItem());
	public static final RegistryObject<Item> WOLFRAM = REGISTRY.register("wolfram", () -> new WolframItem());
	public static final RegistryObject<Item> ALUMINUMORE = block(FutureWeaponsModBlocks.ALUMINUMORE);
	public static final RegistryObject<Item> ALUMINUMORE_2 = block(FutureWeaponsModBlocks.ALUMINUMORE_2);
	public static final RegistryObject<Item> RAWALUMINUM = REGISTRY.register("rawaluminum", () -> new RawaluminumItem());
	public static final RegistryObject<Item> ALUMINUMINGOT = REGISTRY.register("aluminumingot", () -> new AluminumingotItem());
	public static final RegistryObject<Item> BLOCKOFWOLFRAM = block(FutureWeaponsModBlocks.BLOCKOFWOLFRAM);
	public static final RegistryObject<Item> BLOCKOFALUMINUM = block(FutureWeaponsModBlocks.BLOCKOFALUMINUM);
	public static final RegistryObject<Item> SEREBROINGOT = REGISTRY.register("serebroingot", () -> new SerebroingotItem());
	public static final RegistryObject<Item> WHITES_ILVERNUGGET = REGISTRY.register("whites_ilvernugget", () -> new WhitesIlvernuggetItem());
	public static final RegistryObject<Item> LEADNUGGET = REGISTRY.register("leadnugget", () -> new LeadnuggetItem());
	public static final RegistryObject<Item> WOLFRAMNUGGET = REGISTRY.register("wolframnugget", () -> new WolframnuggetItem());
	public static final RegistryObject<Item> ALUMINUMNUGGET = REGISTRY.register("aluminumnugget", () -> new AluminumnuggetItem());
	public static final RegistryObject<Item> LEADINGOT = REGISTRY.register("leadingot", () -> new LeadingotItem());
	public static final RegistryObject<Item> LEADNUGGE = REGISTRY.register("leadnugge", () -> new LeadnuggeItem());
	public static final RegistryObject<Item> BLOCKOFLEA = block(FutureWeaponsModBlocks.BLOCKOFLEA);
	public static final RegistryObject<Item> LITHIUMORE = block(FutureWeaponsModBlocks.LITHIUMORE);
	public static final RegistryObject<Item> LITHIUMORE_2 = block(FutureWeaponsModBlocks.LITHIUMORE_2);
	public static final RegistryObject<Item> RAWLITHIUM = REGISTRY.register("rawlithium", () -> new RawlithiumItem());
	public static final RegistryObject<Item> LITHIUMINGOT = REGISTRY.register("lithiumingot", () -> new LithiumingotItem());
	public static final RegistryObject<Item> LITHIUMNUGGET = REGISTRY.register("lithiumnugget", () -> new LithiumnuggetItem());
	public static final RegistryObject<Item> BLOCKOFLITHIUM = block(FutureWeaponsModBlocks.BLOCKOFLITHIUM);
	public static final RegistryObject<Item> ACIDGUN = REGISTRY.register("acidgun", () -> new AcidgunItem());
	public static final RegistryObject<Item> RAILGUN = REGISTRY.register("railgun", () -> new RailgunItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
