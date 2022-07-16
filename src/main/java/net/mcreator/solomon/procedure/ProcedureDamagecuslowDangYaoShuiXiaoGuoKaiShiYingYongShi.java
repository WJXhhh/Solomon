package net.mcreator.solomon.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureDamagecuslowDangYaoShuiXiaoGuoKaiShiYingYongShi extends ElementsSolomonMod.ModElement {
	public ProcedureDamagecuslowDangYaoShuiXiaoGuoKaiShiYingYongShi(ElementsSolomonMod instance) {
		super(instance, 265);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DamagecuslowDangYaoShuiXiaoGuoKaiShiYingYongShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 5);
	}
}
