package net.mcreator.solomon.procedure;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.GuiTextField;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.ImmutableMap;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureJinengsheding extends ElementsSolomonMod.ModElement {
	public ProcedureJinengsheding(ElementsSolomonMod instance) {
		super(instance, 248);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Jinengsheding!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			System.err.println("Failed to load dependency guistate for procedure Jinengsheding!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		if (((((((((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:ji1");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("\u7487\u7391\u5C4F")) || (((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:ji1");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("\u6076\u66DC\u5F00\u773C"))) || (((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:ji1");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("\u5343\u65E9\u632F"))) || (((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:ji1");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("\u7389\u748B\u62A4\u76FE"))) || (((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:ji1");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("\u708E\u6D41\u5343\u91CC"))) || (((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:ji1");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("")))) {
			entity.getEntityData().setString("vji1", (new Object() {
				public String getText() {
					GuiTextField textField = (GuiTextField) guistate.get("text:ji1");
					if (textField != null) {
						return textField.getText();
					}
					return "";
				}
			}.getText()));
			if (ProcedureVisiongepan.executeProcedure(ImmutableMap.of("entity", entity))) {
				{
					ItemStack _stack = (new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof EntityPlayerMP) {
								Container _current = ((EntityPlayerMP) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (0)));
					if (!_stack.hasTagCompound())
						_stack.setTagCompound(new NBTTagCompound());
					_stack.getTagCompound().setString("vji1", (new Object() {
						public String getText() {
							GuiTextField textField = (GuiTextField) guistate.get("text:ji1");
							if (textField != null) {
								return textField.getText();
							}
							return "";
						}
					}.getText()));
				}
			}
		} else {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u6280\u80FD1\u69FD \u65E0\u6B64\u6280\u80FD\u3002"), (false));
			}
		}
		if (((((((((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:ji2");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("\u7487\u7391\u5C4F")) || (((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:ji2");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("\u6076\u66DC\u5F00\u773C"))) || (((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:ji2");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("\u5343\u65E9\u632F"))) || (((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:ji2");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("\u7389\u748B\u62A4\u76FE"))) || (((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:ji2");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("\u708E\u6D41\u5343\u91CC"))) || (((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:ji2");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("")))) {
			entity.getEntityData().setString("vji2", (new Object() {
				public String getText() {
					GuiTextField textField = (GuiTextField) guistate.get("text:ji2");
					if (textField != null) {
						return textField.getText();
					}
					return "";
				}
			}.getText()));
			if (ProcedureVisiongepan.executeProcedure(ImmutableMap.of("entity", entity))) {
				{
					ItemStack _stack = (new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof EntityPlayerMP) {
								Container _current = ((EntityPlayerMP) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (0)));
					if (!_stack.hasTagCompound())
						_stack.setTagCompound(new NBTTagCompound());
					_stack.getTagCompound().setString("vji2", (new Object() {
						public String getText() {
							GuiTextField textField = (GuiTextField) guistate.get("text:ji2");
							if (textField != null) {
								return textField.getText();
							}
							return "";
						}
					}.getText()));
				}
			}
		} else {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u6280\u80FD2\u69FD \u65E0\u6B64\u6280\u80FD\u3002"), (false));
			}
		}
		if (((((((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:big");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("\u5929\u661F")) || ((((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:big");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("\u5929\u8857\u5DE1\u6E38")) || ((((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:big");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("\u7F8E\u5999\u65C5\u7A0B")) || (((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:big");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("\u98CE\u795E\u4E4B\u8BD7"))))) || (((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:big");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("\u9ECE\u660E"))) || (((new Object() {
			public String getText() {
				GuiTextField textField = (GuiTextField) guistate.get("text:big");
				if (textField != null) {
					return textField.getText();
				}
				return "";
			}
		}.getText())).equals("")))) {
			entity.getEntityData().setString("vda", (new Object() {
				public String getText() {
					GuiTextField textField = (GuiTextField) guistate.get("text:big");
					if (textField != null) {
						return textField.getText();
					}
					return "";
				}
			}.getText()));
			if (ProcedureVisiongepan.executeProcedure(ImmutableMap.of("entity", entity))) {
				{
					ItemStack _stack = (new Object() {
						public ItemStack getItemStack(int sltid) {
							if (entity instanceof EntityPlayerMP) {
								Container _current = ((EntityPlayerMP) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (0)));
					if (!_stack.hasTagCompound())
						_stack.setTagCompound(new NBTTagCompound());
					_stack.getTagCompound().setString("vda", (new Object() {
						public String getText() {
							GuiTextField textField = (GuiTextField) guistate.get("text:big");
							if (textField != null) {
								return textField.getText();
							}
							return "";
						}
					}.getText()));
				}
			}
		} else {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("\u5927\u62DB\u69FD \u65E0\u6B64\u6280\u80FD\u3002"), (false));
			}
		}
	}
}
