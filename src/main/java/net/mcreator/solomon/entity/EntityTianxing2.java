
package net.mcreator.solomon.entity;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import net.mcreator.solomon.procedure.ProcedureTianxinghzong21;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Random;
import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

@ElementsSolomonMod.ModElement.Tag
public class EntityTianxing2 extends ElementsSolomonMod.ModElement {
	public static final int ENTITYID = 84;
	public static final int ENTITYID_RANGED = 85;
	public EntityTianxing2(ElementsSolomonMod instance) {
		super(instance, 141);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("solomon", "tianxing_2"), ENTITYID)
				.name("tianxing_2").tracker(64, 3, true).build());
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
			return new RenderLiving(renderManager, new Modeltianxing(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("solomon:textures/tianxing2.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityCreature {
		public EntityCustom(World world) {
			super(world);
			setSize(0.9f, 0.9f);
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
				ProcedureTianxinghzong21.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			if (this.getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0D);
			if (this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(999D);
			if (this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0D);
		}

		public void onLivingUpdate() {
			super.onLivingUpdate();
			int i = (int) this.posX;
			int j = (int) this.posY;
			int k = (int) this.posZ;
			Random random = this.rand;
			if (true)
				for (int l = 0; l < 4; ++l) {
					double d0 = (i + random.nextFloat());
					double d1 = (j + random.nextFloat());
					double d2 = (k + random.nextFloat());
					int i1 = random.nextInt(2) * 2 - 1;
					double d3 = (random.nextFloat() - 0.5D) * 0.5D;
					double d4 = (random.nextFloat() - 0.5D) * 0.5D;
					double d5 = (random.nextFloat() - 0.5D) * 0.5D;
					world.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, d0, d1, d2, d3, d4, d5);
				}
		}
	}

	// Made with Blockbench 4.1.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modeltianxing extends ModelBase {
		private final ModelRenderer bb_main;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		public Modeltianxing() {
			textureWidth = 256;
			textureHeight = 256;
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 48, -14.0F, -13.0F, -7.0F, 28, 10, 14, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 84, 0, -11.5F, -19.5F, -3.5F, 23, 23, 7, 0.0F, false));
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
			cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 72, -11.5F, -19.5F, -3.5F, 23, 23, 7, 0.0F, false));
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r2);
			setRotationAngle(cube_r2, 1.5708F, 0.0F, 0.0F);
			cube_r2.cubeList.add(new ModelBox(cube_r2, 60, 72, -11.5F, -11.5F, 4.5F, 23, 23, 7, 0.0F, false));
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r3);
			setRotationAngle(cube_r3, 1.5708F, 0.0F, 1.5708F);
			cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -22.0F, -5.0F, -7.0F, 28, 10, 14, 0.0F, false));
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 1.5708F, 1.5708F);
			cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 24, -14.0F, -5.0F, -15.0F, 28, 10, 14, 0.0F, false));
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
