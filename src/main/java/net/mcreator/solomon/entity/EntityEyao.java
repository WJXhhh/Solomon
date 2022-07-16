
package net.mcreator.solomon.entity;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;

import net.mcreator.solomon.procedure.ProcedureEyaoDangShiTiGengXinKeShi;
import net.mcreator.solomon.procedure.ProcedureEyaoChuShiShiTiShengCheng;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Random;
import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

@ElementsSolomonMod.ModElement.Tag
public class EntityEyao extends ElementsSolomonMod.ModElement {
	public static final int ENTITYID = 63;
	public static final int ENTITYID_RANGED = 64;
	public EntityEyao(ElementsSolomonMod instance) {
		super(instance, 131);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("solomon", "eyao"), ENTITYID)
				.name("eyao").tracker(64, 3, true).build());
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
			return new RenderLiving(renderManager, new Modeleyao(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("solomon:textures/eyao.png");
				}
			};
		});
	}
	public static class EntityCustom extends EntityMob {
		public EntityCustom(World world) {
			super(world);
			setSize(0.6f, 1.8f);
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
		public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingdata) {
			IEntityLivingData retval = super.onInitialSpawn(difficulty, livingdata);
			int x = (int) this.posX;
			int y = (int) this.posY;
			int z = (int) this.posZ;
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureEyaoChuShiShiTiShengCheng.executeProcedure($_dependencies);
			}
			return retval;
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
				ProcedureEyaoDangShiTiGengXinKeShi.executeProcedure($_dependencies);
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
					world.spawnParticle(EnumParticleTypes.CRIT_MAGIC, d0, d1, d2, d3, d4, d5);
				}
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modeleyao extends ModelBase {
		private final ModelRenderer bb_main;
		public Modeleyao() {
			textureWidth = 128;
			textureHeight = 128;
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -23.0F, -8.0F, -0.5F, 46, 1, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 4, -15.0F, -9.0F, -0.5F, 30, 1, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 8, -13.0F, -10.0F, -0.5F, 26, 1, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 12, -10.0F, -11.0F, -0.5F, 20, 1, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 16, -7.0F, -12.0F, -0.5F, 14, 1, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 14, 18, -3.0F, -13.0F, -0.5F, 6, 1, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 6, -13.0F, -6.0F, -0.5F, 26, 1, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 10, -10.0F, -5.0F, -0.5F, 20, 1, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 14, -7.0F, -4.0F, -0.5F, 14, 1, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 18, -3.0F, -3.0F, -0.5F, 6, 1, 1, 0.0F, false));
			bb_main.cubeList.add(new ModelBox(bb_main, 0, 2, -15.0F, -7.0F, -0.5F, 30, 1, 1, 0.0F, false));
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
