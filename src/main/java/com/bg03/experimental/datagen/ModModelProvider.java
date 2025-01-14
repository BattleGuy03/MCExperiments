package com.bg03.experimental.datagen;

import com.bg03.experimental.block.ModBlocks;
import com.bg03.experimental.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool fluoriteTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FLUORITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FLUORITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_FLUORITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_FLUORITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_FLUORITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);

        blockStateModelGenerator.registerCooker(ModBlocks.CRYSTALLIZER, TexturedModel.ORIENTABLE);

        fluoriteTexturePool.stairs(ModBlocks.FLUORITE_STAIRS);
        fluoriteTexturePool.slab(ModBlocks.FLUORITE_SLAB);
        fluoriteTexturePool.button(ModBlocks.FLUORITE_BUTTON);
        fluoriteTexturePool.pressurePlate(ModBlocks.FLUORITE_PRESSURE_PLATE);

        fluoriteTexturePool.fence(ModBlocks.FLUORITE_FENCE);
        fluoriteTexturePool.fenceGate(ModBlocks.FLUORITE_FENCE_GATE);
        fluoriteTexturePool.wall(ModBlocks.FLUORITE_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.FLUORITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.FLUORITE_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.FLUORITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_FLUORITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHAINSAW, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.STARLIGHT_ASHES, Models.GENERATED);

        itemModelGenerator.register(ModItems.FLUORITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLUORITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLUORITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLUORITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLUORITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.FLUORITE_PAXEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLUORITE_HAMMER, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.FLUORITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.FLUORITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.FLUORITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.FLUORITE_BOOTS));

        itemModelGenerator.register(ModItems.FLUORITE_HORSE_ARMOR, Models.GENERATED);
    }
}
