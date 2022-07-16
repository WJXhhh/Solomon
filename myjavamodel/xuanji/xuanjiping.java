// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class xuanjiping extends ModelBase {
	private final ModelRenderer bb_main;

	public xuanjiping() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -26.26F, -30.885F, -3.2175F, 52, 3, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 56, 83, 26.03F, -31.885F, -3.2175F, 4, 4, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 40, 79, -29.74F, -31.885F, -3.2175F, 4, 4, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 50, 25, 23.465F, -35.175F, -5.3625F, 13, 3, 11, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 50, 11, -36.595F, -35.175F, -5.3625F, 13, 3, 11, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 64, 65, -6.2075F, -33.03F, -1.0725F, 13, 3, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 72, 75, 26.03F, -23.305F, -3.2175F, 4, 4, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 24, 75, -29.74F, -23.305F, -3.2175F, 4, 4, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 64, 52, 23.175F, -8.29F, -3.2175F, 9, 4, 9, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 64, 39, -32.595F, -8.29F, -3.2175F, 9, 4, 9, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 75, -29.74F, -6.145F, -2.145F, 4, 4, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 56, 71, 26.03F, -6.145F, -2.145F, 4, 4, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 16, 75, -29.8125F, -19.015F, -1.0725F, 3, 4, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 61, 39, 26.6725F, -19.015F, -1.0725F, 3, 4, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 11, -11.275F, -29.0F, -1.0725F, 22, 29, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 32, 43, -25.5125F, -29.0F, -1.0725F, 13, 29, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 43, 12.025F, -29.0F, -1.0725F, 13, 29, 3, 0.0F, false));
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