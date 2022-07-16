package net.mcreator.solomon.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.item.ItemNenglifu;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.function.Supplier;
import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureVisiongepan extends ElementsSolomonMod.ModElement {
	public ProcedureVisiongepan(ElementsSolomonMod instance) {
		super(instance, 254);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Visiongepan!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
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
		}.getItemStack((int) (0))).getItem() == new ItemStack(ItemNenglifu.block, (int) (1)).getItem())) {
			return (true);
		}
		return (false);
	}
}
