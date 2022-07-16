package net.mcreator.solomon.procedure;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureGowinDangYouJianDianJiKongQiShi extends ElementsSolomonMod.ModElement {
	public ProcedureGowinDangYouJianDianJiKongQiShi(ElementsSolomonMod instance) {
		super(instance, 237);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure GowinDangYouJianDianJiKongQiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.isSneaking())) {
			entity.getEntityData().setString("vision", "");
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u5DF2\u6E05\u9664"), (false));
			}
		} else {
			entity.getEntityData().setString("vision", "gwi");
		}
	}
}
