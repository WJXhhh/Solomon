package net.mcreator.solomon.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureShoucehehDangWuPinZaiBeiBaoZhongMeiKeFaSheng extends ElementsSolomonMod.ModElement {
	public ProcedureShoucehehDangWuPinZaiBeiBaoZhongMeiKeFaSheng(ElementsSolomonMod instance) {
		super(instance, 206);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ShoucehehDangWuPinZaiBeiBaoZhongMeiKeFaSheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getEntityData().getDouble("shouceyeshu")) < 1)) {
			entity.getEntityData().setDouble("shouceyeshu", 1);
		}
	}
}
