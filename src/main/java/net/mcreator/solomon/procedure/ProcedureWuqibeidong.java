package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.solomon.potion.PotionWaterfuzhuo;
import net.mcreator.solomon.potion.PotionFirefuzhuo;
import net.mcreator.solomon.potion.PotionEyaoajsi;
import net.mcreator.solomon.item.ItemZhuofeng;
import net.mcreator.solomon.item.ItemXialimiechen;
import net.mcreator.solomon.item.ItemWuqie;
import net.mcreator.solomon.item.ItemLvqiang;
import net.mcreator.solomon.item.ItemGuanhong;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;
import java.util.Collection;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureWuqibeidong extends ElementsSolomonMod.ModElement {
	public ProcedureWuqibeidong(ElementsSolomonMod instance) {
		super(instance, 352);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Wuqibeidong!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure Wuqibeidong!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure Wuqibeidong!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Wuqibeidong!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Wuqibeidong!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Wuqibeidong!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Wuqibeidong!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((sourceentity instanceof EntityLivingBase) ? ((EntityLivingBase) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemGuanhong.block, (int) (1)).getItem())) {
			if ((new Object() {
				boolean check() {
					if (sourceentity instanceof EntityLivingBase) {
						Collection<PotionEffect> effects = ((EntityLivingBase) sourceentity).getActivePotionEffects();
						for (PotionEffect effect : effects) {
							if (effect.getPotion() == MobEffects.ABSORPTION)
								return true;
						}
					}
					return false;
				}
			}.check())) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) 10);
			}
		}
		if ((((sourceentity instanceof EntityLivingBase) ? ((EntityLivingBase) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemZhuofeng.block, (int) (1)).getItem())) {
			if ((new Object() {
				boolean check() {
					if (sourceentity instanceof EntityLivingBase) {
						Collection<PotionEffect> effects = ((EntityLivingBase) sourceentity).getActivePotionEffects();
						for (PotionEffect effect : effects) {
							if (effect.getPotion() == MobEffects.ABSORPTION)
								return true;
						}
					}
					return false;
				}
			}.check())) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) 10);
			}
		}
		if ((((sourceentity instanceof EntityLivingBase) ? ((EntityLivingBase) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemLvqiang.block, (int) (1)).getItem())) {
			if ((((sourceentity.getEntityData().getString("vision"))).equals("vwi"))) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) 10);
			}
		}
		if ((((sourceentity instanceof EntityLivingBase) ? ((EntityLivingBase) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemXialimiechen.block, (int) (1)).getItem())) {
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
				entity.attackEntityFrom(DamageSource.GENERIC, (float) 10);
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
				entity.attackEntityFrom(DamageSource.GENERIC, (float) 10);
			}
		}
		if ((((sourceentity instanceof EntityLivingBase) ? ((EntityLivingBase) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemWuqie.block, (int) (1)).getItem())) {
			if ((!((itemstack).hasTagCompound() && (itemstack).getTagCompound().getBoolean("bayin")))) {
				if ((Math.random() < 0.3)) {
					{
						ItemStack _stack = (itemstack);
						if (!_stack.hasTagCompound())
							_stack.setTagCompound(new NBTTagCompound());
						_stack.getTagCompound().setBoolean("bayin", (true));
					}
					for (int index0 = 0; index0 < (int) (5); index0++) {
						world.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, x, y, z, 3, 1, 0);
					}
				}
			}
			if (((itemstack).hasTagCompound() && (itemstack).getTagCompound().getBoolean("bayin"))) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) 15);
				{
					ItemStack _stack = (itemstack);
					if (!_stack.hasTagCompound())
						_stack.setTagCompound(new NBTTagCompound());
					_stack.getTagCompound().setBoolean("bayin", (false));
				}
				for (int index1 = 0; index1 < (int) (5); index1++) {
					world.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, x, y, z, 3, 1, 0);
				}
			}
		}
		if ((new Object() {
			boolean check() {
				if (sourceentity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) sourceentity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == PotionEyaoajsi.potion)
							return true;
					}
				}
				return false;
			}
		}.check())) {
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
				}, "summon solomon:tianjieduan");
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
				}, "effect @e[type=!player,r=2] solomon:damagecus 2 1");
			}
		}
	}
}
