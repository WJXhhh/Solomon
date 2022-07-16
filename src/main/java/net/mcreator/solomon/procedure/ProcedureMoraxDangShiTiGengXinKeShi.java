package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.solomon.block.BlockZhongskill;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureMoraxDangShiTiGengXinKeShi extends ElementsSolomonMod.ModElement {
	public ProcedureMoraxDangShiTiGengXinKeShi(ElementsSolomonMod instance) {
		super(instance, 386);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MoraxDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MoraxDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MoraxDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MoraxDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MoraxDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double hih = 0;
		double foundzhu = 0;
		entity.getEntityData().setDouble("jineng", ((entity.getEntityData().getDouble("jineng")) + 1));
		if ((130 < (entity.getEntityData().getDouble("jineng")))) {
			if (((8 < (entity.getEntityData().getDouble("dazhao"))) == (false))) {
				if ((Math.random() < 0.5)) {
					if ((Math.random() < 0.5)) {
						foundzhu = (double) 0;
						sx = (double) (-6);
						world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
								.getObject(new ResourceLocation("solomon:zhongliskill")), SoundCategory.NEUTRAL, (float) 3, (float) 1);
						for (int index0 = 0; index0 < (int) (12); index0++) {
							sy = (double) (-6);
							for (int index1 = 0; index1 < (int) (12); index1++) {
								sz = (double) (-6);
								for (int index2 = 0; index2 < (int) (12); index2++) {
									if (((world.getBlockState(new BlockPos((int) (x + (sx)), (int) (y + (sy)), (int) (z + (sz)))))
											.getBlock() == BlockZhongskill.block.getDefaultState().getBlock())) {
										foundzhu = (double) ((foundzhu) + 1);
									}
									sz = (double) ((sz) + 1);
								}
								sy = (double) ((sy) + 1);
							}
							sx = (double) ((sx) + 1);
						}
						if (((foundzhu) < 3)) {
							sx = (double) (-3);
							for (int index3 = 0; index3 < (int) (6); index3++) {
								sy = (double) (-3);
								for (int index4 = 0; index4 < (int) (6); index4++) {
									sz = (double) (-3);
									for (int index5 = 0; index5 < (int) (6); index5++) {
										hih = (double) 0;
										found = (boolean) (true);
										if (((world.getBlockState(new BlockPos((int) (x + (sx)), (int) (y + (sy)), (int) (z + (sz)))))
												.getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
											if ((Math.random() < 0.05)) {
												for (int index6 = 0; index6 < (int) (5); index6++) {
													if ((!(((world.getBlockState(
															new BlockPos((int) (x + (sx)), (int) ((y + (sy)) + (hih)), (int) (z + (sz)))))
																	.getBlock() == Blocks.AIR.getDefaultState().getBlock())
															&& (!((world.getBlockState(new BlockPos((int) (x + (sx)),
																	(int) (((y + (sy)) + (hih)) - 1), (int) (z + (sz)))))
																			.getBlock() == Blocks.AIR.getDefaultState().getBlock()))))) {
														found = (boolean) (false);
													}
												}
												if ((found)) {
													world.setBlockState(new BlockPos((int) (x + (sx)), (int) (y + (sy)), (int) (z + (sz))),
															BlockZhongskill.block.getDefaultState(), 3);
												}
											}
										}
										sz = (double) ((sz) + 1);
									}
									sy = (double) ((sy) + 1);
								}
								sx = (double) ((sx) + 1);
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
								}, "effect @a[r=6] solomon:damagecus 1 1");
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
								}, "effect @a[r=6] solomon:damagecus 1 2");
							}
						}
						entity.getEntityData().setDouble("jineng", 0);
						entity.getEntityData().setDouble("dazhao", ((entity.getEntityData().getDouble("dazhao")) + 1));
					} else {
						System.out.println("2 load");
						world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
								.getObject(new ResourceLocation("solomon:zhongliatk")), SoundCategory.NEUTRAL, (float) 3, (float) 1);
						sy = (double) 10;
						sx = (double) (-6);
						for (int index7 = 0; index7 < (int) (12); index7++) {
							sz = (double) (-6);
							for (int index8 = 0; index8 < (int) (12); index8++) {
								if ((Math.random() < 0.1)) {
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
										}, (("summon solomon:yanqiang ~") + "" + ((sx)) + "" + (" ~") + "" + ((sy)) + "" + (" ~") + "" + ((sz))));
									}
								}
								sz = (double) ((sz) + 1);
							}
							sx = (double) ((sx) + 1);
						}
						entity.getEntityData().setDouble("jineng", 0);
						entity.getEntityData().setDouble("dazhao", ((entity.getEntityData().getDouble("dazhao")) + 1));
					}
				}
			} else {
				world.playSound((EntityPlayer) null, x, y, z,
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("solomon:zhonglida")),
						SoundCategory.NEUTRAL, (float) 3, (float) 1);
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
					}, "summon solomon:tianxing_2 ~ ~20 ~3");
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
					}, "summon solomon:tianxing_2 ~4 ~20 ~");
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
					}, "summon solomon:tianxing_2 ~-3 ~20 ~");
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
					}, "summon solomon:tianxing_2 ~2 ~20 ~-2");
				}
				entity.getEntityData().setDouble("dazhao", 0);
				entity.getEntityData().setDouble("jineng", 0);
			}
		}
	}
}
