package net.mcarf.forge;

import net.mcarf.MCARFantasyExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class MCARFantasyExpectPlatformImpl {
    /**
     * This is our actual method to {@link MCARFantasyExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
