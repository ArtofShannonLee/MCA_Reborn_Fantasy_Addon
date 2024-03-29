package net.mcarf.fabric;

import net.mcarf.MCARFantasyExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class MCARFantasyExpectPlatformImpl {
    /**
     * This is our actual method to {@link MCARFantasyExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
