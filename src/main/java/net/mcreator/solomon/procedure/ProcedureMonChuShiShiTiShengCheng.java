package net.mcreator.solomon.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureMonChuShiShiTiShengCheng extends ElementsSolomonMod.ModElement {
	public ProcedureMonChuShiShiTiShengCheng(ElementsSolomonMod instance) {
		super(instance, 216);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MonChuShiShiTiShengCheng!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MonChuShiShiTiShengCheng!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MonChuShiShiTiShengCheng!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MonChuShiShiTiShengCheng!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MonChuShiShiTiShengCheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double LL_long = 0;
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u00A76\u739B\u95E8\u637B\u4E86\u637B\u6307"));
		}
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 10, (int) 1));
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
