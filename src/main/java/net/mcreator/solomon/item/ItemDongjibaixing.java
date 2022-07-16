
package net.mcreator.solomon.item;

import org.lwjgl.opengl.GL11;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.init.Items;
import net.minecraft.init.Enchantments;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import net.mcreator.solomon.procedure.ProcedureDongjibaixingDangZiDanJiZhongShengCunShiTiShi;
import net.mcreator.solomon.procedure.ProcedureDongjibaixingDangYuanChengWuPinShiYongShi;
import net.mcreator.solomon.creativetab.TabSolo;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.Multimap;

@ElementsSolomonMod.ModElement.Tag
public class ItemDongjibaixing extends ElementsSolomonMod.ModElement {
	@GameRegistry.ObjectHolder("solomon:dongjibaixing")
	public static final Item block = null;
	public static final int ENTITYID = 16;
	public ItemDongjibaixing(ElementsSolomonMod instance) {
		super(instance, 123);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new RangedItem());
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityArrowCustom.class)
				.id(new ResourceLocation("solomon", "entitybulletdongjibaixing"), ENTITYID).name("entitybulletdongjibaixing").tracker(64, 1, true)
				.build());
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("solomon:dongjibaixing", "inventory"));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityArrowCustom.class, renderManager -> {
			return new RenderCustom(renderManager);
		});
	}
	public static class RangedItem extends Item {
		public RangedItem() {
			super();
			setMaxDamage(10000);
			setFull3D();
			setUnlocalizedName("dongjibaixing");
			setRegistryName("dongjibaixing");
			maxStackSize = 1;
			setCreativeTab(TabSolo.tab);
		}

		@Override
		public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot slot) {
			Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(slot);
			if (slot == EntityEquipmentSlot.MAINHAND) {
				multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(),
						new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Ranged item modifier", (double) 6, 0));
				multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(),
						new AttributeModifier(ATTACK_SPEED_MODIFIER, "Ranged item modifier", -2.4, 0));
			}
			return multimap;
		}

		@Override
		public void onPlayerStoppedUsing(ItemStack itemstack, World world, EntityLivingBase entityLivingBase, int timeLeft) {
			if (!world.isRemote && entityLivingBase instanceof EntityPlayerMP) {
				EntityPlayerMP entity = (EntityPlayerMP) entityLivingBase;
				int slotID = -1;
				for (int i = 0; i < entity.inventory.mainInventory.size(); i++) {
					ItemStack stack = entity.inventory.mainInventory.get(i);
					if (stack != null && stack.getItem() == new ItemStack(Items.ARROW, (int) (1)).getItem()
							&& stack.getMetadata() == new ItemStack(Items.ARROW, (int) (1)).getMetadata()) {
						slotID = i;
						break;
					}
				}
				if (entity.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantments.INFINITY, itemstack) > 0
						|| slotID != -1) {
					float power = 2f;
					EntityArrowCustom entityarrow = new EntityArrowCustom(world, entity);
					entityarrow.shoot(entity.getLookVec().x, entity.getLookVec().y, entity.getLookVec().z, power * 2, 0);
					entityarrow.setSilent(true);
					entityarrow.setIsCritical(false);
					entityarrow.setDamage(5);
					entityarrow.setKnockbackStrength(0);
					itemstack.damageItem(1, entity);
					int x = (int) entity.posX;
					int y = (int) entity.posY;
					int z = (int) entity.posZ;
					world.playSound((EntityPlayer) null, (double) x, (double) y, (double) z,
							(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
									.getObject(new ResourceLocation(("entity.arrow.shoot"))),
							SoundCategory.NEUTRAL, 1, 1f / (itemRand.nextFloat() * 0.5f + 1f) + (power / 2));
					if (entity.capabilities.isCreativeMode) {
						entityarrow.pickupStatus = EntityArrow.PickupStatus.CREATIVE_ONLY;
					} else {
						if (new ItemStack(Items.ARROW, (int) (1)).isItemStackDamageable()) {
							ItemStack stack = entity.inventory.getStackInSlot(slotID);
							if (stack.attemptDamageItem(1, itemRand, entity)) {
								stack.shrink(1);
								stack.setItemDamage(0);
							}
						} else {
							entity.inventory.clearMatchingItems(new ItemStack(Items.ARROW, (int) (1)).getItem(), -1, 1, null);
						}
					}
					if (!world.isRemote)
						world.spawnEntity(entityarrow);
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
				}
			}
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand) {
			entity.setActiveHand(hand);
			return new ActionResult(EnumActionResult.SUCCESS, entity.getHeldItem(hand));
		}

		@Override
		public EnumAction getItemUseAction(ItemStack itemstack) {
			return EnumAction.BOW;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 72000;
		}
	}

	public static class EntityArrowCustom extends EntityTippedArrow {
		public EntityArrowCustom(World a) {
			super(a);
		}

		public EntityArrowCustom(World worldIn, double x, double y, double z) {
			super(worldIn, x, y, z);
		}

		public EntityArrowCustom(World worldIn, EntityLivingBase shooter) {
			super(worldIn, shooter);
		}

		@Override
		protected void arrowHit(EntityLivingBase entity) {
			super.arrowHit(entity);
			EntityLivingBase sourceentity = (EntityLivingBase)this.shootingEntity;
			entity.setArrowCountInEntity(entity.getArrowCountInEntity() - 1);
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			World world = this.world;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				$_dependencies.put("entity", entity);
				$_dependencies.put("sourceentity", sourceentity);
				ProcedureDongjibaixingDangZiDanJiZhongShengCunShiTiShi.executeProcedure($_dependencies);
			}
		}

		@Override
		public void onUpdate() {
			super.onUpdate();
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			World world = this.world;
			Entity entity = (Entity) shootingEntity;
			if (this.inGround) {
				this.world.removeEntity(this);
			}
		}
	}

	public static class RenderCustom extends Render {
		private static final ResourceLocation texture = new ResourceLocation("solomon:textures/yuansujian2.png");
		public RenderCustom(RenderManager renderManager) {
			super(renderManager);
			shadowSize = 0.1f;
		}

		@Override
		public void doRender(Entity bullet, double d, double d1, double d2, float f, float f1) {
			bindEntityTexture(bullet);
			GL11.glPushMatrix();
			GL11.glTranslatef((float) d, (float) d1, (float) d2);
			GL11.glRotatef(f, 0, 1, 0);
			GL11.glRotatef(90f - bullet.prevRotationPitch - (bullet.rotationPitch - bullet.prevRotationPitch) * f1, 1, 0, 0);
			ModelBase model = new Modelyuansujian();
			model.render(bullet, 0, 0, 0, 0, 0, 0.0625f);
			GL11.glPopMatrix();
		}

		@Override
		protected ResourceLocation getEntityTexture(Entity entity) {
			return texture;
		}
	}

	// Made with Blockbench 4.1.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelyuansujian extends ModelBase {
		private final ModelRenderer head;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer bb_main;
		private final ModelRenderer bb_main_r1;
		private final ModelRenderer bb_main_r2;
		private final ModelRenderer bb_main_r3;
		private final ModelRenderer bb_main_r4;
		private final ModelRenderer cube_r4;
		public Modelyuansujian() {
			textureWidth = 16;
			textureHeight = 16;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.5F, -4.0F, -9.0F);
			head.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.5F, -4.0F, -9.0F);
			head.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
			cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -15.0F, -3.25F, 1, 4, 1, 0.0F, false));
			cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -15.0F, -3.25F, 1, 4, 1, 0.0F, false));
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main_r1 = new ModelRenderer(this);
			bb_main_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(bb_main_r1);
			setRotationAngle(bb_main_r1, 1.5708F, 0.0F, 0.0F);
			bb_main_r1.cubeList.add(new ModelBox(bb_main_r1, 0, 0, -1.5F, -1.5F, 0.75F, 3, 3, 1, 0.0F, false));
			bb_main_r2 = new ModelRenderer(this);
			bb_main_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(bb_main_r2);
			setRotationAngle(bb_main_r2, -1.5708F, 0.0F, -0.7854F);
			bb_main_r2.cubeList.add(new ModelBox(bb_main_r2, 0, 0, 11.5F, -0.5F, -11.5F, 1, 1, 4, 0.0F, false));
			bb_main_r3 = new ModelRenderer(this);
			bb_main_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(bb_main_r3);
			setRotationAngle(bb_main_r3, -1.5708F, 0.0F, 0.7854F);
			bb_main_r3.cubeList.add(new ModelBox(bb_main_r3, 0, 0, -12.5F, -0.5F, -11.5F, 1, 1, 4, 0.0F, false));
			bb_main_r4 = new ModelRenderer(this);
			bb_main_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(bb_main_r4);
			setRotationAngle(bb_main_r4, -1.5708F, 0.0F, 0.0F);
			bb_main_r4.cubeList.add(new ModelBox(bb_main_r4, 0, 0, -0.5F, -0.5F, -18.0F, 1, 1, 17, 0.0F, false));
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.5F, -4.0F, -9.0F);
			bb_main.addChild(cube_r4);
			setRotationAngle(cube_r4, -2.3562F, 0.0F, 0.0F);
			cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.0F, -1.75F, -16.0F, 1, 4, 1, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			head.render(f5);
			bb_main.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		}
	}
}
