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

import net.mcreator.solomon.item.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.World;

import java.util.Random;

@ElementsSolomonMod.ModElement.Tag
public class SolomonCustomMachineRecipes extends ElementsSolomonMod.ModElement {
	/**
	 * Do not remove this constructor
	 */
	public static Item Deamincan = new ItemDeamincan.ItemCustom();
	public static Item GodKey = new ItemGodkey.ItemCustom();
	public static Item Huangs = new ItemHuangs.ItemCustom();
	public static Item MingLeiPian = new ItemMingleiduanpain.ItemCustom();
	public static Item LeiYin = new ItemLeiyin.ItemCustom();
	public static Item BingYin = new ItemBignzhiyin.ItemCustom();
	public static Item Yuanshi = new ItemYuanshi.ItemCustom();
	public static Item Jiuchan = new ItemJiuchanzhiyuan.ItemCustom();
	public static Item Ningju = new ItemNingjucanhun.ItemCustom();
	public static Item Yanyin = new ItemYanzhiyin.ItemCustom();


	public SolomonCustomMachineRecipes(ElementsSolomonMod instance) {
		super(instance, 409);
	}

	public static class solomon_JuheqiRecipes{
		private static final SolomonCustomMachineRecipes.solomon_JuheqiRecipes INSTANCE = new SolomonCustomMachineRecipes.solomon_JuheqiRecipes();

		public static SolomonCustomMachineRecipes.solomon_JuheqiRecipes getInstance(){
			return INSTANCE;
		}

		public ItemStack getJuheqiResult(ItemStack input1,ItemStack input2){
			if (input1.getItem() == Deamincan && input2.getItem() == Items.DIAMOND){
				return new ItemStack(GodKey,1);

			}
			else if (input1.getItem() == Deamincan&&input2.getItem() == Items.IRON_INGOT){
				return new ItemStack(Huangs,1);
			}
			else if (input1.getItem() == MingLeiPian&& input1.getCount() >= 8&&input2.getItem() == Items.DIAMOND){
				return new ItemStack(LeiYin,1);
			}
			else if(input1.getItem() == Items.SNOWBALL&& input1.getCount() >= 8&&input2.getItem() == Items.DIAMOND){
				return new ItemStack(BingYin,1);
			}
			else if(input1.getItem() == Yuanshi&& input1.getCount() >= 4&&input2.getItem() == Items.IRON_INGOT){
				return new ItemStack(Jiuchan,1);
			}
			else if(input1.getItem() == Ningju&&input2.getItem() == Items.IRON_INGOT){
				return new ItemStack(Yuanshi,16);
			}
			else if (input1.getItem() == Item.getItemFromBlock(Blocks.COBBLESTONE)&& input1.getCount() >= 4&&input2.getItem() == Items.DIAMOND){
				return new ItemStack(Yanyin,1);
			}
			return ItemStack.EMPTY;
		}
	}

}
