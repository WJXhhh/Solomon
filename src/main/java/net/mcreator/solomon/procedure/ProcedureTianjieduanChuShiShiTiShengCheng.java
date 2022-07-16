package net.mcreator.solomon.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureTianjieduanChuShiShiTiShengCheng extends ElementsSolomonMod.ModElement {
	public ProcedureTianjieduanChuShiShiTiShengCheng(ElementsSolomonMod instance) {
		super(instance, 310);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TianjieduanChuShiShiTiShengCheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.rotationYaw = (float) entity.getEntityData().getDouble("range");
		entity.rotationPitch = 0;
	}
}
