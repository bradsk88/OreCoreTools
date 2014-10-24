package ca.bradj.orecoretools.item.aluminum;


public class AluminumPickaxe extends OreCorePickaxe {

	protected AluminumPickaxe(int id) {
		super(ToolMaterial.EMERALD, "aluminumPickaxe");
		setHarvestLevel("pickaxe", 3);
		setMaxDamage(20);
		//TODO: Make fragile -BJ
	}
}
