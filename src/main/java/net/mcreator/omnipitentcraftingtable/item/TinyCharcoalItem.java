
package net.mcreator.omnipitentcraftingtable.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.omnipitentcraftingtable.OmnipotentcraftingtableModElements;

@OmnipotentcraftingtableModElements.ModElement.Tag
public class TinyCharcoalItem extends OmnipotentcraftingtableModElements.ModElement {
	@ObjectHolder("omnipotentcraftingtable:tiny_charcoal")
	public static final Item block = null;

	public TinyCharcoalItem(OmnipotentcraftingtableModElements instance) {
		super(instance, 114);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("tiny_charcoal");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
