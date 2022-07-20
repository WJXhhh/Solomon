
package net.mcreator.solomon;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;


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
		return "Solomon key";
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
