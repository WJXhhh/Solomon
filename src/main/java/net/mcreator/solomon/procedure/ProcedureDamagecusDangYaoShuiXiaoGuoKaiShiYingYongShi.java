package net.mcreator.solomon.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.mcreator.solomon.ElementsSolomonMod;
import net.mcreator.solomon.Entityutil;
import net.mcreator.solomon.potion.PotionDamagecus;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureDamagecusDangYaoShuiXiaoGuoKaiShiYingYongShi extends ElementsSolomonMod.ModElement {
	public ProcedureDamagecusDangYaoShuiXiaoGuoKaiShiYingYongShi(ElementsSolomonMod instance) {
		super(instance, 169);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DamagecusDangYaoShuiXiaoGuoKaiShiYingYongShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		EntityLivingBase entityLivingBase = (EntityLivingBase) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) Entityutil.getBuffLevelIDL(entityLivingBase, PotionDamagecus.potion) * 5);

	}
}
