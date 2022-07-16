package net.mcreator.solomon.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureBaoshishitudangshitigengxinke extends ElementsSolomonMod.ModElement {
	public ProcedureBaoshishitudangshitigengxinke(ElementsSolomonMod instance) {
		super(instance, 191);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Baoshishitudangshitigengxinke!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Baoshishitudangshitigengxinke!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Baoshishitudangshitigengxinke!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Baoshishitudangshitigengxinke!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Baoshishitudangshitigengxinke!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		entity.getEntityData().setDouble("jineng", ((entity.getEntityData().getDouble("jineng")) + 1));
		if ((200 < (entity.getEntityData().getDouble("jineng")))) {
			world.playSound((EntityPlayer) null, x, y, z,
					(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("solomon:bsstjineng")),
					SoundCategory.NEUTRAL, (float) 3, (float) 1);
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, x, y, z, (int) 5, 3, 3, 3, 1, new int[0]);
			if (!world.isRemote && world.getMinecraftServer() != null) {
				world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
					@Override
					public String getName() {
						return "";
					}

					@Override
					public boolean canUseCommand(int permission, String command) {
						return true;
					}

					@Override
					public World getEntityWorld() {
						return world;
					}

					@Override
					public MinecraftServer getServer() {
						return world.getMinecraftServer();
					}

					@Override
					public boolean sendCommandFeedback() {
						return false;
					}

					@Override
					public BlockPos getPosition() {
						return new BlockPos((int) x, (int) y, (int) z);
					}

					@Override
					public Vec3d getPositionVector() {
						return new Vec3d(x, y, z);
					}
				}, "summon minecraft:area_effect_cloud ~ ~ ~ {Effects:[{Id:17,Amplifier:9,Duration:100},{Id:7,Amplifier:1,Duration:40}],WaitTime:0,ReapplicationDelay:2,Age:0,Duration:10,Particle:spell,Color:2155646,Radius:5}");
			}
			entity.getEntityData().setDouble("jineng", 0);
		}
	}
}
