
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.omnipitentcraftingtable.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class OmnipotentcraftingtableModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == OmnipotentcraftingtableModItems.TINY_COAL.get())
			event.setBurnTime(200);
		else if (itemstack.getItem() == OmnipotentcraftingtableModItems.TINY_CHARCOAL.get())
			event.setBurnTime(200);
	}
}
