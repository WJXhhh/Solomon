package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.init.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.solomon.SolomonModVariables;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureLimingDangShiTiGengXinKeShi extends ElementsSolomonMod.ModElement {
	public ProcedureLimingDangShiTiGengXinKeShi(ElementsSolomonMod instance) {
		super(instance, 271);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LimingDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LimingDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LimingDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LimingDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LimingDangShiTiGengXinKeShi!");
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
		entity.rotationYaw = (float) SolomonModVariables.MapVariables.get(world).direction;
		entity.rotationPitch = 0;
		entity.motionX = Math.sin(Math.toRadians((0 - (SolomonModVariables.MapVariables.get(world).direction))));
		entity.motionY = 0;
		entity.motionZ = Math.cos(Math.toRadians((SolomonModVariables.MapVariables.get(world).direction)));
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
			}, "effect @e[type=!player,rm=1,r=5] solomon:damagecus 1 30");
		}
		sx = (double) (-3);
		for (int index0 = 0; index0 < (int) (6); index0++) {
			sy = (double) (-3);
			for (int index1 = 0; index1 < (int) (6); index1++) {
				sz = (double) (-3);
				for (int index2 = 0; index2 < (int) (6); index2++) {
					if ((((world.getBlockState(new BlockPos((int) (x + (sx)), (int) ((y + (sy)) + 1), (int) (z + (sz))))).getBlock() == Blocks.AIR
							.getDefaultState().getBlock())
							&& (!(((world.getBlockState(new BlockPos((int) (x + (sx)), (int) (y + (sy)), (int) (z + (sz))))).getBlock() == Blocks.AIR
									.getDefaultState().getBlock())
									|| (((world.getBlockState(new BlockPos((int) (x + (sx)), (int) (y + (sy)), (int) (z + (sz)))))
											.getBlock() == Blocks.FIRE.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) (x + (sx)), (int) (y + (sy)), (int) (z + (sz)))))
													.getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock())
													|| (((world.getBlockState(new BlockPos((int) (x + (sx)), (int) (y + (sy)), (int) (z + (sz)))))
															.getBlock() == Blocks.WATER.getDefaultState().getBlock())
															|| (((world.getBlockState(
																	new BlockPos((int) (x + (sx)), (int) (y + (sy)), (int) (z + (sz)))))
																			.getBlock() == Blocks.FLOWING_LAVA.getDefaultState().getBlock())
																	|| ((world.getBlockState(
																			new BlockPos((int) (x + (sx)), (int) (y + (sy)), (int) (z + (sz)))))
																					.getBlock() == Blocks.LAVA.getDefaultState().getBlock()))))))))) {
						world.setBlockState(new BlockPos((int) (x + (sx)), (int) ((y + (sy)) + 1), (int) (z + (sz))), Blocks.FIRE.getDefaultState(),
								3);
					}
					sz = (double) ((sz) + 1);
				}
				sy = (double) ((sy) + 1);
			}
			sx = (double) ((sx) + 1);
		}
		if (((entity.getEntityData().getDouble("time")) > 80)) {
			(entity).world.removeEntity(entity);
		}
	}
}
