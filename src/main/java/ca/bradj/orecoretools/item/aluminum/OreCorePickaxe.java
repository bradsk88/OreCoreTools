package ca.bradj.orecoretools.item.aluminum;

import ca.bradj.orecoretools.OreCoreTools;
import net.minecraft.item.ItemPickaxe;

public class OreCorePickaxe extends ItemPickaxe {

	protected OreCorePickaxe(ToolMaterial toolMaterial, String texture) {
		super(toolMaterial);
		setCreativeTab(OreCoreTools.tabOreCoreTools);
		setTextureName("orecoretools:"+texture);
	}

}
