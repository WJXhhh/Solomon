// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class yanqiang extends ModelBase {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public yanqiang() {
		textureWidth = 16;
		textureHeight = 16;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -1.0F, -23.0F, 0.0F, 1, 23, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -1.0F, -10.0F, -1.0F, 1, 7, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.9599F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -3.8828F, -4.2813F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3054F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 2.0F, -9.6875F, 0.0F, 1, 5, 1, 0.0F, false));
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