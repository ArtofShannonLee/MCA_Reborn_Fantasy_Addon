package net.mcarf.quilt;

import net.mcarf.MCARFantasyExpectPlatform;
import org.quiltmc.loader.api.QuiltLoader;

import java.nio.file.Path;

public class MCARFantasyExpectPlatformImpl {
    /**
     * This is our actual method to {@link MCARFantasyExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return QuiltLoader.getConfigDir();
    }
}
