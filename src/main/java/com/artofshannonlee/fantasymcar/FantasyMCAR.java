package com.artofshannonlee.fantasymcar;

import com.artofshannonlee.fantasymcar.client.render.SlimVillagerEntityFMCARenderer;
import com.artofshannonlee.fantasymcar.entity.ModEntityTypes;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

@Mod(FantasyMCAR.MOD_ID)
public class FantasyMCAR
{
    public static final String MOD_ID = "fantasymcar";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public FantasyMCAR() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        GeckoLib.initialize();

        ModEntityTypes.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientsetup(final FMLCommonSetupEvent event)
    {
        EntityRenderers.register (ModEntityTypes.SLIMVILLAGER.get (), SlimVillagerEntityFMCARenderer::new);

        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
