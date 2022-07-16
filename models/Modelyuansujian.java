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