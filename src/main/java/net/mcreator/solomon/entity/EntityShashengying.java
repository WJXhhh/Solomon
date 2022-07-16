
package net.mcreator.solomon.entity;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import net.mcreator.solomon.procedure.ProcedureShashengyingShiTiSiWangShi;
import net.mcreator.solomon.procedure.ProcedureShashengyingDangShiTiGengXinKeShi;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

@ElementsSolomonMod.ModElement.Tag
public class EntityShashengying extends ElementsSolomonMod.ModElement {
	public static final int ENTITYID = 59;
	public static final int ENTITYID_RANGED = 60;
	public EntityShashengying(ElementsSolomonMod instance) {
		super(instance, 129);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class)
				.id(new ResourceLocation("solomon", "shashengying"), ENTITYID).name("shashengying").tracker(64, 3, true).build());
	}

	private Biome[] allbiomes(net.minecraft.util.registry.RegistryNamespaced<ResourceLocation, Biome> in) {
		Iterator<Biome> itr = in.iterator();
		ArrayList<Biome> ls = new ArrayList<Biome>();
		while (itr.hasNext())
			ls.add(itr.next());
		return ls.toArray(new Biome[ls.size()]);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
			return new RenderLiving(renderManager, new Modelshashengying(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("solomon:textures/shashengying.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityMob {
		public EntityCustom(World world) {
			super(world);
			setSize(1f, 1f);
			experienceValue = 0;
			this.isImmuneToFire = false;
			setNoAI(!false);
		}

		@Override
		public EnumCreatureAttribute getCreatureAttribute() {
			return EnumCreatureAttribute.UNDEFINED;
		}

		@Override
		protected Item getDropItem() {
			return null;
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
		}

		@Override
		protected float getSoundVolume() {
			return 1.0F;
		}

		@Override
		public void onDeath(DamageSource source) {
			super.onDeath(source);
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("world", world);
				ProcedureShashengyingShiTiSiWangShi.executeProcedure($_dependencies);
			}
		}

		@Override
		public void onEntityUpdate() {
			super.onEntityUpdate();
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureShashengyingDangShiTiGengXinKeShi.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3D);
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelshashengying extends ModelBase {
		private final ModelRenderer bone;
		private final ModelRenderer cube_r1;
		private final ModelRenderer bb_main;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		public Modelshashengying() {
			textureWidth = 16;
			textureHeight = 16;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 7.6F, 4.8F);
			setRotationAngle(bone, -0.0873F, 0.0F, -0.3054F);
			bone.cubeList.add(new ModelBox(bone, 0, 0, -7.1625F, -0.6F, -11.875F, 1, 1, 14, 0.0F, false));
			bone.cubeList.add(new ModelBox(bone, 0, 0, 5.9625F, -0.6F, -11.875F, 1, 1, 14, 0.0F, false));
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
			cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 11.275F, -0.6F, -7.1875F, 1, 1, 14, 0.0F, false));
			cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.85F, -0.6F, -7.1875F, 1, 1, 14, 0.0F, false));
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.6F, -6.0F, -0.4F, 1, 6, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -1.2F, -14.6F, -0.8F, 2, 9, 2, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -0.6F, -19.2F, -0.4F, 1, 6, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -1.6F, -17.4F, -1.4F, 3, 1, 3, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -1.6F, -19.4F, -1.4F, 3, 1, 3, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 0.6F, -22.4F, 0.66F, 1, 4, 1, 0.0F, false));
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.5F, -15.2F, 0.4F);
			bb_main.addChild(cube_r2);
			setRotationAngle(cube_r2, 2.6616F, 0.7854F, 0.0F);
			cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.2F, -6.169F, 4.1839F, 0, 2, 0, 0.0F, false));
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.5F, -15.2F, 0.4F);
			bb_main.addChild(cube_r3);
			setRotationAngle(cube_r3, 1.0908F, 0.7854F, 0.0F);
			cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.2F, -3.689F, -7.2561F, 0, 0, 4, 0.0F, false));
			cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.2F, -2.969F, -9.0161F, 0, 0, 8, 0.0F, false));
			cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.2F, -2.969F, -9.2561F, 0, 0, 8, 0.0F, false));
			cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.2F, -2.569F, -10.4561F, 0, 0, 11, 0.0F, false));
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(2.0F, -18.2F, 2.4F);
			bb_main.addChild(cube_r4);
			setRotationAngle(cube_r4, 2.6616F, 0.7854F, 0.0F);
			cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.2F, -6.369F, 3.5439F, 0, 3, 1, 0.0F, false));
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(2.0F, -18.2F, 2.4F);
			bb_main.addChild(cube_r5);
			setRotationAngle(cube_r5, 1.0908F, 0.7854F, 0.0F);
			cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.2F, -3.969F, -8.0561F, 0, 1, 6, 0.0F, false));
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.5F, -15.2F, 0.4F);
			bb_main.addChild(cube_r6);
			setRotationAngle(cube_r6, 1.4399F, 0.7854F, 0.0F);
			cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.2F, -5.969F, -8.7561F, 0, 0, 6, 0.0F, false));
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.5F, -15.2F, 0.4F);
			bb_main.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.7418F, 0.7854F, 0.0F);
			cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.2F, -2.569F, -6.4561F, 0, 0, 7, 0.0F, false));
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, -0.8F, 0.0F);
			bb_main.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, -0.7854F, 0.0F);
			cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -1.4F, -20.6F, -1.7F, 3, 3, 1, 0.0F, false));
			cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -1.4F, -20.6F, 0.3F, 3, 3, 1, 0.0F, false));
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.5F, -0.8F, 0.4F);
			bb_main.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 1.4399F, 0.0F);
			cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 1.2F, -19.4F, -2.4F, 1, 1, 3, 0.0F, false));
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.5F, -0.8F, 0.4F);
			bb_main.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.0F, 0.3054F, 0.0F);
			cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -1.6F, -19.4F, -2.8F, 1, 1, 3, 0.0F, false));
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(0.5F, -0.8F, 0.4F);
			bb_main.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.6981F, 0.7854F, 0.0F);
			cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -0.4F, -16.6F, 8.0F, 1, 1, 7, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			bone.render(f5);
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
