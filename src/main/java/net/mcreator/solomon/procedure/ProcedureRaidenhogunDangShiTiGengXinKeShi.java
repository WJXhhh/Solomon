package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumHand;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.solomon.item.ItemShougunkatana;
import net.mcreator.solomon.SolomonModVariables;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.Random;
import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureRaidenhogunDangShiTiGengXinKeShi extends ElementsSolomonMod.ModElement {
	public ProcedureRaidenhogunDangShiTiGengXinKeShi(ElementsSolomonMod instance) {
		super(instance, 362);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RaidenhogunDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RaidenhogunDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RaidenhogunDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RaidenhogunDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RaidenhogunDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double LL_long = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double rangle = 0;
		entity.getEntityData().setDouble("jineng", ((entity.getEntityData().getDouble("jineng")) + 1));
		if ((200 < (entity.getEntityData().getDouble("jineng")))) {
			if (((9 < (entity.getEntityData().getDouble("dazhao"))) == (false))) {
				if ((Math.random() < 0.6)) {
					if ((Math.random() < 0.4)) {
						entity.motionX = (((new Random()).nextInt((int) 6 + 1)) - 3);
						entity.motionY = 0;
						entity.motionZ = (((new Random()).nextInt((int) 6 + 1)) - 3);
						world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
								.getObject(new ResourceLocation("solomon:shoatt")), SoundCategory.NEUTRAL, (float) 3, (float) 1);
						Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
							world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) z, false));
							Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
								entity.motionX = ((((new Random()).nextInt((int) 6 + 1)) - 3) * 0.2);
								entity.motionY = 0;
								entity.motionZ = ((((new Random()).nextInt((int) 6 + 1)) - 3) * 0.2);
								Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
									world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) z, false));
									Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
										entity.motionX = ((((new Random()).nextInt((int) 6 + 1)) - 3) * 0.2);
										entity.motionY = 0;
										entity.motionZ = ((((new Random()).nextInt((int) 6 + 1)) - 3) * 0.2);
										Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
											world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) z, false));
											Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
												entity.motionX = ((((new Random()).nextInt((int) 6 + 1)) - 3) * 0.2);
												entity.motionY = 0;
												entity.motionZ = ((((new Random()).nextInt((int) 6 + 1)) - 3) * 0.2);
												Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
													world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) z, false));
													Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
														entity.getEntityData().setDouble("jineng", 0);
														entity.getEntityData().setDouble("dazhao",
																((entity.getEntityData().getDouble("dazhao")) + 1));
													}, 300, TimeUnit.MILLISECONDS);
												}, 500, TimeUnit.MILLISECONDS);
											}, 300, TimeUnit.MILLISECONDS);
										}, 500, TimeUnit.MILLISECONDS);
									}, 300, TimeUnit.MILLISECONDS);
								}, 500, TimeUnit.MILLISECONDS);
							}, 300, TimeUnit.MILLISECONDS);
						}, 500, TimeUnit.MILLISECONDS);
					} else if ((Math.random() < 0.4)) {
						world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
								.getObject(new ResourceLocation("solomon:shoatt")), SoundCategory.NEUTRAL, (float) 3, (float) 1);
						Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
							entity.motionX = (Math.sin(Math.toRadians((0 - (entity.rotationYaw)))) * 2);
							entity.motionY = 0;
							entity.motionZ = (Math.cos(Math.toRadians((entity.rotationYaw))) * 2);
							Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
								world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) z, false));
								entity.motionX = 0;
								entity.motionY = 0;
								entity.motionZ = 0;
								entity.getEntityData().setDouble("jineng", 0);
								entity.getEntityData().setDouble("dazhao", ((entity.getEntityData().getDouble("dazhao")) + 1));
							}, 500, TimeUnit.MILLISECONDS);
						}, 300, TimeUnit.MILLISECONDS);
					} else {
						if ((Math.random() < 0.3)) {
							if (((entity.getEntityData().getDouble("phase")) != 2)) {
								world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
										.getObject(new ResourceLocation("solomon:shoatt")), SoundCategory.NEUTRAL, (float) 3, (float) 1);
								rangle = (double) 0;
								for (int index0 = 0; index0 < (int) (8); index0++) {
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
										}, (("summon solomon:leiren ~ ~ ~ {\"fangxiang\":") + "" + ((rangle)) + "" + ("d}")));
									}
									rangle = (double) ((rangle) + 45);
								}
								entity.getEntityData().setDouble("jineng", 0);
								entity.getEntityData().setDouble("dazhao", ((entity.getEntityData().getDouble("dazhao")) + 1));
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
									}, "summon solomon:shogunren_1");
								}
								entity.getEntityData().setDouble("jineng", 0);
								entity.getEntityData().setDouble("dazhao", ((entity.getEntityData().getDouble("dazhao")) + 1));
							}
						}
						entity.getEntityData().setDouble("jineng", 0);
						entity.getEntityData().setDouble("dazhao", ((entity.getEntityData().getDouble("dazhao")) + 1));
					}
				}
			} else {
				if (((entity.getEntityData().getDouble("phase")) != 2)) {
					world.playSound((EntityPlayer) null, x, y, z,
							(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("solomon:shoatt")),
							SoundCategory.NEUTRAL, (float) 3, (float) 1);
					entity.getEntityData().setDouble("phase", 2);
					if (entity instanceof EntityLivingBase) {
						ItemStack _setstack = new ItemStack(ItemShougunkatana.block, (int) (1));
						_setstack.setCount(1);
						((EntityLivingBase) entity).setHeldItem(EnumHand.MAIN_HAND, _setstack);
						if (entity instanceof EntityPlayerMP)
							((EntityPlayerMP) entity).inventory.markDirty();
					}
					LL_long = (double) 1;
					for (int index1 = 0; index1 < (int) (5); index1++) {
						world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + (LL_long)), (int) y, (int) z, false));
						world.addWeatherEffect(new EntityLightningBolt(world, (int) (x - (LL_long)), (int) y, (int) z, false));
						world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) (z - (LL_long)), false));
						world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) (z + (LL_long)), false));
						LL_long = (double) ((LL_long) + 1);
					}
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity).setHealth((float) 900);
				} else {
					world.playSound((EntityPlayer) null, x, y, z,
							(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("solomon:shoda")),
							SoundCategory.NEUTRAL, (float) 3, (float) 1);
					SolomonModVariables.MapVariables.get(world).wuxiangdire = (double) (entity.rotationYaw);
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
								return new BlockPos((int) x, (int) y, (int) z);
							}

							@Override
							public Vec3d getPositionVector() {
								return new Vec3d(x, y, z);
							}
						}, "summon solomon:wuxiang");
					}
				}
				entity.getEntityData().setDouble("dazhao", 0);
				entity.getEntityData().setDouble("jineng", 0);
			}
		}
		if ((((entity.getEntityData().getDouble("phase")) != 2)
				&& (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHealth() : -1) < 450))) {
			entity.getEntityData().setDouble("phase", 2);
			if (entity instanceof EntityLivingBase) {
				ItemStack _setstack = new ItemStack(ItemShougunkatana.block, (int) (1));
				_setstack.setCount(1);
				((EntityLivingBase) entity).setHeldItem(EnumHand.MAIN_HAND, _setstack);
				if (entity instanceof EntityPlayerMP)
					((EntityPlayerMP) entity).inventory.markDirty();
			}
			LL_long = (double) 1;
			for (int index2 = 0; index2 < (int) (5); index2++) {
				world.addWeatherEffect(new EntityLightningBolt(world, (int) (x + (LL_long)), (int) y, (int) z, false));
				world.addWeatherEffect(new EntityLightningBolt(world, (int) (x - (LL_long)), (int) y, (int) z, false));
				world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) (z - (LL_long)), false));
				world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) (z + (LL_long)), false));
				LL_long = (double) ((LL_long) + 1);
			}
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).setHealth((float) 900);
		}
	}
}
