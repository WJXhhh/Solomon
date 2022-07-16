package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureLeviathanDangShiTiGengXinKeShi extends ElementsSolomonMod.ModElement {
	public ProcedureLeviathanDangShiTiGengXinKeShi(ElementsSolomonMod instance) {
		super(instance, 320);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LeviathanDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LeviathanDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LeviathanDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LeviathanDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LeviathanDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		entity.getEntityData().setDouble("jineng", ((entity.getEntityData().getDouble("jineng")) + 1));
		if ((300 < (entity.getEntityData().getDouble("jineng")))) {
			if (((5 < (entity.getEntityData().getDouble("dazhao"))) == (false))) {
				if ((Math.random() < 0.5)) {
					if ((Math.random() < 0.5)) {
						world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
								.getObject(new ResourceLocation("solomon:leviaji1")), SoundCategory.NEUTRAL, (float) 3, (float) 1);
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
							}, "effect @a[r=8] solomon:jiduzuzhou 10 1");
						}
						entity.getEntityData().setDouble("jineng", 0);
						entity.getEntityData().setDouble("dazhao", ((entity.getEntityData().getDouble("dazhao")) + 1));
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
							}, (("title @a[rm=0,r=12] actionbar [{\"text\":\"\u5229\u7EF4\u5766\u6280\u80FD\u503C\uFF1A") + ""
									+ ((entity.getEntityData().getDouble("dazhao"))) + ""
									+ ("\",\"color\":\"aqua\",\"bold\":true,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]")));
						}
					} else {
						world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
								.getObject(new ResourceLocation("solomon:leviaji2")), SoundCategory.NEUTRAL, (float) 3, (float) 1);
						for (int index0 = 0; index0 < (int) (2); index0++) {
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
								}, "summon minecraft:creeper ~ ~1 ~");
							}
						}
						entity.getEntityData().setDouble("jineng", 0);
						entity.getEntityData().setDouble("dazhao", ((entity.getEntityData().getDouble("dazhao")) + 1));
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
							}, (("title @a[rm=0,r=12] actionbar [{\"text\":\"\u5229\u7EF4\u5766\u6280\u80FD\u503C\uFF1A") + ""
									+ ((entity.getEntityData().getDouble("dazhao"))) + ""
									+ ("\",\"color\":\"aqua\",\"bold\":true,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false}]")));
						}
					}
				}
			} else {
				world.playSound((EntityPlayer) null, x, y, z,
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("solomon:leviada")),
						SoundCategory.NEUTRAL, (float) 3, (float) 1);
				for (int index1 = 0; index1 < (int) (20); index1++) {
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
						}, "execute @a[r=10] ~ ~ ~ /summon minecraft:lightning_bolt ~ ~ ~");
					}
				}
				entity.getEntityData().setDouble("dazhao", 0);
				entity.getEntityData().setDouble("jineng", 0);
			}
		}
	}
}
