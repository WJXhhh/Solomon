// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class tianyun extends ModelBase {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public tianyun() {
		textureWidth = 16;
		textureHeight = 16;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -59.0F, -4.0F, -6.0F, 52, 4, 26, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -54.0F, -9.0F, 0.0F, 40, 12, 18, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-24.0F, 0.0F, 10.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.1345F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -30.0F, -22.0F, 58.0F, 67, 25, 41, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -35.0F, -17.0F, 52.0F, 79, 17, 49, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-24.0F, 0.0F, 10.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, -3.1416F, 0.6545F, 3.1416F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -48.0F, -17.0F, 51.0F, 79, 17, 49, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -43.0F, -22.0F, 57.0F, 67, 25, 41, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -48.0F, -17.0F, -59.0F, 79, 17, 49, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -43.0F, -22.0F, -53.0F, 67, 25, 41, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-24.0F, 0.0F, 10.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.7418F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -35.0F, -17.0F, -59.0F, 79, 17, 49, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -30.0F, -22.0F, -53.0F, 67, 25, 41, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-24.0F, 0.0F, 10.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 1.4835F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -9.0F, -9.0F, 47.0F, 40, 12, 18, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -14.0F, -4.0F, 41.0F, 52, 4, 26, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-24.0F, 0.0F, 10.0F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.2919F, -0.1898F, 0.4212F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -9.0F, -14.0F, -46.0F, 40, 12, 18, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -14.0F, -9.0F, -52.0F, 52, 4, 26, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-24.0F, 0.0F, 10.0F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.5672F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -2.0F, -9.0F, 20.0F, 40, 12, 18, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -7.0F, -4.0F, 14.0F, 52, 4, 26, 0.0F, false));
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