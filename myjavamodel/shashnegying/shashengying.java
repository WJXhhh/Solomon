// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class shashengying extends ModelBase {
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

	public shashengying() {
		textureWidth = 16;
		textureHeight = 16;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -17.0F, 12.0F);
		setRotationAngle(bone, -0.0873F, 0.0F, -0.3054F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -17.4063F, -1.0F, -29.6875F, 2, 2, 35, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 15.4063F, -1.0F, -29.6875F, 2, 2, 35, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 28.6875F, -1.0F, -17.9688F, 2, 2, 35, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -4.125F, -1.0F, -17.9688F, 2, 2, 35, 0.0F, false));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -1.0F, -16.0F, -1.0F, 2, 16, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -2.0F, -37.0F, -2.0F, 4, 23, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -1.0F, -48.0F, -1.0F, 2, 15, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -3.5F, -44.0F, -3.5F, 7, 3, 7, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -3.5F, -49.0F, -3.5F, 7, 3, 7, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 2.0F, -57.0F, 1.65F, 2, 11, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.25F, -38.0F, 1.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 2.6616F, 0.7854F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.5F, -14.4224F, 10.4596F, 1, 4, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.5F, -16.4224F, 8.8596F, 1, 8, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.25F, -38.0F, 1.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.0908F, 0.7854F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -10.2224F, -18.1404F, 1, 1, 11, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -8.4224F, -22.5404F, 1, 1, 21, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -8.4224F, -23.1404F, 1, 1, 21, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -9.4224F, -20.1404F, 1, 2, 16, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -7.4224F, -26.1404F, 1, 1, 27, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.25F, -38.0F, 1.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 1.4399F, 0.7854F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, -15.9224F, -21.8904F, 1, 1, 14, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.25F, -38.0F, 1.0F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7418F, 0.7854F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.5F, -7.4224F, -16.1404F, 1, 1, 17, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -2.0F, 0.0F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.7854F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -3.0F, -51.0F, -4.25F, 7, 7, 3, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -3.0F, -51.0F, 0.75F, 7, 7, 3, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.25F, -2.0F, 1.0F);
		bb_main.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 1.4399F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 2.5F, -49.0F, -6.0F, 3, 3, 7, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.25F, -2.0F, 1.0F);
		bb_main.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.3054F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -4.5F, -49.0F, -7.0F, 3, 3, 7, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.25F, -2.0F, 1.0F);
		bb_main.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.6981F, 0.7854F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -1.5F, -42.0F, 20.0F, 3, 3, 17, 0.0F, false));
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
}