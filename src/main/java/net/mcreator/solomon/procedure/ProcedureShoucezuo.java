package net.mcreator.solomon.procedure;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureShoucezuo extends ElementsSolomonMod.ModElement {
	public ProcedureShoucezuo(ElementsSolomonMod instance) {
		super(instance, 210);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Shoucezuo!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getEntityData().setDouble("shouceyeshu", ((entity.getEntityData().getDouble("shouceyeshu")) - 1));
		if (entity instanceof EntityPlayer && !entity.world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(
					new TextComponentString((("\u9875\u6570") + "" + ((entity.getEntityData().getDouble("shouceyeshu"))))), (false));
		}
	}
}
