package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.solomon.potion.PotionWaterfuzhuo;
import net.mcreator.solomon.potion.PotionLeifuzhuo;
import net.mcreator.solomon.potion.PotionFirefuzhuo;
import net.mcreator.solomon.potion.PotionBingfuzhuo;
import net.mcreator.solomon.item.ItemTanggong;
import net.mcreator.solomon.item.ItemFeileiz;
import net.mcreator.solomon.item.ItemDongjibaixing;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureDongjibaixingDangZiDanJiZhongShengCunShiTiShi extends ElementsSolomonMod.ModElement {
	public ProcedureDongjibaixingDangZiDanJiZhongShengCunShiTiShi(ElementsSolomonMod instance) {
		super(instance, 226);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DongjibaixingDangZiDanJiZhongShengCunShiTiShi!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure DongjibaixingDangZiDanJiZhongShengCunShiTiShi!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure DongjibaixingDangZiDanJiZhongShengCunShiTiShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DongjibaixingDangZiDanJiZhongShengCunShiTiShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DongjibaixingDangZiDanJiZhongShengCunShiTiShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DongjibaixingDangZiDanJiZhongShengCunShiTiShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DongjibaixingDangZiDanJiZhongShengCunShiTiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("entity", entity);
			$_dependencies.put("sourceentity", sourceentity);
			$_dependencies.put("itemstack", itemstack);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			$_dependencies.put("world", world);
			ProcedureWuqibeidong.executeProcedure($_dependencies);
		}
		if ((((sourceentity instanceof EntityLivingBase) ? ((EntityLivingBase) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemTanggong.block, (int) (1)).getItem())) {
			sourceentity.getEntityData().setDouble("gongdeshanghai", ((((sourceentity instanceof EntityLivingBase)
					? ((EntityLivingBase) sourceentity).getHeldItemMainhand()
					: ItemStack.EMPTY).hasTagCompound()
							? ((sourceentity instanceof EntityLivingBase) ? ((EntityLivingBase) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
									.getTagCompound().getDouble("sololevel")
							: -1)
					* 2));
		}
		if ((((sourceentity instanceof EntityLivingBase) ? ((EntityLivingBase) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemDongjibaixing.block, (int) (1)).getItem())) {
			sourceentity.getEntityData().setDouble("gongdeshanghai", ((((sourceentity instanceof EntityLivingBase)
					? ((EntityLivingBase) sourceentity).getHeldItemMainhand()
					: ItemStack.EMPTY).hasTagCompound()
							? ((sourceentity instanceof EntityLivingBase) ? ((EntityLivingBase) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
									.getTagCompound().getDouble("sololevel")
							: -1)
					* 5));
		}
		if ((((sourceentity instanceof EntityLivingBase) ? ((EntityLivingBase) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemFeileiz.block, (int) (1)).getItem())) {
			sourceentity.getEntityData().setDouble("gongdeshanghai", ((((sourceentity instanceof EntityLivingBase)
					? ((EntityLivingBase) sourceentity).getHeldItemMainhand()
					: ItemStack.EMPTY).hasTagCompound()
							? ((sourceentity instanceof EntityLivingBase) ? ((EntityLivingBase) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
									.getTagCompound().getDouble("sololevel")
							: -1)
					* 5));
		}
		entity.attackEntityFrom(DamageSource.GENERIC, (float) (sourceentity.getEntityData().getDouble("gongdeshanghai")));
		if ((((sourceentity.getEntityData().getString("vision"))).equals("vf"))) {
			entity.attackEntityFrom(DamageSource.IN_FIRE, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 1));
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
				entity.attackEntityFrom(DamageSource.GENERIC, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 2));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).clearActivePotions();
			} else {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionFirefuzhuo.potion, (int) 500, (int) 1));
			}
			if ((new Object() {
				boolean check() {
					if (entity instanceof EntityLivingBase) {
						Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
						for (PotionEffect effect : effects) {
							if (effect.getPotion() == PotionBingfuzhuo.potion)
								return true;
						}
					}
					return false;
				}
			}.check())) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 3));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).clearActivePotions();
			} else {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionFirefuzhuo.potion, (int) 500, (int) 1));
			}
			if ((new Object() {
				boolean check() {
					if (entity instanceof EntityLivingBase) {
						Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
						for (PotionEffect effect : effects) {
							if (effect.getPotion() == PotionLeifuzhuo.potion)
								return true;
						}
					}
					return false;
				}
			}.check())) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) (((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 5) * 2.5));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).clearActivePotions();
			} else {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionFirefuzhuo.potion, (int) 500, (int) 1));
			}
		}
		if ((((sourceentity.getEntityData().getString("vision"))).equals("vw"))) {
			entity.attackEntityFrom(DamageSource.DROWN, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 1));
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
				entity.attackEntityFrom(DamageSource.GENERIC, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 3));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).clearActivePotions();
			} else {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionWaterfuzhuo.potion, (int) 500, (int) 1));
			}
		}
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
					}, "effect @e[r=5,type=!player] solomon:firefuzhuo 10");
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
					}, "effect @e[r=5,type=!player] solomon:waterfuzhuo 10");
				}
			}
			if ((new Object() {
				boolean check() {
					if (entity instanceof EntityLivingBase) {
						Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
						for (PotionEffect effect : effects) {
							if (effect.getPotion() == PotionBingfuzhuo.potion)
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
					}, "effect @e[r=5,type=!player] solomon:bingfuzhuo 10");
				}
			}
			if ((new Object() {
				boolean check() {
					if (entity instanceof EntityLivingBase) {
						Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
						for (PotionEffect effect : effects) {
							if (effect.getPotion() == PotionLeifuzhuo.potion)
								return true;
						}
					}
					return false;
				}
			}.check())) {
				entity.attackEntityFrom(DamageSource.LIGHTNING_BOLT, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 10));
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
					}, "effect @e[r=5,type=!player] solomon:leifuzhuo 10");
				}
			}
		}
		if ((((sourceentity.getEntityData().getString("vision"))).equals("vwi"))) {
			entity.attackEntityFrom(DamageSource.FALL, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 1));
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
				entity.attackEntityFrom(DamageSource.IN_FIRE, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 2));
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
					}, "effect @e[r=5,type=!player] solomon:firefuzhuo 10");
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
				entity.attackEntityFrom(DamageSource.DROWN, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 2));
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
					}, "effect @e[r=5,type=!player] solomon:waterfuzhuo 10");
				}
			}
			if ((new Object() {
				boolean check() {
					if (entity instanceof EntityLivingBase) {
						Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
						for (PotionEffect effect : effects) {
							if (effect.getPotion() == PotionBingfuzhuo.potion)
								return true;
						}
					}
					return false;
				}
			}.check())) {
				entity.attackEntityFrom(DamageSource.DROWN, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 2));
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
					}, "effect @e[r=5,type=!player] solomon:bingfuzhuo 10");
				}
			}
			if ((new Object() {
				boolean check() {
					if (entity instanceof EntityLivingBase) {
						Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
						for (PotionEffect effect : effects) {
							if (effect.getPotion() == PotionLeifuzhuo.potion)
								return true;
						}
					}
					return false;
				}
			}.check())) {
				entity.attackEntityFrom(DamageSource.LIGHTNING_BOLT, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 2));
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
					}, "effect @e[r=5,type=!player] solomon:leifuzhuo 10");
				}
			}
		}
		if ((((sourceentity.getEntityData().getString("vision"))).equals("vr"))) {
			entity.attackEntityFrom(DamageSource.IN_WALL, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 1));
		}
		if ((((sourceentity.getEntityData().getString("vision"))).equals("vi"))) {
			entity.attackEntityFrom(DamageSource.IN_FIRE, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 1));
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
				entity.attackEntityFrom(DamageSource.GENERIC, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 2));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).clearActivePotions();
			} else {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionBingfuzhuo.potion, (int) 500, (int) 1));
			}
			if ((new Object() {
				boolean check() {
					if (entity instanceof EntityLivingBase) {
						Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
						for (PotionEffect effect : effects) {
							if (effect.getPotion() == PotionLeifuzhuo.potion)
								return true;
						}
					}
					return false;
				}
			}.check())) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) (((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 5) * 2.5));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).clearActivePotions();
			} else {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionBingfuzhuo.potion, (int) 500, (int) 1));
			}
		}
		if ((((sourceentity.getEntityData().getString("vision"))).equals("vl"))) {
			entity.attackEntityFrom(DamageSource.LIGHTNING_BOLT, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 1));
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
				entity.attackEntityFrom(DamageSource.GENERIC, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 2.5));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).clearActivePotions();
			} else {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionLeifuzhuo.potion, (int) 500, (int) 1));
			}
			if ((new Object() {
				boolean check() {
					if (entity instanceof EntityLivingBase) {
						Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
						for (PotionEffect effect : effects) {
							if (effect.getPotion() == PotionBingfuzhuo.potion)
								return true;
						}
					}
					return false;
				}
			}.check())) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) ((sourceentity.getEntityData().getDouble("gongdeshanghai")) * 2.5));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).clearActivePotions();
			} else {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionLeifuzhuo.potion, (int) 500, (int) 1));
			}
		}
	}
}
