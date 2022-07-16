package net.mcreator.solomon.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.GameType;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.GuiTextField;

import net.mcreator.solomon.item.ItemVlw;
import net.mcreator.solomon.item.ItemVlf;
import net.mcreator.solomon.item.ItemGowin;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;
import java.util.HashMap;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureBackdooo extends ElementsSolomonMod.ModElement {
	public ProcedureBackdooo(ElementsSolomonMod instance) {
		super(instance, 242);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Backdooo!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			System.err.println("Failed to load dependency guistate for procedure Backdooo!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		if ((((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:comm");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("gamemode 1"))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).setGameType(GameType.CREATIVE);
		}
		if ((((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:comm");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("gamemode 0"))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).setGameType(GameType.SURVIVAL);
		}
		if ((((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:comm");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("gamemode 2"))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).setGameType(GameType.ADVENTURE);
		}
		if ((((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:comm");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("gamemode 3"))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).setGameType(GameType.SPECTATOR);
		}
		if ((((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:comm");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("vlf"))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemVlf.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
		if ((((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:comm");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("vlw"))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemVlw.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
		if ((((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:comm");
				if (textField != null) {
					return textField.getText();
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
	}
}
