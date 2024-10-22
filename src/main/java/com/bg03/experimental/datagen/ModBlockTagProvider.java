package com.bg03.experimental.datagen;

import com.bg03.experimental.block.ModBlocks;
import com.bg03.experimental.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(
                        ModBlocks.FLUORITE_BLOCK,
                        ModBlocks.FLUORITE_ORE,
                        ModBlocks.DEEPSLATE_FLUORITE_ORE,
                        ModBlocks.NETHER_FLUORITE_ORE,
                        ModBlocks.END_FLUORITE_ORE
                );

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(
                        ModBlocks.NETHER_FLUORITE_ORE,
                        ModBlocks.END_FLUORITE_ORE
                );

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(
                        ModBlocks.DEEPSLATE_FLUORITE_ORE,
                        ModBlocks.FLUORITE_BLOCK,
                        ModBlocks.FLUORITE_STAIRS,
                        ModBlocks.FLUORITE_SLAB
                );

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(
                        ModBlocks.FLUORITE_ORE
                );

        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.FLUORITE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.FLUORITE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.FLUORITE_WALL);

        getOrCreateTagBuilder(ModTags.Blocks.PAXEL_MINEABLE)
                .forceAddTag(BlockTags.PICKAXE_MINEABLE)
                .forceAddTag(BlockTags.AXE_MINEABLE)
                .forceAddTag(BlockTags.SHOVEL_MINEABLE);
    }
}
