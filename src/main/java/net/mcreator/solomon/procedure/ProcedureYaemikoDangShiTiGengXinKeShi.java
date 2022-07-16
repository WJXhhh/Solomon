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
import java.util.HashMap;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureYaemikoDangShiTiGengXinKeShi extends ElementsSolomonMod.ModElement {
	public ProcedureYaemikoDangShiTiGengXinKeShi(ElementsSolomonMod instance) {
		super(instance, 347);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure YaemikoDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure YaemikoDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure YaemikoDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure YaemikoDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure YaemikoDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		entity.getEntityData().setDouble("jineng", ((entity.getEntityData().getDouble("jineng")) + 1));
		if ((80 < (entity.getEntityData().getDouble("jineng")))) {
			entity.getEntityData().setDouble("jineng", 0);
			if ((Math.random() < 0.8)) {
				if ((Math.random() < (1 - ((SolomonModVariables.MapVariables.get(world).shashengyingnum) * 0.1)))) {
					SolomonModVariables.MapVariables
							.get(world).shashengyingnum = (double) (SolomonModVariables.MapVariables.get(world).shashengyingnum);
					SolomonModVariables.MapVariables.get(world).syncData(world);
					if (((SolomonModVariables.MapVariables.get(world).shashengyingnum) < 10)) {
						SolomonModVariables.MapVariables
								.get(world).shashengyingnum = (double) (SolomonModVariables.MapVariables.get(world).shashengyingnum);
						SolomonModVariables.MapVariables.get(world).syncData(world);
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
							}, "summon solomon:shashengying");
						}
						{
							Map<String, Object> $_dependencies = new HashMap<>();
							$_dependencies.put("x", x);
							$_dependencies.put("y", y);
							$_dependencies.put("z", z);
							$_dependencies.put("world", world);
							ProcedureYaeji.executeProcedure($_dependencies);
						}
						SolomonModVariables.MapVariables
								.get(world).shashengyingnum = (double) ((SolomonModVariables.MapVariables.get(world).shashengyingnum) + 1);
						SolomonModVariables.MapVariables.get(world).syncData(world);
						SolomonModVariables.MapVariables
								.get(world).shashengyingnum = (double) (SolomonModVariables.MapVariables.get(world).shashengyingnum);
						SolomonModVariables.MapVariables.get(world).syncData(world);
						entity.motionX = 0.2;
						entity.motionY = 0;
						entity.motionZ = 0.2;
						entity.getEntityData().setDouble("dazhao", ((entity.getEntityData().getDouble("dazhao")) + 1));
					}
				} else {
					if (((entity.getEntityData().getDouble("dazhao")) == 5)) {
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
							}, (("effect @a[r=5] solomon:damagecus 2 ") + ""
									+ ((((SolomonModVariables.MapVariables.get(world).shashengyingnum) + 1) + 4))));
						}
						{
							Map<String, Object> $_dependencies = new HashMap<>();
							$_dependencies.put("x", x);
							$_dependencies.put("y", y);
							$_dependencies.put("z", z);
							$_dependencies.put("world", world);
							ProcedureYaeda.executeProcedure($_dependencies);
						}
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
							}, "execute @a[r=5] ~ ~ ~ /summon minecraft:lightning_bolt ~ ~ ~");
						}
						entity.getEntityData().setDouble("dazhao", 0);
					}
				}
			}
		}
	}
}
