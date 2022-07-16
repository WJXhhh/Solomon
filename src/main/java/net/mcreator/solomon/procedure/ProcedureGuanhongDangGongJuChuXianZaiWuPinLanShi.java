package net.mcreator.solomon.procedure;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureGuanhongDangGongJuChuXianZaiWuPinLanShi extends ElementsSolomonMod.ModElement {
	public ProcedureGuanhongDangGongJuChuXianZaiWuPinLanShi(ElementsSolomonMod instance) {
		super(instance, 51);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure GuanhongDangGongJuChuXianZaiWuPinLanShi!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getInteger("sololevel") : -1) < 1)) {
			{
				ItemStack _stack = (itemstack);
				if (!_stack.hasTagCompound())
					_stack.setTagCompound(new NBTTagCompound());
				_stack.getTagCompound().setInteger("sololevel", 1);
			}
		}
	}
}
