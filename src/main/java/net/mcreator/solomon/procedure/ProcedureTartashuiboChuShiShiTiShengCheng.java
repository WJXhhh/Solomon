package net.mcreator.solomon.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Random;
import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureTartashuiboChuShiShiTiShengCheng extends ElementsSolomonMod.ModElement {
	public ProcedureTartashuiboChuShiShiTiShengCheng(ElementsSolomonMod instance) {
		super(instance, 394);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TartashuiboChuShiShiTiShengCheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.rotationYaw = (((new Random()).nextInt((int) 360 + 1)) - 180);
		entity.rotationPitch = (((new Random()).nextInt((int) 360 + 1)) - 180);
	}
}
