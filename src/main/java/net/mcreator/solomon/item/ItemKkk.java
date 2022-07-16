
package net.mcreator.solomon.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.solomon.procedure.ProcedureDongjibaixingDangYuanChengWuPinShiYongShi;
import net.mcreator.solomon.creativetab.TabSolo;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@ElementsSolomonMod.ModElement.Tag
public class ItemKkk extends ElementsSolomonMod.ModElement {
	@GameRegistry.ObjectHolder("solomon:kkk")
	public static final Item block = null;
	public ItemKkk(ElementsSolomonMod instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("KKK", 1, 100, 4f, 0f, 2)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 1);
				return ret.keySet();
			}

			@Override
			public EnumActionResult onItemUse(EntityPlayer entity, World world, BlockPos pos, EnumHand hand, EnumFacing direction, float hitX,
					float hitY, float hitZ) {
				EnumActionResult retval = super.onItemUse(entity, world, pos, hand, direction, hitX, hitY, hitZ);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				ItemStack itemstack = entity.getHeldItem(hand);
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("itemstack", itemstack);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureDongjibaixingDangYuanChengWuPinShiYongShi.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setUnlocalizedName("kkk").setRegistryName("kkk").setCreativeTab(TabSolo.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("solomon:kkk", "inventory"));
	}
}
