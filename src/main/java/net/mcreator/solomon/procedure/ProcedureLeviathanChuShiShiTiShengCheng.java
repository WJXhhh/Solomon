package net.mcreator.solomon.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.effect.EntityLightningBolt;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureLeviathanChuShiShiTiShengCheng extends ElementsSolomonMod.ModElement {
	public ProcedureLeviathanChuShiShiTiShengCheng(ElementsSolomonMod instance) {
		super(instance, 321);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LeviathanChuShiShiTiShengCheng!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LeviathanChuShiShiTiShengCheng!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LeviathanChuShiShiTiShengCheng!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LeviathanChuShiShiTiShengCheng!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double LL_long = 0;
		LL_long = (double) 2;
		for (int index0 = 0; index0 < (int) (5); index0++) {
			world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + (LL_long)), (int) y, (int) z, false));
			world.addWeatherEffect(new EntityLightningBolt(world, (int) (x - (LL_long)), (int) y, (int) z, false));
			world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) (z - (LL_long)), false));
			world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) (z + (LL_long)), false));
			LL_long = (double) ((LL_long) + 1);
		}
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u00A7b\u5229\u7EF4\u5766\u77A7\u7740\u4F60\u7684\u73CD\u7269"));
		}
	}
}
