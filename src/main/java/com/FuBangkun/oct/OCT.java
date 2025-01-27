/*
 * Copyright (c) 2025 FuBangkun. All Rights Reserved.
 */

package com.FuBangkun.oct;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Tags.MOD_ID, name = Tags.MOD_NAME, version = Tags.VERSION)
public class OCT {
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		FurnaceRecipes furnaceRecipes = FurnaceRecipes.instance();
		int            recipeCount    = 0;
		for (ItemStack input : furnaceRecipes.getSmeltingList().keySet()) {
			ItemStack output = furnaceRecipes.getSmeltingResult(input);
			GameRegistry.addShapelessRecipe(new ResourceLocation(Tags.MOD_ID, "smelting_" + recipeCount), null, output, Ingredient.fromStacks(input), Ingredient.fromStacks(new ItemStack(ItemInitializer.tinyCoal)));
			recipeCount++;
			GameRegistry.addShapelessRecipe(new ResourceLocation(Tags.MOD_ID, "smelting_charcoal_" + recipeCount), null, output, Ingredient.fromStacks(input), Ingredient.fromStacks(new ItemStack(ItemInitializer.tinyCharcoal)));
			recipeCount++;
		}
	}

	@Mod.EventBusSubscriber(modid = Tags.MOD_ID)
	public static final class ItemInitializer {
		public static Item tinyCoal;
		public static Item tinyCharcoal;

		@SubscribeEvent
		public static void registerItem(RegistryEvent.Register<Item> event) {
			event.getRegistry().registerAll(
					tinyCoal = new Item() {
						@Override
						public int getItemBurnTime(ItemStack itemStack) {
							return 200;
						}
					}.setRegistryName("oct:tiny_coal").setTranslationKey("oct.tiny_coal").setCreativeTab(CreativeTabs.MISC),
					tinyCharcoal = new Item() {
						@Override
						public int getItemBurnTime(ItemStack itemStack) {
							return 200;
						}
					}.setRegistryName("oct:tiny_charcoal").setTranslationKey("oct.tiny_charcoal").setCreativeTab(CreativeTabs.MISC)
			);
		}
	}

	@Mod.EventBusSubscriber(value = Side.CLIENT, modid = Tags.MOD_ID)
	public static final class ModelMapper {
		@SubscribeEvent
		public static void onModelReg(ModelRegistryEvent event) {
			ModelLoader.setCustomModelResourceLocation(ItemInitializer.tinyCoal, 0, new ModelResourceLocation("oct:tiny_coal", "inventory"));
			ModelLoader.setCustomModelResourceLocation(ItemInitializer.tinyCharcoal, 0, new ModelResourceLocation("oct:tiny_charcoal", "inventory"));
		}
	}
}
