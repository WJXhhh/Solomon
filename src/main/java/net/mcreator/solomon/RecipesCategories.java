
package net.mcreator.solomon;

import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.World;

import java.util.Random;

@ElementsSolomonMod.ModElement.Tag
public class RecipesCategories extends ElementsSolomonMod.ModElement {
	/**
	 * Do not remove this constructor
	 */
	public RecipesCategories(ElementsSolomonMod instance) {
		super(instance, 407);
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
	public static final String Juheqi = SolomonMod.MODID + ".juheqi";
}
