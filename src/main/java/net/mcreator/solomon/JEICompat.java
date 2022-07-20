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

import mezz.jei.api.*;
import mezz.jei.api.ingredients.IIngredientRegistry;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import mezz.jei.api.recipe.transfer.IRecipeTransferRegistry;
import net.mcreator.solomon.gui.GuiJuhe;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.World;

import java.util.IllegalFormatException;
import java.util.Random;
import net.minecraft.client.resources.I18n;

import static net.minecraft.util.text.translation.I18n.canTranslate;
import static net.minecraft.util.text.translation.I18n.translateToFallback;

@ElementsSolomonMod.ModElement.Tag
@JEIPlugin
public class JEICompat extends ElementsSolomonMod.ModElement implements IModPlugin {
	/**
	 * Do not remove this constructor
	 */
	public JEICompat(ElementsSolomonMod instance) {
		super(instance, 406);
	}

	@Override
	public void initElements() {
	}

	@Override
	public void init(FMLInitializationEvent event) {
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
	}

	@Override
	public void generateWorld(Random random, int posX, int posZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
	}

	@Override
	public void serverLoad(FMLServerStartingEvent event) {
	}

	@Override
	public void registerModels(ModelRegistryEvent event) {
	}
	@Override
	public void registerCategories(IRecipeCategoryRegistration registry) {
		final IJeiHelpers helpers = registry.getJeiHelpers();
		final IGuiHelper gui = helpers.getGuiHelper();

		registry.addRecipeCategories(new JuheqiRecipeCategory(gui)); //这里的$Custom$RecipeCategory在下一篇里写好对应的RecipeCategory后填入对应的类。下面的同样。
	}
	@Override
	public void register(IModRegistry registry) {
		final IIngredientRegistry ingredientRegistry = registry.getIngredientRegistry();
		final IJeiHelpers jeiHelpers = registry.getJeiHelpers();
		IRecipeTransferRegistry recipeTransfer = registry.getRecipeTransferRegistry();

		registry.addRecipes(JuheqiRecipeMaker.getRecipes(jeiHelpers),RecipesCategories.Juheqi);
		recipeTransfer.addRecipeTransferHandler(GuiJuhe.GuiContainerMod.class,RecipesCategories.Juheqi,0,1,3,36);//这里的RecipesCategories到后面定义。这里的后四个参数 i,i1,i2,i3待施工
	}
	public static String translateToLocal(String key){
		if(canTranslate(key)) return translateToLocal(key);
		else return translateToFallback(key);
	}

	public static String translateToLocalFormatted(String key,Object... format){
		String s = translateToLocal(key);
		try {
			return String.format(s,format);
		}catch (IllegalFormatException e){
			return "Format Error:"+s ;
		}
	}
}
