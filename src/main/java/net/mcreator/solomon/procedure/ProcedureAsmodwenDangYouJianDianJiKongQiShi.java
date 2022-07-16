package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.gui.GuiAsmodwenxian;
import net.mcreator.solomon.SolomonMod;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureAsmodwenDangYouJianDianJiKongQiShi extends ElementsSolomonMod.ModElement {
	public ProcedureAsmodwenDangYouJianDianJiKongQiShi(ElementsSolomonMod instance) {
		super(instance, 185);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AsmodwenDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AsmodwenDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AsmodwenDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AsmodwenDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AsmodwenDangYouJianDianJiKongQiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(SolomonMod.instance, GuiAsmodwenxian.GUIID, world, x, y, z);
	}
}
