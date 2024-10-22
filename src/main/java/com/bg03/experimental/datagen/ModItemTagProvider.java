package com.bg03.experimental.datagen;

import com.bg03.experimental.item.ModItems;
import com.bg03.experimental.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(
                        ModItems.FLUORITE,
                        ModItems.RAW_FLUORITE,
                        Items.DIAMOND,
                        Items.STICK
                );

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.FLUORITE_HELMET)
                .add(ModItems.FLUORITE_CHESTPLATE)
                .add(ModItems.FLUORITE_LEGGINGS)
                .add(ModItems.FLUORITE_BOOTS);
    }
}
