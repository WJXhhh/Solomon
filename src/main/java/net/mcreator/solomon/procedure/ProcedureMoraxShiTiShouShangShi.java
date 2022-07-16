package net.mcreator.solomon.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureMoraxShiTiShouShangShi extends ElementsSolomonMod.ModElement {
	public ProcedureMoraxShiTiShouShangShi(ElementsSolomonMod instance) {
		super(instance, 384);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MoraxShiTiShouShangShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, (int) 800, (int) 5, (false), (false)));
	}
}
