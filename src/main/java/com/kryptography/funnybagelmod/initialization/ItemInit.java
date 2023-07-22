package com.kryptography.funnybagelmod.initialization;

import com.kryptography.funnybagelmod.FunnyBagelMod;
import com.kryptography.funnybagelmod.items.ThrowableBagelItem;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ItemInit {


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FunnyBagelMod.MODID);
    public static final RegistryObject<Item> BAGEL = (ITEMS.register("bagel",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder().nutrition(6).saturationMod(0.3F).build())
                    .tab(CreativeModeTab.TAB_FOOD)
            )));
    public static final RegistryObject<BlockItem> BAGEL_BLOCK = (ITEMS.register("bagel_block",
            () -> new BlockItem(BlockInit.BAGEL_BLOCK.get(),
                    new Item.Properties()
                            .tab(CreativeModeTab.TAB_FOOD)
            )));

    public static final RegistryObject<Item> THROWABLE_BAGEL = (ITEMS.register("throwable_bagel",
            () -> new ThrowableBagelItem(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.RARE)
                    .tab(CreativeModeTab.TAB_FOOD)

            )));

    public static final RegistryObject<Item> CHEESE_BAGEL = (ITEMS.register("cheese_bagel",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder().nutrition(10).saturationMod(0.4F).build())
                    .tab(CreativeModeTab.TAB_FOOD)

            )));
    public static final RegistryObject<Item> BAGEL_DOUGH = (ITEMS.register("bagel_dough",
            ()-> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1F).build())
                    .tab(CreativeModeTab.TAB_FOOD)

            )));
}
