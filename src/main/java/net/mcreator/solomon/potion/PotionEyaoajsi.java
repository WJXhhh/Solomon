
package net.mcreator.solomon.potion;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.Minecraft;

import net.mcreator.solomon.ElementsSolomonMod;

@ElementsSolomonMod.ModElement.Tag
public class PotionEyaoajsi extends ElementsSolomonMod.ModElement {
	@GameRegistry.ObjectHolder("solomon:eyaoajsi")
	public static final Potion potion = null;
	public PotionEyaoajsi(ElementsSolomonMod instance) {
		super(instance, 355);
	}

	@Override
	public void initElements() {
		elements.potions.add(() -> new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		private final ResourceLocation potionIcon;
		public PotionCustom() {
			super(false, -6723841);
			setRegistryName("eyaoajsi");
			setPotionName("effect.eyaoajsi");
			potionIcon = new ResourceLocation("solomon:textures/mob_effect/eyaoajsi.png");
		}

		@Override
		public boolean isInstant() {
			return false;
		}

		@Override
		public boolean shouldRenderInvText(PotionEffect effect) {
			return true;
		}

		@Override
		public boolean shouldRenderHUD(PotionEffect effect) {
			return true;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void renderInventoryEffect(int x, int y, PotionEffect effect, Minecraft mc) {
			if (mc.currentScreen != null) {
				mc.getTextureManager().bindTexture(potionIcon);
				Gui.drawModalRectWithCustomSizedTexture(x + 6, y + 7, 0, 0, 18, 18, 18, 18);
			}
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void renderHUDEffect(int x, int y, PotionEffect effect, Minecraft mc, float alpha) {
			mc.getTextureManager().bindTexture(potionIcon);
			Gui.drawModalRectWithCustomSizedTexture(x + 3, y + 3, 0, 0, 18, 18, 18, 18);
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}
	}
}
