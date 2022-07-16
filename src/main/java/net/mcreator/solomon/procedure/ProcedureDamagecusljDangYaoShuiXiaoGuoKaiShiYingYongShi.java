package net.mcreator.solomon.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureDamagecusljDangYaoShuiXiaoGuoKaiShiYingYongShi extends ElementsSolomonMod.ModElement {
	public ProcedureDamagecusljDangYaoShuiXiaoGuoKaiShiYingYongShi(ElementsSolomonMod instance) {
		super(instance, 273);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DamagecusljDangYaoShuiXiaoGuoKaiShiYingYongShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 12);
	}
}
