package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
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
import net.mcreator.solomon.item.ItemGowin;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;
import java.util.HashMap;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureVji2AnXiaAnJianShi extends ElementsSolomonMod.ModElement {
	public ProcedureVji2AnXiaAnJianShi(ElementsSolomonMod instance) {
		super(instance, 251);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Vji2AnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Vji2AnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Vji2AnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Vji2AnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Vji2AnXiaAnJianShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double bianlifangk = 0;
		double LL_long = 0;
		if ((((entity.getEntityData().getDouble("vcd")) <= 0)
				&& ((((entity.getEntityData().getString("vji2"))).equals("\u7389\u748B\u62A4\u76FE")) && ((entity instanceof EntityPlayer)
						? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemVlr.block, (int) (1)))
						: false)))) {
			entity.getEntityData().setDouble("vcd", 100);
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				ProcedureYuzhangvoice.executeProcedure($_dependencies);
			}
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, (int) 180, (int) 6));
		}
		if ((((entity.getEntityData().getDouble("vcd")) <= 0)
				&& ((((entity.getEntityData().getString("vji2"))).equals("\u5343\u65E9\u632F")) && (((entity instanceof EntityPlayer)
						? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemVlwi.block, (int) (1)))
						: false)
						|| ((entity instanceof EntityPlayer)
								? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemGowin.block, (int) (1)))
								: false))))) {
			entity.getEntityData().setDouble("vcd", 40);
			bianlifangk = (double) 0;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				ProcedureQianzaovoice.executeProcedure($_dependencies);
			}
			for (int index0 = 0; index0 < (int) (6); index0++) {
				if (((world.getBlockState(new BlockPos((int) x, (int) ((entity.posY) + ((bianlifangk) + 1)), (int) z))).getBlock() == Blocks.AIR
						.getDefaultState().getBlock())) {
					bianlifangk = (double) ((bianlifangk) + 1);
				}
			}
			if (((bianlifangk) > 5)) {
				entity.setPositionAndUpdate(x, (y + 5), z);
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 40, (int) 2));
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
				}, "tp @e[type=!player,r=15] @p");
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
				}, "summon solomon:qianzaochang");
			}
		}
		if ((((entity.getEntityData().getDouble("vcd")) <= 0)
				&& ((((entity.getEntityData().getString("vji2"))).equals("\u708E\u6D41\u5343\u91CC")) && ((entity instanceof EntityPlayer)
						? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemVlf.block, (int) (1)))
						: false)))) {
			entity.getEntityData().setDouble("vcd", 100);
			LL_long = (double) 1;
			for (int index1 = 0; index1 < (int) (5); index1++) {
				if (((world.getBlockState(new BlockPos((int) (x + (LL_long)), (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x + (LL_long)), (int) y, (int) z), Blocks.FIRE.getDefaultState(), 3);
				}
				if (((world.getBlockState(new BlockPos((int) (x - (LL_long)), (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x - (LL_long)), (int) y, (int) z), Blocks.FIRE.getDefaultState(), 3);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + (LL_long))))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + (LL_long))), Blocks.FIRE.getDefaultState(), 3);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - (LL_long))))).getBlock() == Blocks.AIR.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - (LL_long))), Blocks.FIRE.getDefaultState(), 3);
				}
				LL_long = (double) ((LL_long) + 1);
			}
		}
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("entity", entity);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			$_dependencies.put("world", world);
			ProcedureJienngxuanji.executeProcedure($_dependencies);
		}
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("entity", entity);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			$_dependencies.put("world", world);
			ProcedureJinengeyao.executeProcedure($_dependencies);
		}
	}
}
