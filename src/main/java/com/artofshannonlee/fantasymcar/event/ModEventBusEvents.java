package com.artofshannonlee.fantasymcar.event;

import com.artofshannonlee.fantasymcar.entity.ModEntityTypes;
import com.artofshannonlee.fantasymcar.entity.custom.SlimVillagerEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModEventBusEvents {

@SubscribeEvent
public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
    event.put ( ModEntityTypes.SLIMVILLAGER.get (), SlimVillagerEntity.setAttributes ());
}}
