package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EntityItem;

import net.mcreator.solomon.item.ItemBelphcan;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureBelphenShiTiSiWangShi extends ElementsSolomonMod.ModElement {
	public ProcedureBelphenShiTiSiWangShi(ElementsSolomonMod instance) {
		super(instance, 306);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BelphenShiTiSiWangShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BelphenShiTiSiWangShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BelphenShiTiSiWangShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BelphenShiTiSiWangShi!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemBelphcan.block, (int) (1)));
			entityToSpawn.setPickupDelay(10);
			world.spawnEntity(entityToSpawn);
		}
	}
}
