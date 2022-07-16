package net.mcreator.solomon.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureBelphenChuShiShiTiShengCheng extends ElementsSolomonMod.ModElement {
	public ProcedureBelphenChuShiShiTiShengCheng(ElementsSolomonMod instance) {
		super(instance, 283);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BelphenChuShiShiTiShengCheng!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BelphenChuShiShiTiShengCheng!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u00A71\u8D1D\u5C14\u82AC\u683C\u4E0D\u5C51\u77A5\u89C6\u3002"));
		}
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 60, (int) 2));
	}
}
