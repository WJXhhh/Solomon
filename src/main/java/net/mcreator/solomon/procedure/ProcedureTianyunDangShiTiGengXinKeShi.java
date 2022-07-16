package net.mcreator.solomon.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureTianyunDangShiTiGengXinKeShi extends ElementsSolomonMod.ModElement {
	public ProcedureTianyunDangShiTiGengXinKeShi(ElementsSolomonMod instance) {
		super(instance, 262);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TianyunDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getEntityData().setDouble("time", ((entity.getEntityData().getDouble("time")) + 1));
		if (((entity.getEntityData().getDouble("time")) > 120)) {
			(entity).world.removeEntity(entity);
		}
	}
}
