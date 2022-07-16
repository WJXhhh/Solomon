
package net.mcreator.solomon.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.solomon.item.ItemSamelsoul;
import net.mcreator.solomon.item.ItemMammoncan;
import net.mcreator.solomon.item.ItemLucican;
import net.mcreator.solomon.item.ItemLeviacan;
import net.mcreator.solomon.item.ItemBelphcan;
import net.mcreator.solomon.item.ItemBeelsoul;
import net.mcreator.solomon.item.ItemAsmodsoul;
import net.mcreator.solomon.ElementsSolomonMod;

@ElementsSolomonMod.ModElement.Tag
public class OreDictSoul extends ElementsSolomonMod.ModElement {
	public OreDictSoul(ElementsSolomonMod instance) {
		super(instance, 228);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("soul", new ItemStack(ItemAsmodsoul.block, (int) (1)));
		OreDictionary.registerOre("soul", new ItemStack(ItemBeelsoul.block, (int) (1)));
		OreDictionary.registerOre("soul", new ItemStack(ItemMammoncan.block, (int) (1)));
		OreDictionary.registerOre("soul", new ItemStack(ItemBelphcan.block, (int) (1)));
		OreDictionary.registerOre("soul", new ItemStack(ItemSamelsoul.block, (int) (1)));
		OreDictionary.registerOre("soul", new ItemStack(ItemLeviacan.block, (int) (1)));
		OreDictionary.registerOre("soul", new ItemStack(ItemLucican.block, (int) (1)));
	}
}
