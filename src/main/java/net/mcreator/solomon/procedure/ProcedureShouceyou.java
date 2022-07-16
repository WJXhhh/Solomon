package net.mcreator.solomon.procedure;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureShouceyou extends ElementsSolomonMod.ModElement {
	public ProcedureShouceyou(ElementsSolomonMod instance) {
		super(instance, 211);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Shouceyou!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getEntityData().setDouble("shouceyeshu", ((entity.getEntityData().getDouble("shouceyeshu")) + 1));
		if (entity instanceof EntityPlayer && !entity.world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(
					new TextComponentString((("\u9875\u6570") + "" + ((entity.getEntityData().getDouble("shouceyeshu"))))), (false));
		}
	}
}
