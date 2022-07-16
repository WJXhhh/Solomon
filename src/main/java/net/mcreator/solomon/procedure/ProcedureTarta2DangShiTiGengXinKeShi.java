package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.Random;
import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureTarta2DangShiTiGengXinKeShi extends ElementsSolomonMod.ModElement {
	public ProcedureTarta2DangShiTiGengXinKeShi(ElementsSolomonMod instance) {
		super(instance, 398);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Tarta2DangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Tarta2DangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Tarta2DangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Tarta2DangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Tarta2DangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double rangle = 0;
		double LL_long = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		entity.getEntityData().setDouble("jineng", ((entity.getEntityData().getDouble("jineng")) + 1));
		if ((200 < (entity.getEntityData().getDouble("jineng")))) {
			if (((9 < (entity.getEntityData().getDouble("dazhao"))) == (false))) {
				if ((Math.random() < 0.6)) {
					if ((Math.random() < 0.4)) {
						entity.motionX = (((new Random()).nextInt((int) 6 + 1)) - 3);
						entity.motionY = 0;
						entity.motionZ = (((new Random()).nextInt((int) 6 + 1)) - 3);
						world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
								.getObject(new ResourceLocation("solomon:childep2a")), SoundCategory.NEUTRAL, (float) 3, (float) 1);
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
								.getObject(new ResourceLocation("solomon:childep2a")), SoundCategory.NEUTRAL, (float) 3, (float) 1);
						Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).schedule(() -> {
							entity.motionX = (Math.sin(Math.toRadians((0 - (entity.rotationYaw)))) * 1);
							entity.motionY = 0;
							entity.motionZ = (Math.cos(Math.toRadians((entity.rotationYaw))) * 1);
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
						sy = (double) 10;
						sx = (double) (-6);
						world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
								.getObject(new ResourceLocation("solomon:childep2a")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
						for (int index0 = 0; index0 < (int) (12); index0++) {
							sz = (double) (-6);
							for (int index1 = 0; index1 < (int) (12); index1++) {
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
										}, (("summon solomon:tartaleimao ~") + "" + ((sx)) + "" + (" ~") + "" + ((sy)) + "" + (" ~") + "" + ((sz))));
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
				entity.getEntityData().setDouble("dazhao", 0);
				entity.getEntityData().setDouble("jineng", 0);
			}
		}
	}
}
