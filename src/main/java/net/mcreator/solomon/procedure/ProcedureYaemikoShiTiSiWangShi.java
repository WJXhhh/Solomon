package net.mcreator.solomon.procedure;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EntityItem;

import net.mcreator.solomon.item.ItemMingshenyusou;
import net.mcreator.solomon.SolomonModVariables;
import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureYaemikoShiTiSiWangShi extends ElementsSolomonMod.ModElement {
	public ProcedureYaemikoShiTiSiWangShi(ElementsSolomonMod instance) {
		super(instance, 349);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure YaemikoShiTiSiWangShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure YaemikoShiTiSiWangShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure YaemikoShiTiSiWangShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure YaemikoShiTiSiWangShi!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		SolomonModVariables.MapVariables.get(world).yaealive = (boolean) (false);
		SolomonModVariables.MapVariables.get(world).syncData(world);
		if (!world.isRemote) {
			EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemMingshenyusou.block, (int) (1)));
			entityToSpawn.setPickupDelay(10);
			world.spawnEntity(entityToSpawn);
		}
	}
}
