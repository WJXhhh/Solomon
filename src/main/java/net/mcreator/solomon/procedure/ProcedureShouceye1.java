package net.mcreator.solomon.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureShouceye1 extends ElementsSolomonMod.ModElement {
	public ProcedureShouceye1(ElementsSolomonMod instance) {
		super(instance, 204);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Shouceye1!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double shouce = 0;
		if (((entity.getEntityData().getDouble("shouceyeshu")) == 1)) {
			return (true);
		} else {
			return (false);
		}
	}
}
