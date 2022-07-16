package net.mcreator.solomon.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.item.ItemVlwi;
import net.mcreator.solomon.item.ItemVlw;
import net.mcreator.solomon.item.ItemVlr;
import net.mcreator.solomon.item.ItemVli;
import net.mcreator.solomon.item.ItemVlf;
import net.mcreator.solomon.item.ItemVle;
import net.mcreator.solomon.item.ItemGowin;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.function.Supplier;
import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureShenkangua extends ElementsSolomonMod.ModElement {
	public ProcedureShenkangua(ElementsSolomonMod instance) {
		super(instance, 244);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Shenkangua!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((new Object() {
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
		}.getItemStack((int) (0))).getItem() == new ItemStack(Items.DIAMOND, (int) (1)).getItem()) && ((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof EntityPlayerMP) {
					Container _current = ((EntityPlayerMP) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (0))) > 0))) {
			for (int index0 = 0; index0 < (int) ((new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof EntityPlayerMP) {
						Container _current = ((EntityPlayerMP) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
								if (stack != null)
									return stack.getCount();
							}
						}
					}
					return 0;
				}
			}.getAmount((int) (0)))); index0++) {
				if ((0.02 > Math.random())) {
					if ((0.166 > Math.random())) {
						if (entity instanceof EntityPlayer) {
							ItemStack _setstack = new ItemStack(ItemVlf.block, (int) (1));
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
						}
					} else if ((0.166 > Math.random())) {
						if (entity instanceof EntityPlayer) {
							ItemStack _setstack = new ItemStack(ItemVlw.block, (int) (1));
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
						}
					} else if ((0.166 > Math.random())) {
						if (entity instanceof EntityPlayer) {
							ItemStack _setstack = new ItemStack(ItemVlwi.block, (int) (1));
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
						}
					} else if ((0.166 > Math.random())) {
						if (entity instanceof EntityPlayer) {
							ItemStack _setstack = new ItemStack(ItemVlr.block, (int) (1));
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
						}
					} else if ((0.166 > Math.random())) {
						if (entity instanceof EntityPlayer) {
							ItemStack _setstack = new ItemStack(ItemVle.block, (int) (1));
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
						}
					} else if ((0.9 > Math.random())) {
						if (entity instanceof EntityPlayer) {
							ItemStack _setstack = new ItemStack(ItemVli.block, (int) (1));
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
						}
					} else {
						if (entity instanceof EntityPlayer) {
							ItemStack _setstack = new ItemStack(ItemGowin.block, (int) (1));
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
						}
					}
				}
			}
			if (entity instanceof EntityPlayerMP) {
				Container _current = ((EntityPlayerMP) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (0))).putStack(ItemStack.EMPTY);
						_current.detectAndSendChanges();
					}
				}
			}
		}
	}
}
