
package net.mcreator.solomon.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.solomon.item.ItemShuij;
import net.mcreator.solomon.block.BlockShuijingkuang;
import net.mcreator.solomon.ElementsSolomonMod;

@ElementsSolomonMod.ModElement.Tag
public class RecipeShujin extends ElementsSolomonMod.ModElement {
	public RecipeShujin(ElementsSolomonMod instance) {
		super(instance, 203);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockShuijingkuang.block, (int) (1)), new ItemStack(ItemShuij.block, (int) (1)), 1F);
	}
}
