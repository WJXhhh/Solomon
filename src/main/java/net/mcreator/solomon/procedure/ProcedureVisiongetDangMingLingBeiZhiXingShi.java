package net.mcreator.solomon.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.item.ItemVlw;
import net.mcreator.solomon.item.ItemVlf;
import net.mcreator.solomon.item.ItemGowin;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;
import java.util.HashMap;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureVisiongetDangMingLingBeiZhiXingShi extends ElementsSolomonMod.ModElement {
	public ProcedureVisiongetDangMingLingBeiZhiXingShi(ElementsSolomonMod instance) {
		super(instance, 232);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure VisiongetDangMingLingBeiZhiXingShi!");
			return;
		}
		if (dependencies.get("cmdparams") == null) {
			System.err.println("Failed to load dependency cmdparams for procedure VisiongetDangMingLingBeiZhiXingShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("lif"))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemVlf.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
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
		}.getText())).equals("liw"))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemVlw.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
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
		}.getText())).equals("gwi"))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemGowin.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
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
		}.getText())).equals("none"))) {
			entity.getEntityData().setString("vision", "");
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u5DF2\u6E05\u9664\u5143\u7D20"), (false));
			}
		}
	}
}
