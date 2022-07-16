package net.mcreator.solomon.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.solomon.ElementsSolomonMod;

import java.util.Map;

@ElementsSolomonMod.ModElement.Tag
public class ProcedureGetvision extends ElementsSolomonMod.ModElement {
	public ProcedureGetvision(ElementsSolomonMod instance) {
		super(instance, 234);
	}

	public static String executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Getvision!");
			return "";
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getEntityData().getString("vision"))).equals("vf"))) {
			return "\u00A7r\u795E\u4E4B\u773C\uFF1A\u00A7c\u706B";
		} else if ((((entity.getEntityData().getString("vision"))).equals("vw"))) {
			return "\u00A7r\u795E\u4E4B\u773C\uFF1A\u00A79\u6C34";
		} else if ((((entity.getEntityData().getString("vision"))).equals("vg"))) {
			return "\u00A7r\u795E\u4E4B\u773C\uFF1A\u00A7a\u8349";
		} else if ((((entity.getEntityData().getString("vision"))).equals("vwi"))) {
			return "\u00A7r\u795E\u4E4B\u773C\uFF1A\u00A73\u98CE";
		} else if ((((entity.getEntityData().getString("vision"))).equals("vl"))) {
			return "\u00A7r\u795E\u4E4B\u773C\uFF1A\u00A7d\u96F7";
		} else if ((((entity.getEntityData().getString("vision"))).equals("vi"))) {
			return "\u00A7r\u795E\u4E4B\u773C\uFF1A\u00A7b\u51B0";
		} else if ((((entity.getEntityData().getString("vision"))).equals("vr"))) {
			return "\u00A7r\u795E\u4E4B\u773C\uFF1A\u00A76\u5CA9";
		} else if ((((entity.getEntityData().getString("vision"))).equals("gwi"))) {
			return "\u00A7e\u795E\u4E4B\u5FC3\uFF1A\u00A73\u98CE";
		} else if ((((entity.getEntityData().getString("vision"))).equals("gr"))) {
			return "\u00A7e\u795E\u4E4B\u5FC3\uFF1A\u00A76\u5CA9";
		} else {
			return "\u00A7r\u795E\u4E4B\u773C\uFF1A\u65E0";
		}
	}
}
