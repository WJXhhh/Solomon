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

import net.mcreator.solomon.entity.EntityTianxing2;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsSolomonMod.ModElement.Tag
public class Tianxingmodelrender extends RenderLiving {
	/**
	 * Do not remove this constructor
	 */
	static public WavefrontObject standModel = null;

	static public ResourceLocationRaw modelLocation = new ResourceLocationRaw("solomon","geo_orger.obj");
	static public ResourceLocationRaw textureLocation = new ResourceLocationRaw("solomon","geo_order.png");

	public Tianxingmodelrender(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}


	public void renderModel(Entity entity){
		if(standModel == null){
			standModel = new WavefrontObject(modelLocation);
		}

		this.bindEntityTexture(entity);



		GL11.glPushMatrix();
		GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);

		OpenGlHelper.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, GL11.GL_ONE, GL11.GL_ZERO);

	}



	@Nullable
	@Override
	protected ResourceLocationRaw getEntityTexture(Entity p_110775_1_) {
		return textureLocation;
	}
}
