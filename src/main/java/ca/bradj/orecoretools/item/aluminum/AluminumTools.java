package ca.bradj.orecoretools.item.aluminum;

import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecoretools.item.OreCoreToolsItems;
import ca.bradj.orecoretools.item.ToolIDs;

public class AluminumTools {

	private static final String ALUMINUM_PICKAXE_NAME = "Aluminum.Pickaxe";

	public static void init() { 
		OreCoreToolsItems.aluminumPickaxe = OreCoreRegistration.registerItem(new AluminumPickaxe(ToolIDs.ALUMINUM_PICKAXE), ALUMINUM_PICKAXE_NAME);
	}

}
