package net.mcreator.solomon.procedure;

import net.minecraft.world.World;

import net.mcreator.solomon.SolomonModVariables;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureShashengyingShiTiSiWangShi extends ElementsSolomonMod.ModElement {
	public ProcedureShashengyingShiTiSiWangShi(ElementsSolomonMod instance) {
		super(instance, 345);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ShashengyingShiTiSiWangShi!");
			return;
		}
		World world = (World) dependencies.get("world");
		if ((SolomonModVariables.MapVariables.get(world).yaealive)) {
			SolomonModVariables.MapVariables
					.get(world).shashengyingnum = (double) ((SolomonModVariables.MapVariables.get(world).shashengyingnum) - 1.5);
			SolomonModVariables.MapVariables.get(world).syncData(world);
			SolomonModVariables.MapVariables.get(world).shashengyingnum = (double) (SolomonModVariables.MapVariables.get(world).shashengyingnum);
			SolomonModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
