package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.item.ItemZhuofeng;
import net.mcreator.solomon.item.ItemXialimiechen;
import net.mcreator.solomon.item.ItemWuqie;
import net.mcreator.solomon.item.ItemTicaozhidaoguang;
import net.mcreator.solomon.item.ItemTianmuyingdadao;
import net.mcreator.solomon.item.ItemTanggong;
import net.mcreator.solomon.item.ItemMorasword;
import net.mcreator.solomon.item.ItemLvqiang;
import net.mcreator.solomon.item.ItemGuanhong;
import net.mcreator.solomon.item.ItemFeileiz;
import net.mcreator.solomon.item.ItemDongjibaixing;
import net.mcreator.solomon.item.ItemChihuyudao;
import net.mcreator.solomon.item.ItemBoluan;
import net.mcreator.solomon.gui.GuiVisionset;
import net.mcreator.solomon.SolomonMod;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureLAnXiaAnJianShi extends ElementsSolomonMod.ModElement {
	public ProcedureLAnXiaAnJianShi(ElementsSolomonMod instance) {
		super(instance, 173);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LAnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LAnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LAnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LAnXiaAnJianShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LAnXiaAnJianShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((entity.isSneaking())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).openGui(SolomonMod.instance, GuiVisionset.GUIID, world, x, y, z);
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemGuanhong.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(
						new TextComponentString(net.minecraft.client.resources.I18n.format("item.guanhong.name", new Object[0])), (false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.wealevel", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.weadama", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)
								* 5) + 8)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity)
						.sendStatusMessage(new TextComponentString(ProcedureGetvision.executeProcedure(ImmutableMap.of("entity", entity))), (false));
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemWuqie.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u00A7e\u96FE\u5207\u4E4B\u56DE\u5149"), (false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.wealevel", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.weadama", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)
								* 5) + 10)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity)
						.sendStatusMessage(new TextComponentString(ProcedureGetvision.executeProcedure(ImmutableMap.of("entity", entity))), (false));
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemLvqiang.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u00A7e\u548C\u749E\u9E22"), (false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.wealevel", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.weadama", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)
								* 5) + 11)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity)
						.sendStatusMessage(new TextComponentString(ProcedureGetvision.executeProcedure(ImmutableMap.of("entity", entity))), (false));
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemXialimiechen.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u00A7d\u5323\u91CC\u706D\u8FB0"), (false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.wealevel", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.weadama", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)
								* 3) + 5)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity)
						.sendStatusMessage(new TextComponentString(ProcedureGetvision.executeProcedure(ImmutableMap.of("entity", entity))), (false));
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemTianmuyingdadao.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u00A7d\u5929\u76EE\u5F71\u6253\u5200"), (false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.wealevel", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.weadama", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)
								* 3) + 6)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity)
						.sendStatusMessage(new TextComponentString(ProcedureGetvision.executeProcedure(ImmutableMap.of("entity", entity))), (false));
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemTanggong.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u00A7b\u5F39\u5F13"), (false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.wealevel", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.weadama", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)
								* 2) + 2)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity)
						.sendStatusMessage(new TextComponentString(ProcedureGetvision.executeProcedure(ImmutableMap.of("entity", entity))), (false));
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemChihuyudao.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u00A7b\u5403\u864E\u9C7C\u5200"), (false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.wealevel", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.weadama", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)
								* 2) + 5)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity)
						.sendStatusMessage(new TextComponentString(ProcedureGetvision.executeProcedure(ImmutableMap.of("entity", entity))), (false));
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemDongjibaixing.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u00A7e\u51AC\u6781\u767D\u661F"), (false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.wealevel", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.weadama", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)
								* 5) + 6)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity)
						.sendStatusMessage(new TextComponentString(ProcedureGetvision.executeProcedure(ImmutableMap.of("entity", entity))), (false));
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemBoluan.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u00A7e\u6CE2\u4E71\u6708\u767D\u7ECF\u6D25"), (false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.wealevel", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.weadama", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)
								* 5) + 7)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity)
						.sendStatusMessage(new TextComponentString(ProcedureGetvision.executeProcedure(ImmutableMap.of("entity", entity))), (false));
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemZhuofeng.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u00A7e\u65AB\u950B\u4E4B\u5203"), (false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.wealevel", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.weadama", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)
								* 5) + 11)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity)
						.sendStatusMessage(new TextComponentString(ProcedureGetvision.executeProcedure(ImmutableMap.of("entity", entity))), (false));
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemTicaozhidaoguang.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u00A7e\u8599\u8349\u4E4B\u7A3B\u5149"), (false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.wealevel", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.weadama", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)
								* 5) + 11)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity)
						.sendStatusMessage(new TextComponentString(ProcedureGetvision.executeProcedure(ImmutableMap.of("entity", entity))), (false));
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemFeileiz.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u00A7e\u98DE\u96F7\u4E4B\u5F26\u632F"), (false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.wealevel", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.weadama", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)
								* 5) + 11)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity)
						.sendStatusMessage(new TextComponentString(ProcedureGetvision.executeProcedure(ImmutableMap.of("entity", entity))), (false));
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemMorasword.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u00A7e\u78D0\u5CA9\u7ED3\u7EFF"), (false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.wealevel", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString((((("\u00A7r") + ""
						+ (net.minecraft.client.resources.I18n.format("msg.weadama", new Object[0])) + "" + (":\u00A7a")))
						+ ""
						+ ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.hasTagCompound()
										? ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getTagCompound().getDouble("sololevel")
										: -1)
								* 5) + 11)))),
						(false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity)
						.sendStatusMessage(new TextComponentString(ProcedureGetvision.executeProcedure(ImmutableMap.of("entity", entity))), (false));
			}
		}
		if ((entity.isSneaking())) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity)
						.sendStatusMessage(new TextComponentString(((net.minecraft.client.resources.I18n.format("msg.vision1", new Object[0])) + ""
								+ ((entity.getEntityData().getString("vji1"))))), (false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity)
						.sendStatusMessage(new TextComponentString(((net.minecraft.client.resources.I18n.format("msg.vision2", new Object[0])) + ""
								+ ((entity.getEntityData().getString("vji2"))))), (false));
			}
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity)
						.sendStatusMessage(new TextComponentString(((net.minecraft.client.resources.I18n.format("msg.vision3", new Object[0])) + ""
								+ ((entity.getEntityData().getString("vda"))))), (false));
			}
		}
	}
}
