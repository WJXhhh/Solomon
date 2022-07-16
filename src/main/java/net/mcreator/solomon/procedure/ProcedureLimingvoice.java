package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureLimingvoice extends ElementsSolomonMod.ModElement {
	public ProcedureLimingvoice(ElementsSolomonMod instance) {
		super(instance, 272);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Limingvoice!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Limingvoice!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Limingvoice!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Limingvoice!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((0.34 > Math.random())) {
			world.playSound((EntityPlayer) null, x, y, z,
					(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("solomon:liming1")),
					SoundCategory.NEUTRAL, (float) 4, (float) 1);
		} else if ((0.34 > Math.random())) {
			world.playSound((EntityPlayer) null, x, y, z,
					(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("solomon:liming2")),
					SoundCategory.NEUTRAL, (float) 4, (float) 1);
		} else {
			world.playSound((EntityPlayer) null, x, y, z,
					(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("solomon:liming3")),
					SoundCategory.NEUTRAL, (float) 4, (float) 1);
		}
	}
}
