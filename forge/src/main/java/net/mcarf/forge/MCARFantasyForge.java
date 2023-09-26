package net.mcarf.forge;

import dev.architectury.platform.forge.EventBuses;
import net.mcarf.MCARFantasy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MCARFantasy.MOD_ID)
public class MCARFantasyForge {
    public MCARFantasyForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus( MCARFantasy.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        MCARFantasy.init();
    }
}
