
package net.mcreator.solomon;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.util.ResourceLocation;

@ElementsSolomonMod.ModElement.Tag
public abstract class AbstractJuheqi <T extends IRecipeWrapper> implements IRecipeCategory<T> {

	protected static final ResourceLocation TEXTURES = new ResourceLocation("solomon:textures/juhe.png");
	protected static final int input1 = 0; //有多余的input就起名input1……input2什么的吧，有几个input,output就定义几个，数字瞎写也没关系，只要你能想起来。
	protected static final int input2 = 1;
	protected static final int output = 2;

	public AbstractJuheqi(IGuiHelper helper) {
	}
}
