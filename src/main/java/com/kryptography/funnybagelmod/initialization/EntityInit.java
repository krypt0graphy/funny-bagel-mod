package com.kryptography.funnybagelmod.initialization;

import com.kryptography.funnybagelmod.FunnyBagelMod;
import com.kryptography.funnybagelmod.entity.projectile.ThrowableBagel;
import com.kryptography.funnybagelmod.items.ThrowableBagelItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class EntityInit{

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FunnyBagelMod.MODID);


    public static final RegistryObject<EntityType<ThrowableBagel>> THROWABLE_BAGEL = ENTITIES.register("throwable_bagel", () ->
            EntityType.Builder.<ThrowableBagel>of(ThrowableBagel::new, MobCategory.MISC).sized(0.25F, 0.25F).build(new ResourceLocation(FunnyBagelMod.MODID, "throwable_bagel").toString())
    );

    public static void register(IEventBus modEventBus) {
        ENTITIES.register(modEventBus);
    }
}
