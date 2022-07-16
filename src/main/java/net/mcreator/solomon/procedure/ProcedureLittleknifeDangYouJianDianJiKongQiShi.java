package net.mcreator.solomon.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.item.ItemBloodAnbo;
import net.mcreator.solomon.item.ItemAnbo;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureLittleknifeDangYouJianDianJiKongQiShi extends ElementsSolomonMod.ModElement {
	public ProcedureLittleknifeDangYouJianDianJiKongQiShi(ElementsSolomonMod instance) {
		super(instance, 169);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LittleknifeDangYouJianDianJiKongQiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemAnbo.block, (int) (1))) : false)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemBloodAnbo.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemAnbo.block, (int) (1)).getItem(), -1, (int) 1, null);
		} else {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u4F60\u6CA1\u6709\u74F6\u5B50\uFF01"), (false));
			}
		}
	}
}
