
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
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.solomon.procedure.ProcedureLittleknifeDangYouJianDianJiKongQiShi;
import net.mcreator.solomon.creativetab.TabSolo;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

import com.google.common.collect.Multimap;

@ElementsSolomonMod.ModElement.Tag
public class ItemLittleknife extends ElementsSolomonMod.ModElement {
	@GameRegistry.ObjectHolder("solomon:littleknife")
	public static final Item block = null;
	public ItemLittleknife(ElementsSolomonMod instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("solomon:littleknife", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(20);
			maxStackSize = 1;
			setUnlocalizedName("littleknife");
			setRegistryName("littleknife");
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
		public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot slot) {
			Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(slot);
			if (slot == EntityEquipmentSlot.MAINHAND) {
				multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(),
						new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Item modifier", (double) 1, 0));
				multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Item modifier", -2.4, 0));
			}
			return multimap;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("\u5C06\u5272\u4E0B\u6765\u7684\u8840\u653E\u5165\u74F6\u5B50");
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
				ProcedureLittleknifeDangYouJianDianJiKongQiShi.executeProcedure($_dependencies);
			}
			return ar;
		}
	}
}
