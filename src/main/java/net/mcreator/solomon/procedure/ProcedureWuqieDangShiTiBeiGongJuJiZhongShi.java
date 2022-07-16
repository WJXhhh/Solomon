package net.mcreator.solomon.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureWuqieDangShiTiBeiGongJuJiZhongShi extends ElementsSolomonMod.ModElement {
	public ProcedureWuqieDangShiTiBeiGongJuJiZhongShi(ElementsSolomonMod instance) {
		super(instance, 160);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure WuqieDangShiTiBeiGongJuJiZhongShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 96);
		entity.attackEntityFrom(DamageSource.LIGHTNING_BOLT, (float) 20);
	}
}
