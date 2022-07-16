package net.mcreator.solomon.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.item.ItemSeyu;
import net.mcreator.solomon.item.ItemLanduozhijing;
import net.mcreator.solomon.item.ItemJiduzhijing;
import net.mcreator.solomon.item.ItemGongyuan;
import net.mcreator.solomon.item.ItemFeiyingxiuqiu;
import net.mcreator.solomon.item.ItemDanshouy;
import net.mcreator.solomon.item.ItemChangyuan;
import net.mcreator.solomon.item.ItemBoornur;
import net.mcreator.solomon.item.ItemBaoshijingh;
import net.mcreator.solomon.item.ItemAomanzhijing;
import net.mcreator.solomon.entity.EntityTanlanshitu;
import net.mcreator.solomon.entity.EntitySeyushitu;
import net.mcreator.solomon.entity.EntityLanduoshitu;
import net.mcreator.solomon.entity.EntityJdst;
import net.mcreator.solomon.entity.EntityBaoshishitu;
import net.mcreator.solomon.entity.EntityBaonushitu;
import net.mcreator.solomon.entity.EntityAomanshitu;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureDownzhe extends ElementsSolomonMod.ModElement {
	public ProcedureDownzhe(ElementsSolomonMod instance) {
		super(instance, 155);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Downzhe!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Downzhe!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Downzhe!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Downzhe!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Downzhe!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((entity instanceof EntityBlaze)) {
			if ((Math.random() < 0.2)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemBoornur.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if ((entity instanceof EntitySpider)) {
			if ((Math.random() < 0.15)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemChangyuan.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if ((entity instanceof EntitySkeleton)) {
			if ((Math.random() < 0.2)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemSeyu.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if ((entity instanceof EntityZombie)) {
			if ((Math.random() < 0.2)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemBaoshijingh.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if ((entity instanceof EntitySilverfish)) {
			if ((Math.random() < 0.2)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemLanduozhijing.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if ((entity instanceof EntityCreeper)) {
			if ((Math.random() < 0.2)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemJiduzhijing.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if ((entity instanceof EntityEnderman)) {
			if ((Math.random() < 0.5)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemAomanzhijing.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if ((entity instanceof EntityZombie)) {
			if ((Math.random() < 0.15)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemDanshouy.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if ((entity instanceof EntitySkeleton)) {
			if ((Math.random() < 0.15)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemGongyuan.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if ((entity instanceof EntitySeyushitu.EntityCustom)) {
			if ((Math.random() < 0.15)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemFeiyingxiuqiu.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if ((entity instanceof EntityBaoshishitu.EntityCustom)) {
			if ((Math.random() < 0.15)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemFeiyingxiuqiu.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if ((entity instanceof EntityTanlanshitu.EntityCustom)) {
			if ((Math.random() < 0.15)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemFeiyingxiuqiu.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if ((entity instanceof EntityLanduoshitu.EntityCustom)) {
			if ((Math.random() < 0.15)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemFeiyingxiuqiu.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if ((entity instanceof EntityBaonushitu.EntityCustom)) {
			if ((Math.random() < 0.15)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemFeiyingxiuqiu.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if ((entity instanceof EntityJdst.EntityCustom)) {
			if ((Math.random() < 0.15)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemFeiyingxiuqiu.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if ((entity instanceof EntityAomanshitu.EntityCustom)) {
			if ((Math.random() < 0.15)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemFeiyingxiuqiu.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
	}

	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			int i = (int) entity.posX;
			int j = (int) entity.posY;
			int k = (int) entity.posZ;
			World world = entity.world;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
