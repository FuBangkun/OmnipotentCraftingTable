
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.omnipitentcraftingtable.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.omnipitentcraftingtable.item.WoodenArmorItem;
import net.mcreator.omnipitentcraftingtable.item.TinyCoalItem;
import net.mcreator.omnipitentcraftingtable.item.TinyCharcoalItem;
import net.mcreator.omnipitentcraftingtable.OmnipotentcraftingtableMod;

public class OmnipotentcraftingtableModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OmnipotentcraftingtableMod.MODID);
	public static final RegistryObject<Item> TINY_COAL = REGISTRY.register("tiny_coal", () -> new TinyCoalItem());
	public static final RegistryObject<Item> TINY_CHARCOAL = REGISTRY.register("tiny_charcoal", () -> new TinyCharcoalItem());
	public static final RegistryObject<Item> WOODEN_ARMOR_HELMET = REGISTRY.register("wooden_armor_helmet", () -> new WoodenArmorItem.Helmet());
	public static final RegistryObject<Item> WOODEN_ARMOR_CHESTPLATE = REGISTRY.register("wooden_armor_chestplate",
			() -> new WoodenArmorItem.Chestplate());
	public static final RegistryObject<Item> WOODEN_ARMOR_LEGGINGS = REGISTRY.register("wooden_armor_leggings", () -> new WoodenArmorItem.Leggings());
	public static final RegistryObject<Item> WOODEN_ARMOR_BOOTS = REGISTRY.register("wooden_armor_boots", () -> new WoodenArmorItem.Boots());
}
