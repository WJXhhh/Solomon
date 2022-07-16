// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class liming extends ModelBase {
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

	public liming() {
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
}