package com.bg03.experimental.block.entity;

import com.bg03.experimental.Experimental;
import com.bg03.experimental.block.ModBlocks;
import com.bg03.experimental.block.entity.custom.CrystallizerBlockEntity;
import com.bg03.experimental.block.entity.custom.PedestalBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<PedestalBlockEntity> PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Experimental.MOD_ID, "pedestal_be"),
                    BlockEntityType.Builder.create(PedestalBlockEntity::new, ModBlocks.PEDESTAL).build(null));
    public static final BlockEntityType<CrystallizerBlockEntity> CRYSTALLIZER_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Experimental.MOD_ID, "crystallizer_be"),
                    BlockEntityType.Builder.create(CrystallizerBlockEntity::new, ModBlocks.CRYSTALLIZER).build(null));

    public static void registerBlockEntities() {
        Experimental.LOGGER.info("Registering Block Entities for " + Experimental.MOD_ID);
    }
}