package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.solomon.SolomonModVariables;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureWuxiangDangShiTiGengXinKeShi extends ElementsSolomonMod.ModElement {
	public ProcedureWuxiangDangShiTiGengXinKeShi(ElementsSolomonMod instance) {
		super(instance, 371);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure WuxiangDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WuxiangDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WuxiangDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WuxiangDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WuxiangDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double sx = 0;
		double sy = 0;
		double sz = 0;
		entity.getEntityData().setDouble("time", ((entity.getEntityData().getDouble("time")) + 1));
		entity.rotationYaw = (float) SolomonModVariables.MapVariables.get(world).wuxiangdire;
		entity.rotationPitch = 0;
		entity.motionX = Math.sin(Math.toRadians((0 - (SolomonModVariables.MapVariables.get(world).wuxiangdire))));
		entity.motionY = 0;
		entity.motionZ = Math.cos(Math.toRadians((SolomonModVariables.MapVariables.get(world).wuxiangdire)));
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
			}, "effect @a[r=5] solomon:damagecus 1 20");
		}
		if (((entity.getEntityData().getDouble("time")) > 80)) {
			(entity).world.removeEntity(entity);
		}
	}
}
