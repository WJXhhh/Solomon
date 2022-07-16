
package net.mcreator.solomon.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.solomon.creativetab.TabSolo;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.List;

@ElementsSolomonMod.ModElement.Tag
public class ItemMingshenyusou extends ElementsSolomonMod.ModElement {
	@GameRegistry.ObjectHolder("solomon:mingshenyusou")
	public static final Item block = null;
	public ItemMingshenyusou(ElementsSolomonMod instance) {
		super(instance, 92);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("solomon:mingshenyusou", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("mingshenyusou");
			setRegistryName("mingshenyusou");
			setCreativeTab(TabSolo.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("\u7531\u516B\u91CD\u795E\u5B50\u6240\u8D60\u4E88\u7684\u5FA1\u5B88\u3002");
			list.add("\u300C\u60F3\u6211\u7684\u65F6\u5019\u4E5F\u53EF\u4EE5\u62FF\u51FA\u6765\u770B\u770B\u54E6\uFF1F\u300D");
		}
	}
}
