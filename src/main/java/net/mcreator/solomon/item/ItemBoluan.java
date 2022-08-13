
package net.mcreator.solomon.item;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.solomon.procedure.ProcedureGuanhongDangGongJuChuXianZaiWuPinLanShi;
import net.mcreator.solomon.procedure.ProcedureGuanhonDangHuoZhaoDeShiTiBeiGaiWuPinJiZhong;
import net.mcreator.solomon.creativetab.TabSolo;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.Multimap;

import javax.annotation.Nullable;

@ElementsSolomonMod.ModElement.Tag
public class ItemBoluan extends ElementsSolomonMod.ModElement {
	@GameRegistry.ObjectHolder("solomon:boluan")
	public static final Item block = null;
	public ItemBoluan(ElementsSolomonMod instance) {
		super(instance, 244);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSword(EnumHelper.addToolMaterial("BOLUAN", 1, 30000, 4f, 7f, 2)) {
			@Override
			public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot slot) {
				Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(slot);
				if (slot == EntityEquipmentSlot.MAINHAND) {
					multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(),
							new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double) this.getAttackDamage(), 0));
					multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(),
							new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -3, 0));
				}
				return multimap;
			}

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("sword", 1);
				return ret.keySet();
			}

			@SideOnly(Side.CLIENT)
			public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
			{
				super.addInformation(stack,worldIn,tooltip,flagIn);
				tooltip.add("\u00A7e\u2605\u2605\u2605\u2605\u2605");
				tooltip.add(String.format(I18n.format("tooltip.solodamage")+"%s",new StringBuilder((stack.getTagCompound().getDouble("sololevel"))*5+String.valueOf(((AttributeModifier)(stack.getItem().getAttributeModifiers(EntityEquipmentSlot.MAINHAND,stack).get(SharedMonsterAttributes.ATTACK_DAMAGE.getName()))).getAmount())).append(ChatFormatting.GREEN).toString()));
				tooltip.add(String.format(I18n.format("tooltip.sololevel")+"%s",new StringBuilder((int)stack.getTagCompound().getDouble("sololevel")).append(ChatFormatting.GREEN).toString()));}

			@Override
			public boolean hitEntity(ItemStack itemstack, EntityLivingBase entity, EntityLivingBase sourceentity) {
				super.hitEntity(itemstack, entity, sourceentity);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("sourceentity", sourceentity);
					$_dependencies.put("itemstack", itemstack);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureGuanhonDangHuoZhaoDeShiTiBeiGaiWuPinJiZhong.executeProcedure($_dependencies);
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
		}.setUnlocalizedName("boluan").setRegistryName("boluan").setCreativeTab(TabSolo.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("solomon:boluan", "inventory"));
	}
}
