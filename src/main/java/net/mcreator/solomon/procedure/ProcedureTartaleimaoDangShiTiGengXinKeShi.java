package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.init.Blocks;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureTartaleimaoDangShiTiGengXinKeShi extends ElementsSolomonMod.ModElement {
	public ProcedureTartaleimaoDangShiTiGengXinKeShi(ElementsSolomonMod instance) {
		super(instance, 397);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TartaleimaoDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure TartaleimaoDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure TartaleimaoDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure TartaleimaoDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TartaleimaoDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean found = false;
		double sx = 0;
		double sz = 0;
		sx = (double) (-1);
		found = (boolean) (false);
		for (int index0 = 0; index0 < (int) (3); index0++) {
			sz = (double) (-1);
			for (int index1 = 0; index1 < (int) (3); index1++) {
				if ((!((world.getBlockState(new BlockPos((int) (x + (sx)), (int) (y - 1), (int) (z + (sz))))).getBlock() == Blocks.AIR
						.getDefaultState().getBlock()))) {
					found = (boolean) (true);
				}
				sz = (double) ((sz) + 1);
			}
			sx = (double) ((sx) + 1);
		}
		if (((found) == (true))) {
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
				}, "effect @a[r=7] solomon:damagecus 1 5");
			}
			world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) z, false));
			(entity).world.removeEntity(entity);
		}
	}
}
