// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class Modeltouming extends ModelBase {

	public Modeltouming() {
		textureWidth = 16;
		textureHeight = 16;

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

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