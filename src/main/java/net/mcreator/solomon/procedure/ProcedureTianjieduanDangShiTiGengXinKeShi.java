package net.mcreator.solomon.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureTianjieduanDangShiTiGengXinKeShi extends ElementsSolomonMod.ModElement {
	public ProcedureTianjieduanDangShiTiGengXinKeShi(ElementsSolomonMod instance) {
		super(instance, 308);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TianjieduanDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double sx = 0;
		double sy = 0;
		double sz = 0;
		entity.getEntityData().setDouble("time", ((entity.getEntityData().getDouble("time")) + 1));
		entity.rotationYaw = (float) entity.getEntityData().getDouble("range");
		entity.rotationPitch = 0;
		if (((entity.getEntityData().getDouble("time")) > 10)) {
			(entity).world.removeEntity(entity);
		}
	}
}
