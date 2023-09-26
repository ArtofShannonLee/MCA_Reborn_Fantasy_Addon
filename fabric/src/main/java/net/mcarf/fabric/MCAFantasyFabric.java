package net.mcarf.fabric;

import net.mcarf.MCARFantasy;
import net.fabricmc.api.ModInitializer;

public class MCAFantasyFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MCARFantasy.init();
    }
}
