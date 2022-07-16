// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modeldaorenp extends ModelBase {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public Modeldaorenp() {
		textureWidth = 16;
		textureHeight = 16;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -2.0F, -63.16F, 5.88F, 2, 71, 14, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, -36.96F, -13.9267F, 2, 35, 18, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, -62.24F, -21.56F, 2, 74, 14, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.5708F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -2.0F, -21.0248F, -7.9702F, 2, 41, 14, 0.0F, false));
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