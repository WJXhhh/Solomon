package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureRenhengDangShiTiGengXinKeShi extends ElementsSolomonMod.ModElement {
	public ProcedureRenhengDangShiTiGengXinKeShi(ElementsSolomonMod instance) {
		super(instance, 350);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RenhengDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RenhengDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RenhengDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RenhengDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RenhengDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double rangle = 0;
		double LL_long = 0;
		entity.getEntityData().setDouble("time", ((entity.getEntityData().getDouble("time")) + 1));
		entity.rotationYaw = (float)(rangle);
		entity.rotationPitch = 0;
		rangle = (double) ((rangle) + 10);
		if (((entity.getEntityData().getDouble("time")) > 18)) {
			(entity).world.removeEntity(entity);
		}
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
