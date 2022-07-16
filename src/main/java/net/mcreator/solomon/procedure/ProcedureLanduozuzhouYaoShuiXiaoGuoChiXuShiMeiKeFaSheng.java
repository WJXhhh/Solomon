package net.mcreator.solomon.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.item.ItemLanduogengpai;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureLanduozuzhouYaoShuiXiaoGuoChiXuShiMeiKeFaSheng extends ElementsSolomonMod.ModElement {
	public ProcedureLanduozuzhouYaoShuiXiaoGuoChiXuShiMeiKeFaSheng(ElementsSolomonMod instance) {
		super(instance, 281);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LanduozuzhouYaoShuiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemLanduogengpai.block, (int) (1)))
				: false))) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 2);
		}
	}
}
