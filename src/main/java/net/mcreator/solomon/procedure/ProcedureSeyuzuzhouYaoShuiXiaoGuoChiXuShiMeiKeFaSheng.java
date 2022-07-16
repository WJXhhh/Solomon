package net.mcreator.solomon.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.item.ItemSeyugp;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureSeyuzuzhouYaoShuiXiaoGuoChiXuShiMeiKeFaSheng extends ElementsSolomonMod.ModElement {
	public ProcedureSeyuzuzhouYaoShuiXiaoGuoChiXuShiMeiKeFaSheng(ElementsSolomonMod instance) {
		super(instance, 188);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SeyuzuzhouYaoShuiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemSeyugp.block, (int) (1)))
				: false) == (false))) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 0.5);
		}
	}
}
