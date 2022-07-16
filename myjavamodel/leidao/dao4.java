// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class dao4 extends ModelBase {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public dao4() {
		textureWidth = 16;
		textureHeight = 16;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0313F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.5708F, -0.0436F, 1.5708F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.9665F, -54.8F, 0.0F, 2, 37, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.2212F, -49.8F, 0.0F, 2, 32, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -3.33F, -18.02F, -2.67F, 7, 2, 7, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, -16.0F, 0.0F, 2, 16, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.0313F, 0.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.5708F, 0.1745F, 1.5708F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 10.435F, -53.8145F, 0.0F, 2, 6, 2, 0.0F, false));
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