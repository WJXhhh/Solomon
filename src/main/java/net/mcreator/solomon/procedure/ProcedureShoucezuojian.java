package net.mcreator.solomon.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureShoucezuojian extends ElementsSolomonMod.ModElement {
	public ProcedureShoucezuojian(ElementsSolomonMod instance) {
		super(instance, 209);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Shoucezuojian!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getEntityData().getDouble("shouceyeshu")) <= 1)) {
			return (false);
		} else {
			return (true);
		}
	}
}
