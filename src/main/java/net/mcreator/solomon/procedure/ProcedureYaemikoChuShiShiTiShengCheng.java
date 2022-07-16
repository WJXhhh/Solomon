package net.mcreator.solomon.procedure;

import net.minecraft.world.World;

import net.mcreator.solomon.SolomonModVariables;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureYaemikoChuShiShiTiShengCheng extends ElementsSolomonMod.ModElement {
	public ProcedureYaemikoChuShiShiTiShengCheng(ElementsSolomonMod instance) {
		super(instance, 348);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure YaemikoChuShiShiTiShengCheng!");
			return;
		}
		World world = (World) dependencies.get("world");
		SolomonModVariables.MapVariables.get(world).shashengyingnum = (double) 0;
		SolomonModVariables.MapVariables.get(world).syncData(world);
		SolomonModVariables.MapVariables.get(world).yaealive = (boolean) (true);
		SolomonModVariables.MapVariables.get(world).syncData(world);
	}
}
