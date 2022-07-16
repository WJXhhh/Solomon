
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

import net.mcreator.solomon.procedure.ProcedureJadeshieldDangShiTiGengXinKeShi;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

@ElementsSolomonMod.ModElement.Tag
public class EntityJadeshield extends ElementsSolomonMod.ModElement {
	public static final int ENTITYID = 31;
	public static final int ENTITYID_RANGED = 32;
	public EntityJadeshield(ElementsSolomonMod instance) {
		super(instance, 115);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("solomon", "jadeshield"), ENTITYID)
				.name("jadeshield").tracker(64, 3, true).build());
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
			return new RenderLiving(renderManager, new Modeljadshield(), 0f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("solomon:textures/jadshield.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityMob {
		public EntityCustom(World world) {
			super(world);
			setSize(0.1f, 0.1f);
			experienceValue = 0;
			this.isImmuneToFire = false;
			setNoAI(!false);
			enablePersistence();
		}

		@Override
		public EnumCreatureAttribute getCreatureAttribute() {
			return EnumCreatureAttribute.UNDEFINED;
		}

		@Override
		protected boolean canDespawn() {
			return false;
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
		public void onEntityUpdate() {
			super.onEntityUpdate();
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				ProcedureJadeshieldDangShiTiGengXinKeShi.executeProcedure($_dependencies);
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
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(999D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3D);
		}

		@Override
		public boolean canBeCollidedWith() {
			return false;
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modeljadshield extends ModelBase {
		private final ModelRenderer bb_main;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		public Modeljadshield() {
			textureWidth = 128;
			textureHeight = 128;
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.cubeList.add(new ModelBox(bb_main, 24, 27, -3.7F, -18.8F, -7.2F, 7, 13, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 27, -3.7F, -18.8F, 6.6F, 7, 13, 1, 0.0F, false));
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -2.8F, 0.0F);
			bb_main.addChild(cube_r1);
			setRotationAngle(cube_r1, -3.1416F, 0.7854F, 3.1416F);
			cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 0, -3.0F, -16.0F, -7.38F, 6, 13, 1, 0.0F, false));
			cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 27, -3.0F, -16.0F, 6.78F, 6, 13, 1, 0.0F, false));
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -2.8F, 0.0F);
			bb_main.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.7854F, 0.0F);
			cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 54, -3.0F, -16.0F, 6.78F, 6, 13, 1, 0.0F, false));
			cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 54, -3.0F, -16.0F, -7.38F, 6, 13, 1, 0.0F, false));
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -2.8F, 0.0F);
			bb_main.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
			cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -3.7F, -16.0F, -7.2F, 7, 13, 1, 0.0F, false));
			cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 0, -3.7F, -16.0F, 6.6F, 7, 13, 1, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
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
