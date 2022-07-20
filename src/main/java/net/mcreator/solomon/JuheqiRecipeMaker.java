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

import com.google.common.collect.Lists;
import mezz.jei.api.IJeiHelpers;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@ElementsSolomonMod.ModElement.Tag
public class JuheqiRecipeMaker extends ElementsSolomonMod.ModElement {

	private static SolomonCustomMachineRecipes itemHelper;

	static ElementsSolomonMod instance;

	public static List<JuheqiRecipe> getRecipes(IJeiHelpers helpers){
		List<JuheqiRecipe> jeiRecipes = Lists.newArrayList(new JuheqiRecipe(instance,l1,new ItemStack(itemHelper.GodKey)),new JuheqiRecipe(instance,l2,new ItemStack(itemHelper.Huangs)),new JuheqiRecipe(instance,l3,new ItemStack(itemHelper.LeiYin)), new JuheqiRecipe(instance,l4,new ItemStack(itemHelper.BingYin)), new JuheqiRecipe(instance,l5,new ItemStack(itemHelper.Jiuchan)),new JuheqiRecipe(instance,l6,new ItemStack(itemHelper.Yuanshi,16)), new JuheqiRecipe(instance,l7,new ItemStack(itemHelper.Yanyin)) );
		return jeiRecipes;

	}

	private static List<ItemStack> l1 = Lists.newArrayList(new ItemStack(itemHelper.Deamincan,1),new ItemStack(Items.DIAMOND,1));
	private static List<ItemStack> l2 = Lists.newArrayList(new ItemStack(itemHelper.Deamincan,1),new ItemStack(Items.IRON_INGOT));
	private static List<ItemStack> l3 = Lists.newArrayList(new ItemStack(itemHelper.MingLeiPian,8),new ItemStack(Items.DIAMOND,1));



	private static List<ItemStack> l4 = Lists.newArrayList(new ItemStack(Items.SNOWBALL,8),new ItemStack(Items.DIAMOND));
	private static List<ItemStack> l5 = Lists.newArrayList(new ItemStack(itemHelper.Yuanshi,4),new ItemStack(Items.IRON_INGOT));
	private static List<ItemStack> l6 = Lists.newArrayList(new ItemStack(itemHelper.Ningju,1), new ItemStack(Items.IRON_INGOT));
	private static List<ItemStack> l7 = Lists.newArrayList(new ItemStack(Blocks.COBBLESTONE,4),new ItemStack(Items.DIAMOND));



	/**
	 * Do not remove this constructor
	 */
	public JuheqiRecipeMaker(ElementsSolomonMod instance) {
		super(instance, 412);
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
}
