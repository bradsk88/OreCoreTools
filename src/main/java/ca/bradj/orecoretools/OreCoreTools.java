package ca.bradj.orecoretools;

import java.util.logging.Logger;

import ca.bradj.orecoretools.item.OreCoreToolsItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item; 
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = OreCoreTools.MODID, version = OreCoreTools.VERSION)
public class OreCoreTools {
	
	@SidedProxy(clientSide="ca.bradj.orecoretools.ClientProxy", serverSide="ca.bradj.orecoretools.ServerProxy")
    public static CommonProxy proxy;
	
	@SuppressWarnings("unused")
	private static final Logger LOGGER = Logger.getLogger("Minecraft");
	
	public static final String MODID = "OreCoreExtended";
	public static final String VERSION = "0.1.0";

	public static CreativeTabs tabOreCoreTools = new CreativeTabs("tabOreCoreTools") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return OreCoreToolsItems.aluminumPickaxe;
	    }
	};
	
    /**
     * Run before anything else. Read your config, create blocks, items, etc, and
     * register them with the GameRegistry.
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	OreCoreTools.proxy.preInit(e);
    }
    
    /**
     * Do your mod setup. Build whatever data structures you care about. Register recipes.
     */
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	OreCoreTools.proxy.init(e);
    }

    /**
     * Handle interaction with other mods, complete your setup based on this.
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	OreCoreTools.proxy.postInit(e);
    }
    
}
