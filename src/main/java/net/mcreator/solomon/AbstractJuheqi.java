/**
 * This mod element is always locked. Enter your code in the methods below.
 * If you don't need some of these methods, you can remove them as they
 * are overrides of the base class ElementsSolomonMod.ModElement.
 *
 * You can register new events in this class too.
 *
 * As this class is loaded into mod element list, it NEEDS to extend
 * ModElement class. If you remove this extend statement or remove the
 * constructor, the compilation will fail.
 *
 * If you want to make a plain independent class, create it in
 * "Workspace" -> "Source" menu.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
*/
package net.mcreator.solomon;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.World;

import java.util.Random;

@ElementsSolomonMod.ModElement.Tag
public abstract class AbstractJuheqi <T extends IRecipeWrapper> implements IRecipeCategory<T> {

	protected static final ResourceLocation TEXTURES = new ResourceLocation("solomon:textures/juhe.png");
	protected static final int input1 = 0; //有多余的input就起名input1……input2什么的吧，有几个input,output就定义几个，数字瞎写也没关系，只要你能想起来。
	protected static final int input2 = 1;
	protected static final int output = 2;

	public AbstractJuheqi(IGuiHelper helper) {
	}
}
