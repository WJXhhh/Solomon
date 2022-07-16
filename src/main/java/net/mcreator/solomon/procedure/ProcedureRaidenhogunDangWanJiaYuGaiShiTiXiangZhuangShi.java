package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.effect.EntityLightningBolt;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureRaidenhogunDangWanJiaYuGaiShiTiXiangZhuangShi extends ElementsSolomonMod.ModElement {
	public ProcedureRaidenhogunDangWanJiaYuGaiShiTiXiangZhuangShi(ElementsSolomonMod instance) {
		super(instance, 359);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RaidenhogunDangWanJiaYuGaiShiTiXiangZhuangShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RaidenhogunDangWanJiaYuGaiShiTiXiangZhuangShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RaidenhogunDangWanJiaYuGaiShiTiXiangZhuangShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RaidenhogunDangWanJiaYuGaiShiTiXiangZhuangShi!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) z, false));
	}
}
