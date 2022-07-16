package net.mcreator.solomon.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureJiduzuzhouYaoShuiXiaoGuoChiXuShiMeiKeFaSheng extends ElementsSolomonMod.ModElement {
	public ProcedureJiduzuzhouYaoShuiXiaoGuoChiXuShiMeiKeFaSheng(ElementsSolomonMod instance) {
		super(instance, 318);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure JiduzuzhouYaoShuiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(Items.DIAMOND, (int) (1))) : false)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 4);
		}
		if (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(Items.GOLD_INGOT, (int) (1))) : false)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if (((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(Items.GOLDEN_APPLE, (int) (1), 0))
				: false)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if (((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(Items.GOLDEN_APPLE, (int) (1), 1))
				: false)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
	}
}
