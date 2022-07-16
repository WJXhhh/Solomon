
package net.mcreator.solomon.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.solomon.procedure.ProcedureBelpwenxianDangYouJianDianJiKongQiShi;
import net.mcreator.solomon.creativetab.TabSolo;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@ElementsSolomonMod.ModElement.Tag
public class ItemBelpwenxian extends ElementsSolomonMod.ModElement {
	@GameRegistry.ObjectHolder("solomon:belpwenxian")
	public static final Item block = null;
	public ItemBelpwenxian(ElementsSolomonMod instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("solomon:belpwenxian", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 1;
			setUnlocalizedName("belpwenxian");
			setRegistryName("belpwenxian");
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
			list.add("\u00A77\u6587\u732E-\u8BB0\u8F7D\u7740\u5173\u4E8E\u8D1D\u5C14\u82AC\u683C\u7684\u4E1C\u897F\u3002");
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureBelpwenxianDangYouJianDianJiKongQiShi.executeProcedure($_dependencies);
			}
			return ar;
		}
	}
}
