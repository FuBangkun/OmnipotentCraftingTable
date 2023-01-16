
package net.mcreator.omnipitentcraftingtable.item.extension;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.omnipitentcraftingtable.item.TinyCoalItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TinyCoalFuelItemExtension {
	@Mod.EventBusSubscriber
	public static class Fuel {
		@SubscribeEvent
		public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
			ItemStack itemstack = event.getItemStack();
			if (itemstack.getItem() == TinyCoalItem.block)

				event.setBurnTime(200);
		}
	}
}
