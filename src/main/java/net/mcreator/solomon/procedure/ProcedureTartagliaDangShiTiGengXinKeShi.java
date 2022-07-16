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
public class ProcedureTartagliaDangShiTiGengXinKeShi extends ElementsSolomonMod.ModElement {
	public ProcedureTartagliaDangShiTiGengXinKeShi(ElementsSolomonMod instance) {
		super(instance, 393);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TartagliaDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure TartagliaDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure TartagliaDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure TartagliaDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TartagliaDangShiTiGengXinKeShi!");
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
		double hih = 0;
		double sz = 0;
		double foundzhu = 0;
		entity.getEntityData().setDouble("jineng", ((entity.getEntityData().getDouble("jineng")) + 1));
		if ((150 < (entity.getEntityData().getDouble("jineng")))) {
			if (((5 < (entity.getEntityData().getDouble("dazhao"))) == (false))) {
				if ((Math.random() < 0.5)) {
					if ((Math.random() < 0.5)) {
						System.out.println("shuibosummon");
						world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
								.getObject(new ResourceLocation("solomon:childea1")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
						for (int index0 = 0; index0 < (int) (5); index0++) {
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
								}, "summon solomon:tartashuibo");
							}
						}
						entity.getEntityData().setDouble("jineng", 0);
						entity.getEntityData().setDouble("dazhao", ((entity.getEntityData().getDouble("dazhao")) + 1));
					} else {
						sy = (double) 10;
						sx = (double) (-6);
						world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
								.getObject(new ResourceLocation("solomon:childea1")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
						for (int index1 = 0; index1 < (int) (12); index1++) {
							sz = (double) (-6);
							for (int index2 = 0; index2 < (int) (12); index2++) {
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
										}, (("summon solomon:tarjianyu ~") + "" + ((sx)) + "" + (" ~") + "" + ((sy)) + "" + (" ~") + "" + ((sz))));
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
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("solomon:childep1da")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
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
					}, "summon solomon:tartajing ~ ~10 ~");
				}
				entity.getEntityData().setDouble("dazhao", 0);
				entity.getEntityData().setDouble("jineng", 0);
			}
		}
	}
}
