// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class jadshield extends ModelBase {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public jadshield() {
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
}