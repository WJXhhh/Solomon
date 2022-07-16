// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class tianxing extends ModelBase {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public tianxing() {
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
}