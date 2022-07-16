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
public class ProcedureJadeshieldDangShiTiGengXinKeShi extends ElementsSolomonMod.ModElement {
	public ProcedureJadeshieldDangShiTiGengXinKeShi(ElementsSolomonMod instance) {
		super(instance, 289);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure JadeshieldDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure JadeshieldDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
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
					return new BlockPos((int) (entity.posX), (int) (entity.posY), (int) (entity.posZ));
				}

				@Override
				public Vec3d getPositionVector() {
					return new Vec3d((entity.posX), (entity.posY), (entity.posZ));
				}
			}, "tp @e[type=solomon:jadeshield,r=1] @p[r=2]");
		}
		entity.getEntityData().setDouble("time", ((entity.getEntityData().getDouble("time")) + 1));
		if (((entity.getEntityData().getDouble("time")) >= 180)) {
			(entity).world.removeEntity(entity);
		}
	}
}
