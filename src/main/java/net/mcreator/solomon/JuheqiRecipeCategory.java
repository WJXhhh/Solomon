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
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.World;

import java.util.Random;

@ElementsSolomonMod.ModElement.Tag
public class JuheqiRecipeCategory extends AbstractJuheqi<JuheqiRecipe> {

	private final IDrawable background;
	private final String name;

	public JuheqiRecipeCategory(IGuiHelper helper){
		super(helper);
		background = helper.createDrawable(TEXTURES,4,12,150,60);//形参和以前讲的相同
		name = "\u805a\u5408\u5668";//这里是JEI会显示的标题，就是打开合成表显示在最上面的那个
	}

	@Override
	public IDrawable getBackground() {
		return background;
	}

	@Override
	public String getTitle() {
		return name;
	}

	@Override
	public String getModName() {
		return "Solomon Key";
	}

	@Override
	public String getUid() {
		return RecipesCategories.Juheqi;
	}

	@Override
	public void setRecipe(IRecipeLayout iRecipeLayout, JuheqiRecipe juheRecipe, IIngredients iIngredients) {
		IGuiItemStackGroup stacks = iRecipeLayout.getItemStacks();
		stacks.init(input1,true,44,16); //第二个参数一般来说若是输入端，填true，输出就是false
		stacks.init(input2,true,114,16);
		stacks.init(output,false,113,45);
		stacks.set(iIngredients);
	}
}
