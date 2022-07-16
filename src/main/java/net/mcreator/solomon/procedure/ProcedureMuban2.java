package net.mcreator.solomon.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureMuban2 extends ElementsSolomonMod.ModElement {
	public ProcedureMuban2(ElementsSolomonMod instance) {
		super(instance, 255);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Muban2!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure Muban2!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double bianlifangk = 0;
		double LL_long = 0;
		entity.getEntityData().setString("vji1", ((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getString("vji1") : ""));
		entity.getEntityData().setString("vji2", ((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getString("vji2") : ""));
		entity.getEntityData().setString("vda", ((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getString("vda") : ""));
	}
}
