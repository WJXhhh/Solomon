
package net.mcreator.solomon.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Set;
import java.util.HashMap;

@ElementsSolomonMod.ModElement.Tag
public class ItemHumo extends ElementsSolomonMod.ModElement {
	@GameRegistry.ObjectHolder("solomon:humo")
	public static final Item block = null;
	public ItemHumo(ElementsSolomonMod instance) {
		super(instance, 357);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("HUMO", 1, 30000, 4f, 6f, 2)) {
			{
				this.attackSpeed = 0f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 1);
				return ret.keySet();
			}
		}.setUnlocalizedName("humo").setRegistryName("humo").setCreativeTab(null));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("solomon:humo", "inventory"));
	}
}
