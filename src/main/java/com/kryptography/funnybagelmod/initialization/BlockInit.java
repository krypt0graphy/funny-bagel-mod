package com.kryptography.funnybagelmod.initialization;

import com.kryptography.funnybagelmod.FunnyBagelMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FunnyBagelMod.MODID);
    public static final RegistryObject<Block> BAGEL_BLOCK = BLOCKS.register("bagel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.CAKE).color(MaterialColor.COLOR_BROWN)
                    .strength(1.0f)
                    .sound(SoundType.WOOL)
                    .destroyTime(2F)
            ));
}
