package net.mcreator.solomon.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureVisioncd extends ElementsSolomonMod.ModElement {
	public ProcedureVisioncd(ElementsSolomonMod instance) {
		super(instance, 249);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Visioncd!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getEntityData().getDouble("vcd")) > 0)) {
			entity.getEntityData().setDouble("vcd", ((entity.getEntityData().getDouble("vcd")) - 1));
		}
		if (((entity.getEntityData().getDouble("dacd")) > 0)) {
			entity.getEntityData().setDouble("dacd", ((entity.getEntityData().getDouble("dacd")) - 1));
		}
	}
}
