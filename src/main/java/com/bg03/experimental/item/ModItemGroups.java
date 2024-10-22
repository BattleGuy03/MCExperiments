package com.bg03.experimental.item;

import com.bg03.experimental.Experimental;
import com.bg03.experimental.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FLUORITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Experimental.MOD_ID, "fluorite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.fluorite"))
                    .icon(() -> new ItemStack(ModItems.FLUORITE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.FLUORITE);
                        entries.add(ModItems.RAW_FLUORITE);
                        entries.add(ModItems.CHAINSAW);

                        entries.add(ModItems.STRAWBERRY);

                        entries.add(ModItems.STARLIGHT_ASHES);

                        entries.add(ModBlocks.FLUORITE_BLOCK);
                        entries.add(ModBlocks.FLUORITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_FLUORITE_ORE);
                        entries.add(ModBlocks.NETHER_FLUORITE_ORE);
                        entries.add(ModBlocks.END_FLUORITE_ORE);

                        entries.add(ModBlocks.MAGIC_BLOCK);

                        entries.add(ModBlocks.FLUORITE_STAIRS);
                        entries.add(ModBlocks.FLUORITE_SLAB);
                        entries.add(ModBlocks.FLUORITE_BUTTON);
                        entries.add(ModBlocks.FLUORITE_PRESSURE_PLATE);

                        entries.add(ModBlocks.FLUORITE_FENCE);
                        entries.add(ModBlocks.FLUORITE_FENCE_GATE);
                        entries.add(ModBlocks.FLUORITE_WALL);

                        entries.add(ModBlocks.FLUORITE_DOOR);
                        entries.add(ModBlocks.FLUORITE_TRAPDOOR);

                        entries.add(ModItems.FLUORITE_SWORD);
                        entries.add(ModItems.FLUORITE_PICKAXE);
                        entries.add(ModItems.FLUORITE_AXE);
                        entries.add(ModItems.FLUORITE_SHOVEL);
                        entries.add(ModItems.FLUORITE_HOE);
                        entries.add(ModItems.FLUORITE_PAXEL);
                        entries.add(ModItems.FLUORITE_HAMMER);

                        entries.add(ModItems.FLUORITE_HELMET);
                        entries.add(ModItems.FLUORITE_CHESTPLATE);
                        entries.add(ModItems.FLUORITE_LEGGINGS);
                        entries.add(ModItems.FLUORITE_BOOTS);

                        entries.add(ModItems.FLUORITE_HORSE_ARMOR);

                        entries.add(ModBlocks.PEDESTAL);
                        entries.add(ModBlocks.CRYSTALLIZER);
                    }).build());

    public static void registerItemGroups() {
        Experimental.LOGGER.info("Registering item groups for " + Experimental.MOD_ID);
    }
}
