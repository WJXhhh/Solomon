
package net.mcreator.solomon.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.solomon.procedure.ProcedureXialimiechenDangShiTiBeiGongJuJiZhongShi;
import net.mcreator.solomon.procedure.ProcedureGuanhongDangGongJuChuXianZaiWuPinLanShi;
import net.mcreator.solomon.creativetab.TabSolo;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@ElementsSolomonMod.ModElement.Tag
public class ItemXialimiechen extends ElementsSolomonMod.ModElement {
	@GameRegistry.ObjectHolder("solomon:xialimiechen")
	public static final Item block = null;
	public ItemXialimiechen(ElementsSolomonMod instance) {
		super(instance, 117);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("XIALIMIECHEN", 1, 20000, 4f, 3f, 2)) {
			{
				this.attackSpeed = 47f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 1);
				return ret.keySet();
			}

			@Override
			public boolean hitEntity(ItemStack itemstack, EntityLivingBase entity, EntityLivingBase sourceentity) {
				super.hitEntity(itemstack, entity, sourceentity);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", x);
				    $_dependencies.put("y", y);
				    $_dependencies.put("z", z);
				    $_dependencies.put("world", world);
					$_dependencies.put("entity", entity);
					$_dependencies.put("sourceentity", sourceentity);
					$_dependencies.put("itemstack", itemstack);
					ProcedureXialimiechenDangShiTiBeiGongJuJiZhongShi.executeProcedure($_dependencies);
				}
				return true;
			}

			@Override
			public void onUpdate(ItemStack itemstack, World world, Entity entity, int slot, boolean par5) {
				super.onUpdate(itemstack, world, entity, slot, par5);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("itemstack", itemstack);
					ProcedureGuanhongDangGongJuChuXianZaiWuPinLanShi.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("xialimiechen").setRegistryName("xialimiechen").setCreativeTab(TabSolo.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("solomon:xialimiechen", "inventory"));
	}
}
