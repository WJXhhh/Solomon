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
public class ProcedureAomanzhujiaoDangShiTiGengXinKeShi extends ElementsSolomonMod.ModElement {
	public ProcedureAomanzhujiaoDangShiTiGengXinKeShi(ElementsSolomonMod instance) {
		super(instance, 342);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AomanzhujiaoDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AomanzhujiaoDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AomanzhujiaoDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AomanzhujiaoDangShiTiGengXinKeShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AomanzhujiaoDangShiTiGengXinKeShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		entity.getEntityData().setDouble("jineng", ((entity.getEntityData().getDouble("jineng")) + 1));
		if ((200 < (entity.getEntityData().getDouble("jineng")))) {
			if ((0.5 < Math.random())) {
				if ((5 > (entity.getEntityData().getDouble("zhaohuan")))) {
					world.playSound((EntityPlayer) null, x, y, z,
							(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("solomon:amzjji1")),
							SoundCategory.NEUTRAL, (float) 3, (float) 1);
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
							}, "summon solomon:aomanshitu");
						}
					}
					entity.getEntityData().setDouble("zhaohuan", ((entity.getEntityData().getDouble("zhaohuan")) + 1));
				}
			} else {
				world.playSound((EntityPlayer) null, x, y, z,
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("solomon:amzjji2")),
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
					}, "summon minecraft:area_effect_cloud ~ ~1 ~ {Potion:harming,Age:0,Duration:10,Color:0,Radius:9}");
				}
			}
			entity.getEntityData().setDouble("jineng", 0);
		}
	}
}
