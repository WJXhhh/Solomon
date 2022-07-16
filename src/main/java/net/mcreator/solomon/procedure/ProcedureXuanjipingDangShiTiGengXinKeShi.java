package net.mcreator.solomon.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureXuanjipingDangShiTiGengXinKeShi extends ElementsSolomonMod.ModElement {
	public ProcedureXuanjipingDangShiTiGengXinKeShi(ElementsSolomonMod instance) {
		super(instance, 312);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure XuanjipingDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getEntityData().setDouble("time", ((entity.getEntityData().getDouble("time")) + 1));
		if (((entity.getEntityData().getDouble("time")) > 160)) {
			(entity).world.removeEntity(entity);
		}
	}
}
