package net.mcreator.solomon.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.item.ItemVlw;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureTartagliaBowKeYiShiYongYuanChengWuPinDeTiaoJian extends ElementsSolomonMod.ModElement {
	public ProcedureTartagliaBowKeYiShiYongYuanChengWuPinDeTiaoJian(ElementsSolomonMod instance) {
		super(instance, 391);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TartagliaBowKeYiShiYongYuanChengWuPinDeTiaoJian!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemVlw.block, (int) (1))) : false)) {
			return (true);
		}
		return (false);
	}
}
