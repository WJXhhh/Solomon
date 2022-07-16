package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.solomon.potion.PotionWaterfuzhuo;
import net.mcreator.solomon.potion.PotionFirefuzhuo;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;
import java.util.Collection;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureMuban extends ElementsSolomonMod.ModElement {
	public ProcedureMuban(ElementsSolomonMod instance) {
		super(instance, 238);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Muban!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure Muban!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Muban!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Muban!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Muban!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Muban!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((sourceentity.getEntityData().getString("vision"))).equals("gwi"))) {
			entity.attackEntityFrom(DamageSource.FALL, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 5));
			if ((new Object() {
				boolean check() {
					if (entity instanceof EntityLivingBase) {
						Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
						for (PotionEffect effect : effects) {
							if (effect.getPotion() == PotionFirefuzhuo.potion)
								return true;
						}
					}
					return false;
				}
			}.check())) {
				entity.attackEntityFrom(DamageSource.IN_FIRE, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 10));
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
					}, "effect @e[r=5] solomon:firefuzhuo 10");
				}
			}
			if ((new Object() {
				boolean check() {
					if (entity instanceof EntityLivingBase) {
						Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
						for (PotionEffect effect : effects) {
							if (effect.getPotion() == PotionWaterfuzhuo.potion)
								return true;
						}
					}
					return false;
				}
			}.check())) {
				entity.attackEntityFrom(DamageSource.DROWN, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 10));
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
					}, "effect @e[r=5] solomon:waterfuzhuo 10");
				}
			}
		}
	}
}
