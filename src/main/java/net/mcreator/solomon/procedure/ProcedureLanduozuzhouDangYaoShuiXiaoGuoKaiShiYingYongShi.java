package net.mcreator.solomon.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.item.ItemLanduogengpai;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureLanduozuzhouDangYaoShuiXiaoGuoKaiShiYingYongShi extends ElementsSolomonMod.ModElement {
	public ProcedureLanduozuzhouDangYaoShuiXiaoGuoKaiShiYingYongShi(ElementsSolomonMod instance) {
		super(instance, 280);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LanduozuzhouDangYaoShuiXiaoGuoKaiShiYingYongShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemLanduogengpai.block, (int) (1)))
				: false))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 60, (int) 1));
		}
	}
}
