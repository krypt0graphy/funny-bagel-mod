package com.kryptography.funnybagelmod;

import com.kryptography.funnybagelmod.initialization.BlockInit;
import com.kryptography.funnybagelmod.initialization.EntityInit;
import com.kryptography.funnybagelmod.initialization.ItemInit;
import com.kryptography.funnybagelmod.sound.FunnyBagelSound;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FunnyBagelMod.MODID)
public class FunnyBagelMod {
    public static final String MODID = "funnybagelmod";

    public FunnyBagelMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        EntityInit.ENTITIES.register(bus);
        FunnyBagelSound.SOUND_EVENT.register(bus);

        bus.addListener(this::registerRenderers);
    }

    private void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.THROWABLE_BAGEL.get(), ThrownItemRenderer::new);
    }
}
