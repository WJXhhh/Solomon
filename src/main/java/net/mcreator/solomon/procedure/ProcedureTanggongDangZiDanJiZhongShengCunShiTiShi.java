package net.mcreator.solomon.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureTanggongDangZiDanJiZhongShengCunShiTiShi extends ElementsSolomonMod.ModElement {
	public ProcedureTanggongDangZiDanJiZhongShengCunShiTiShi(ElementsSolomonMod instance) {
		super(instance, 224);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TanggongDangZiDanJiZhongShengCunShiTiShi!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure TanggongDangZiDanJiZhongShengCunShiTiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) (sourceentity.getEntityData().getDouble("gongdeshanghai")));
	}
}
