package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.SolomonModVariables;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureLimingChuShiShiTiShengCheng extends ElementsSolomonMod.ModElement {
	public ProcedureLimingChuShiShiTiShengCheng(ElementsSolomonMod instance) {
		super(instance, 270);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LimingChuShiShiTiShengCheng!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LimingChuShiShiTiShengCheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		entity.rotationYaw = (float) SolomonModVariables.MapVariables.get(world).direction;
		entity.rotationPitch = 0;
		System.out.println((((SolomonModVariables.MapVariables.get(world).direction)) + "" + (null)));
	}
}
