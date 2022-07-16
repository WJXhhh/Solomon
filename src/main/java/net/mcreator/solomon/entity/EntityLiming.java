
package net.mcreator.solomon.entity;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.pathfinding.PathNavigateFlying;
import net.minecraft.item.Item;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.ai.EntityFlyHelper;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBase;
import net.minecraft.block.state.IBlockState;

import net.mcreator.solomon.procedure.ProcedureLimingDangShiTiGengXinKeShi;
import net.mcreator.solomon.procedure.ProcedureLimingChuShiShiTiShengCheng;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Random;
import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

@ElementsSolomonMod.ModElement.Tag
public class EntityLiming extends ElementsSolomonMod.ModElement {
	public static final int ENTITYID = 23;
	public static final int ENTITYID_RANGED = 24;
	public EntityLiming(ElementsSolomonMod instance) {
		super(instance, 111);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("solomon", "liming"), ENTITYID)
				.name("liming").tracker(64, 3, true).build());
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
			return new RenderLiving(renderManager, new Modelliming(), 0.5f) {
				protected ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("solomon:textures/liming.png");
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
			setNoAI(!true);
			this.navigator = new PathNavigateFlying(this, this.world);
			this.moveHelper = new EntityFlyHelper(this);
		}

		@Override
		protected void initEntityAI() {
			super.initEntityAI();
			this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.2, false));
			this.tasks.addTask(2, new EntityAIWander(this, 1));
			this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, false));
			this.tasks.addTask(4, new EntityAILookIdle(this));
			this.tasks.addTask(5, new EntityAISwimming(this));
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
		public void fall(float l, float d) {
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
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				ProcedureLimingChuShiShiTiShengCheng.executeProcedure($_dependencies);
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
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureLimingDangShiTiGengXinKeShi.executeProcedure($_dependencies);
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
			this.getAttributeMap().registerAttribute(SharedMonsterAttributes.FLYING_SPEED);
			this.getEntityAttribute(SharedMonsterAttributes.FLYING_SPEED).setBaseValue(0.3);
		}

		@Override
		public void onUpdate() {
			super.onUpdate();
			this.setNoGravity(true);
		}

		@Override
		protected void updateFallState(double y, boolean onGroundIn, IBlockState state, BlockPos pos) {
		}

		@Override
		public void setNoGravity(boolean ignored) {
			super.setNoGravity(true);
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
					world.spawnParticle(EnumParticleTypes.LAVA, d0, d1, d2, d3, d4, d5);
				}
		}
	}

	// Made with Blockbench 4.1.3
	// Exported for Minecraft version 1.7 - 1.12
	// Paste this class into your mod and generate all required imports
	public static class Modelliming extends ModelBase {
		private final ModelRenderer bb_main;
		private final ModelRenderer cube_r1;
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
		private final ModelRenderer cube_r12;
		public Modelliming() {
			textureWidth = 16;
			textureHeight = 16;
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 4.0F);
			bb_main.addChild(cube_r1);
			setRotationAngle(cube_r1, -3.1416F, 0.0F, 3.1416F);
			cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -9.77F, -14.67F, -2.28F, 3, 2, 5, 0.0F, false));
			cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -18.77F, -14.67F, -2.28F, 3, 2, 5, 0.0F, false));
			cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -28.77F, -14.67F, -2.28F, 3, 2, 5, 0.0F, false));
			cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 7.23F, -14.67F, -2.28F, 3, 2, 5, 0.0F, false));
			cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 17.23F, -14.67F, -2.28F, 3, 2, 5, 0.0F, false));
			cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 26.23F, -14.67F, -2.28F, 3, 2, 5, 0.0F, false));
			cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.09F, -14.92F, -14.56F, 2, 4, 7, 0.0F, false));
			cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -29.97F, -14.74F, 1.82F, 60, 2, 5, 0.0F, false));
			cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.84F, -16.74F, -7.28F, 2, 4, 16, 0.0F, false));
			cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.27F, -14.92F, -7.28F, 5, 4, 19, 0.0F, false));
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-0.3F, 0.0F, 4.0F);
			bb_main.addChild(cube_r2);
			setRotationAngle(cube_r2, -3.1416F, 0.3927F, 3.1416F);
			cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -6.77F, -13.67F, -32.28F, 3, 2, 19, 0.0F, false));
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-0.3F, 0.0F, 4.0F);
			bb_main.addChild(cube_r3);
			setRotationAngle(cube_r3, -3.1416F, -0.3927F, 3.1416F);
			cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 3.23F, -13.67F, -32.28F, 3, 2, 19, 0.0F, false));
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-0.3F, 0.0F, 4.0F);
			bb_main.addChild(cube_r4);
			setRotationAngle(cube_r4, -3.1416F, 0.0F, 3.1416F);
			cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.77F, -13.67F, -32.28F, 3, 2, 19, 0.0F, false));
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 0.0F, 4.0F);
			bb_main.addChild(cube_r5);
			setRotationAngle(cube_r5, -3.1416F, 0.2618F, 3.1416F);
			cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -4.73F, -14.92F, -12.74F, 2, 4, 7, 0.0F, false));
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 0.0F, 4.0F);
			bb_main.addChild(cube_r6);
			setRotationAngle(cube_r6, -3.1416F, -0.2618F, 3.1416F);
			cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 2.55F, -14.92F, -12.74F, 2, 4, 7, 0.0F, false));
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-0.25F, 0.0F, 4.0F);
			bb_main.addChild(cube_r7);
			setRotationAngle(cube_r7, -3.1416F, 0.0F, 3.1416F);
			cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -1.09F, -16.56F, 9.1F, 2, 2, 4, 0.0F, false));
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-0.25F, 0.0F, 4.0F);
			bb_main.addChild(cube_r8);
			setRotationAngle(cube_r8, 2.4871F, 0.0F, 3.1416F);
			cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.73F, -18.835F, -1.82F, 2, 2, 5, 0.0F, false));
			cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -2.91F, -18.835F, -1.82F, 2, 2, 5, 0.0F, false));
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-0.25F, 0.0F, 4.0F);
			bb_main.addChild(cube_r9);
			setRotationAngle(cube_r9, 2.8362F, 0.0F, -3.1416F);
			cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -1.09F, -15.65F, 3.64F, 2, 2, 5, 0.0F, false));
			cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -1.09F, -20.2F, 3.64F, 2, 2, 5, 0.0F, false));
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(-0.5F, 0.0F, 4.0F);
			bb_main.addChild(cube_r10);
			setRotationAngle(cube_r10, 1.9977F, 0.0497F, 2.767F);
			cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -2.91F, -18.38F, -5.46F, 2, 2, 5, 0.0F, false));
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(-0.25F, 0.0F, 4.0F);
			bb_main.addChild(cube_r11);
			setRotationAngle(cube_r11, 1.9167F, -0.2602F, -2.7873F);
			cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -2.91F, -18.38F, -7.28F, 2, 2, 5, 0.0F, false));
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(-0.25F, 0.0F, 4.0F);
			bb_main.addChild(cube_r12);
			setRotationAngle(cube_r12, 2.2253F, 0.0F, 3.1416F);
			cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -1.09F, -20.2F, -5.46F, 2, 2, 9, 0.0F, false));
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
