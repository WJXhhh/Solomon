package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.effect.EntityLightningBolt;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureRen5ChuShiShiTiShengCheng extends ElementsSolomonMod.ModElement {
	public ProcedureRen5ChuShiShiTiShengCheng(ElementsSolomonMod instance) {
		super(instance, 370);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Ren5ChuShiShiTiShengCheng!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Ren5ChuShiShiTiShengCheng!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Ren5ChuShiShiTiShengCheng!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Ren5ChuShiShiTiShengCheng!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double LL_long = 0;
		LL_long = (double) 1;
		for (int index0 = 0; index0 < (int) (5); index0++) {
			world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + (LL_long)), (int) y, (int) z, false));
			world.addWeatherEffect(new EntityLightningBolt(world, (int) (x - (LL_long)), (int) y, (int) z, false));
			world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) (z - (LL_long)), false));
			world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) (z + (LL_long)), false));
			LL_long = (double) ((LL_long) + 1);
		}
	}
}
