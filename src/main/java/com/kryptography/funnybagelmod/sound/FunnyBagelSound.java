package com.kryptography.funnybagelmod.sound;

import com.kryptography.funnybagelmod.FunnyBagelMod;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FunnyBagelSound {
    public static final DeferredRegister<SoundEvent> SOUND_EVENT = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FunnyBagelMod.MODID);


    public static final RegistryObject<SoundEvent> BONK = registerSoundEvent("bonk");
    public static final RegistryObject<SoundEvent> THROW = registerSoundEvent2("throw");
    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENT.register(name, () -> new SoundEvent(new ResourceLocation(FunnyBagelMod.MODID, name)));
    }
    private static RegistryObject<SoundEvent> registerSoundEvent2(String name) {
        return SOUND_EVENT.register(name, () -> new SoundEvent(new ResourceLocation(FunnyBagelMod.MODID, name)));
    }
    public static void register(IEventBus bus) {
        SOUND_EVENT.register(bus);
    }
}
