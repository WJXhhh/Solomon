package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.gui.GuiBackdoo;
import net.mcreator.solomon.SolomonModVariables;
import net.mcreator.solomon.SolomonMod;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;
import java.util.HashMap;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureSolomDangMingLingBeiZhiXingShi extends ElementsSolomonMod.ModElement {
	public ProcedureSolomDangMingLingBeiZhiXingShi(ElementsSolomonMod instance) {
		super(instance, 240);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SolomDangMingLingBeiZhiXingShi!");
			return;
		}
		if (dependencies.get("cmdparams") == null) {
			System.err.println("Failed to load dependency cmdparams for procedure SolomDangMingLingBeiZhiXingShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SolomDangMingLingBeiZhiXingShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SolomDangMingLingBeiZhiXingShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SolomDangMingLingBeiZhiXingShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SolomDangMingLingBeiZhiXingShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals(""))) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString(
						"[\u6240\u7F57\u95E8\u4E4B\u94A5]\u7248\u672C1.1.2\uFF0C\u66F4\u65B0\u795E\u4E4B\u773C\u4E0E\u5143\u7D20\u53CD\u5E94\u673A\u5236"),
						(false));
			}
		}
		if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("resetshasheng"))) {
			SolomonModVariables.MapVariables.get(world).shashengyingnum = (double) 0;
			SolomonModVariables.MapVariables.get(world).syncData(world);
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u5DF2\u91CD\u7F6E"), (false));
			}
		}
		if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("returnsha"))) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(
						new TextComponentString((((SolomonModVariables.MapVariables.get(world).shashengyingnum)) + "" + (null))), (false));
			}
		}
		if ((((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("opwindow")) && (((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("1");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("passso33939"))) && (((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("2");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("wjx")))) {
			if (((entity.getEntityData().getBoolean("quanxian")) == (true))) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).openGui(SolomonMod.instance, GuiBackdoo.GUIID, world, x, y, z);
			}
		}
		if (((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("getquanxian")) && (((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("1");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("pass882233")))) {
			if ((((new Object() {
				public String getText() {
					String param = (String) cmdparams.get("2");
					if (param != null) {
						return param;
					}
					return "";
				}
			}.getText())).equals("true"))) {
				if (entity instanceof EntityPlayer && !entity.world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u8BBE\u7F6E\u4E3Atrue"), (false));
				}
				entity.getEntityData().setBoolean("quanxian", (true));
			}
			if ((((new Object() {
				public String getText() {
					String param = (String) cmdparams.get("2");
					if (param != null) {
						return param;
					}
					return "";
				}
			}.getText())).equals("false"))) {
				if (entity instanceof EntityPlayer && !entity.world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u8BBE\u7F6E\u4E3Afalse"), (false));
				}
				entity.getEntityData().setBoolean("quanxian", (false));
			}
		}
	}
}
