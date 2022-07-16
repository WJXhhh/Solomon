
package net.mcreator.solomon.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.solomon.item.ItemDeamincan;
import net.mcreator.solomon.ElementsSolomonMod;

@ElementsSolomonMod.ModElement.Tag
public class TabSolo extends ElementsSolomonMod.ModElement {
	public TabSolo(ElementsSolomonMod instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabsolo") {
			
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemDeamincan.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		Long timeLong = System.currentTimeMillis();
		if(timeLong >= 1657677600000l && timeLong < 1659427200000l) {
		tab.setBackgroundImageName("solo2.81.png");
		}else if(timeLong >= 1659427200000l && timeLong < 1661241600000l){
			tab.setBackgroundImageName("solo2.82.png");
		}
		else {
			tab.setBackgroundImageName("solo.png");
		}
	}
	public static CreativeTabs tab;
}
