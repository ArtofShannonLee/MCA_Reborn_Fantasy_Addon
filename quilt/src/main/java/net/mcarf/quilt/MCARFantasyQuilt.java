package net.mcarf.quilt;

import net.mcarf.MCARFantasy;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class MCARFantasyQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        MCARFantasy.init();
    }
}
