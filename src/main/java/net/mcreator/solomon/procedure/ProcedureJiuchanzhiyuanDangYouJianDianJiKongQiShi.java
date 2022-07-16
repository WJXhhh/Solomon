package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.solomon.item.ItemJiuchanzhiyuan;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureJiuchanzhiyuanDangYouJianDianJiKongQiShi extends ElementsSolomonMod.ModElement {
	public ProcedureJiuchanzhiyuanDangYouJianDianJiKongQiShi(ElementsSolomonMod instance) {
		super(instance, 227);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure JiuchanzhiyuanDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure JiuchanzhiyuanDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure JiuchanzhiyuanDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure JiuchanzhiyuanDangYouJianDianJiKongQiShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure JiuchanzhiyuanDangYouJianDianJiKongQiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		for (int index0 = 0; index0 < (int) (10); index0++) {
			if ((Math.random() < 0.04)) {
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
					}, "give @p solomon:wuxingqihun");
				}
				if (entity instanceof EntityPlayer && !entity.world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u83B7\u5F97\uFF1A\u00A7e\u00A7l\u4E94\u661F\u5668\u9B42"),
							(false));
				}
			} else if ((Math.random() < 0.1)) {
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
					}, "give @p solomon:xialimiechen");
				}
				if (entity instanceof EntityPlayer && !entity.world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u83B7\u5F97\uFF1A\u00A7d\u00A7l\u5323\u91CC\u706D\u8FB0"),
							(false));
				}
			} else {
				if ((Math.random() < 0.25)) {
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
						}, "give @p solomon:tanggong");
					}
					if (entity instanceof EntityPlayer && !entity.world.isRemote) {
						((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u83B7\u5F97\uFF1A\u00A7b\u00A7l\u5F39\u5F13"), (false));
					}
				} else if ((Math.random() < 0.25)) {
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
						}, "give @p solomon:tanglangnegpai");
					}
					if (entity instanceof EntityPlayer && !entity.world.isRemote) {
						((EntityPlayer) entity).sendStatusMessage(
								new TextComponentString("\u83B7\u5F97\uFF1A\u00A7b\u00A7l\u8D2A\u5A6A\u4E4B\u5E9A\u724C"), (false));
					}
				} else if ((Math.random() < 0.25)) {
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
						}, "give @p solomon:chihuyudao");
					}
					if (entity instanceof EntityPlayer && !entity.world.isRemote) {
						((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u83B7\u5F97\uFF1A\u00A7b\u00A7l\u5403\u864E\u9C7C\u5200"),
								(false));
					}
				} else {
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
						}, "give @p solomon:mokuang");
					}
					if (entity instanceof EntityPlayer && !entity.world.isRemote) {
						((EntityPlayer) entity).sendStatusMessage(
								new TextComponentString("\u83B7\u5F97\uFF1A\u00A7b\u00A7l\u7CBE\u953B\u7528\u9B54\u77FF"), (false));
					}
				}
			}
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemJiuchanzhiyuan.block, (int) (1)).getItem(), -1, (int) 1, null);
	}
}
