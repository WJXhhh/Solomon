// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class wuxiang extends ModelBase {
	private final ModelRenderer bone;

	public wuxiang() {
		textureWidth = 16;
		textureHeight = 16;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.5F, 24.0F, -17.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.0F, -88.0F, 0.0F, 4, 88, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.0F, -100.0F, 4.0F, 4, 100, 31, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}