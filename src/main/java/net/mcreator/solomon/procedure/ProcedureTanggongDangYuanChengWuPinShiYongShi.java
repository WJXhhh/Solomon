package net.mcreator.solomon.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureTanggongDangYuanChengWuPinShiYongShi extends ElementsSolomonMod.ModElement {
	public ProcedureTanggongDangYuanChengWuPinShiYongShi(ElementsSolomonMod instance) {
		super(instance, 223);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TanggongDangYuanChengWuPinShiYongShi!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure TanggongDangYuanChengWuPinShiYongShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure TanggongDangYuanChengWuPinShiYongShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure TanggongDangYuanChengWuPinShiYongShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure TanggongDangYuanChengWuPinShiYongShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TanggongDangYuanChengWuPinShiYongShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getDouble("sololevel") : -1) < 1)) {
			{
				ItemStack _stack = (itemstack);
				if (!_stack.hasTagCompound())
					_stack.setTagCompound(new NBTTagCompound());
				_stack.getTagCompound().setDouble("sololevel", 1);
			}
		}
		entity.getEntityData().setDouble("gongdeshanghai",
				(((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getDouble("sololevel") : -1) * 2));
		if ((((entity.getEntityData().getString("vision"))).equals("vw"))) {
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.WATER_BUBBLE, x, y, z, (int) 5, 1, 1, 1, 1, new int[0]);
		}
		if ((((entity.getEntityData().getString("vision"))).equals("vf"))) {
			if (world instanceof WorldServer)
				((WorldServer) world).spawnParticle(EnumParticleTypes.DRIP_LAVA, x, y, z, (int) 5, 1, 1, 1, 1, new int[0]);
		}
	}
}
