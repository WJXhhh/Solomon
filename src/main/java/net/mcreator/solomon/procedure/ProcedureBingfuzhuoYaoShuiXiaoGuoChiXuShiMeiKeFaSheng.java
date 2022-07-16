package net.mcreator.solomon.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.potion.PotionWaterfuzhuo;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;
import java.util.Collection;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureBingfuzhuoYaoShuiXiaoGuoChiXuShiMeiKeFaSheng extends ElementsSolomonMod.ModElement {
	public ProcedureBingfuzhuoYaoShuiXiaoGuoChiXuShiMeiKeFaSheng(ElementsSolomonMod instance) {
		super(instance, 291);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BingfuzhuoYaoShuiXiaoGuoChiXuShiMeiKeFaSheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == PotionWaterfuzhuo.potion)
							return true;
					}
				}
				return false;
			}
		}.check())) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 5, (int) 4));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, (int) 5, (int) 4));
		}
	}
}
