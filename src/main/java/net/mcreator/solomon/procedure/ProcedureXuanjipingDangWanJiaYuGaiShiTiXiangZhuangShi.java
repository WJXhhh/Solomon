package net.mcreator.solomon.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureXuanjipingDangWanJiaYuGaiShiTiXiangZhuangShi extends ElementsSolomonMod.ModElement {
	public ProcedureXuanjipingDangWanJiaYuGaiShiTiXiangZhuangShi(ElementsSolomonMod instance) {
		super(instance, 313);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure XuanjipingDangWanJiaYuGaiShiTiXiangZhuangShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (int) 120, (int) 3));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 120, (int) 3));
	}
}
