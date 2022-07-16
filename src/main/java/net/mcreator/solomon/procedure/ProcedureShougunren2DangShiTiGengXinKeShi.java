package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureShougunren2DangShiTiGengXinKeShi extends ElementsSolomonMod.ModElement {
	public ProcedureShougunren2DangShiTiGengXinKeShi(ElementsSolomonMod instance) {
		super(instance, 365);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Shougunren2DangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Shougunren2DangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Shougunren2DangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Shougunren2DangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Shougunren2DangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		entity.getEntityData().setDouble("time", ((entity.getEntityData().getDouble("time")) + 1));
		if (((entity.getEntityData().getDouble("time")) > 4)) {
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
				}, "summon solomon:ren_3");
			}
			(entity).world.removeEntity(entity);
		}
	}
}
