package com.artofshannonlee.fantasymcar.entity;

import com.artofshannonlee.fantasymcar.FantasyMCAR;
import com.artofshannonlee.fantasymcar.entity.custom.SlimVillagerEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, FantasyMCAR.MOD_ID);

    public static final RegistryObject<EntityType<SlimVillagerEntity>> SLIMVILLAGER =
                        ENTITY_TYPES.register("slimvillager",
                        () -> EntityType.Builder.of(SlimVillagerEntity::new, MobCategory.AMBIENT)
                                .sized(0.6F, 2.0F)
                                .build(new ResourceLocation(FantasyMCAR.MOD_ID, "slimvillager").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
