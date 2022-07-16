package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.solomon.item.ItemVlwi;
import net.mcreator.solomon.item.ItemVlr;
import net.mcreator.solomon.item.ItemVlf;
import net.mcreator.solomon.item.ItemVle;
import net.mcreator.solomon.item.ItemGowin;
import net.mcreator.solomon.SolomonModVariables;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;
import java.util.HashMap;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureVdaAnXiaAnJianShi extends ElementsSolomonMod.ModElement {
	public ProcedureVdaAnXiaAnJianShi(ElementsSolomonMod instance) {
		super(instance, 258);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure VdaAnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure VdaAnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure VdaAnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure VdaAnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure VdaAnXiaAnJianShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double bianlifangk = 0;
		if ((((entity.getEntityData().getDouble("dacd")) <= 0)
				&& ((((entity.getEntityData().getString("vda"))).equals("\u9ECE\u660E")) && ((entity instanceof EntityPlayer)
						? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemVlf.block, (int) (1)))
						: false)))) {
			entity.getEntityData().setDouble("dacd", 600);
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, (int) 60, (int) 1));
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				ProcedureLimingvoice.executeProcedure($_dependencies);
			}
			SolomonModVariables.MapVariables.get(world).direction = (double) (entity.rotationYaw);
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
				}, "summon solomon:liming ~ ~1 ~");
			}
		}
		if ((((entity.getEntityData().getDouble("dacd")) <= 0)
				&& ((((entity.getEntityData().getString("vda"))).equals("\u98CE\u795E\u4E4B\u8BD7")) && (((entity instanceof EntityPlayer)
						? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemGowin.block, (int) (1)))
						: false)
						|| ((entity instanceof EntityPlayer)
								? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemVlwi.block, (int) (1)))
								: false))))) {
			entity.getEntityData().setDouble("dacd", 600);
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				ProcedureZhishivoice.executeProcedure($_dependencies);
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
				}, "summon solomon:fenshenzhishi ~ ~ ~");
			}
		}
		if ((((entity.getEntityData().getDouble("dacd")) <= 0)
				&& ((((entity.getEntityData().getString("vda"))).equals("\u5929\u8857\u5DE1\u6E38")) && ((entity instanceof EntityPlayer)
						? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemVle.block, (int) (1)))
						: false)))) {
			entity.getEntityData().setDouble("dacd", 600);
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				ProcedureTianjievoice.executeProcedure($_dependencies);
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
				}, "summon solomon:tianjiemanager ~ ~ ~");
			}
		}
		if ((((entity.getEntityData().getDouble("dacd")) <= 0)
				&& ((((entity.getEntityData().getString("vda"))).equals("\u5929\u661F")) && ((entity instanceof EntityPlayer)
						? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemVlr.block, (int) (1)))
						: false)))) {
			bianlifangk = (double) 0;
			for (int index0 = 0; index0 < (int) (21); index0++) {
				if (((world.getBlockState(new BlockPos((int) x, (int) ((entity.posY) + ((bianlifangk) + 1)), (int) z))).getBlock() == Blocks.AIR
						.getDefaultState().getBlock())) {
					bianlifangk = (double) ((bianlifangk) + 1);
				}
			}
			if (((bianlifangk) > 20)) {
				entity.getEntityData().setDouble("dacd", 600);
				if ((Math.random() < 0.34)) {
					world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
							.getObject(new ResourceLocation("solomon:planetbefall_1")), SoundCategory.NEUTRAL, (float) 4, (float) 1);
				} else if ((Math.random() < 0.34)) {
					world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
							.getObject(new ResourceLocation("solomon:planetbefall_2")), SoundCategory.NEUTRAL, (float) 4, (float) 1);
				} else {
					world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
							.getObject(new ResourceLocation("solomon:planerbefall_3")), SoundCategory.NEUTRAL, (float) 4, (float) 1);
				}
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 100, (int) 5));
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
					}, "summon solomon:tianxing ~ ~20 ~");
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
					}, "summon solomon:tianyun ~ ~20 ~");
				}
			} else if (((bianlifangk) > 10)) {
				entity.getEntityData().setDouble("dacd", 600);
				if ((Math.random() < 0.34)) {
					world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
							.getObject(new ResourceLocation("solomon:planetbefall_1")), SoundCategory.NEUTRAL, (float) 4, (float) 1);
				} else if ((Math.random() < 0.34)) {
					world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
							.getObject(new ResourceLocation("solomon:planetbefall_2")), SoundCategory.NEUTRAL, (float) 4, (float) 1);
				} else {
					world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
							.getObject(new ResourceLocation("solomon:planerbefall_3")), SoundCategory.NEUTRAL, (float) 4, (float) 1);
				}
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 100, (int) 5));
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
					}, "summon solomon:tianxing ~ ~10 ~");
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
					}, "summon solomon:tianyun ~ ~10 ~");
				}
			}
		}
		if ((((entity.getEntityData().getDouble("dacd")) <= 0)
				&& ((((entity.getEntityData().getString("vda"))).equals("\u7F8E\u5999\u65C5\u7A0B")) && ((entity instanceof EntityPlayer)
						? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemVlf.block, (int) (1)))
						: false)))) {
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
				}, "summon solomon:meimiaolvcheng");
			}
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				ProcedureMeimiaovoice.executeProcedure($_dependencies);
			}
			entity.getEntityData().setDouble("dacd", 600);
		}
	}
}
