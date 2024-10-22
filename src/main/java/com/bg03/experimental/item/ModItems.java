package com.bg03.experimental.item;

import com.bg03.experimental.Experimental;
import com.bg03.experimental.item.custom.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    public static final Item FLUORITE = registerItem("fluorite", new Item(new Item.Settings()));
    public static final Item RAW_FLUORITE = registerItem("raw_fluorite", new Item(new Item.Settings()));

    public static final Item CHAINSAW = registerItem("chainsaw", new ChainsawItem(new Item.Settings().maxDamage(512)));

    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new Item.Settings().food(ModFoodComponents.STRAWBERRY)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.experimental.strawberry.tooltip.1"));

            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item STARLIGHT_ASHES = registerItem("starlight_ashes", new Item(new Item.Settings()));

    public static final Item FLUORITE_SWORD = registerItem("fluorite_sword", new EffectSwordItem(ModToolMaterials.FLUORITE,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.FLUORITE,3, -2.4F)), StatusEffects.LEVITATION));
    public static final Item FLUORITE_PICKAXE = registerItem("fluorite_pickaxe", new PickaxeItem(ModToolMaterials.FLUORITE,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.FLUORITE,1, -2.0F))));
    public static final Item FLUORITE_AXE = registerItem("fluorite_axe", new AxeItem(ModToolMaterials.FLUORITE,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.FLUORITE,6.0F, -3.2F))));
    public static final Item FLUORITE_SHOVEL = registerItem("fluorite_shovel", new ShovelItem(ModToolMaterials.FLUORITE,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.FLUORITE,1.5F, -3.0F))));
    public static final Item FLUORITE_HOE = registerItem("fluorite_hoe", new HoeItem(ModToolMaterials.FLUORITE,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.FLUORITE,0, -3.0F))));

    public static final Item FLUORITE_PAXEL = registerItem("fluorite_paxel", new PaxelItem(ModToolMaterials.FLUORITE,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.FLUORITE,5.0F, -2.5F))));
    public static final Item FLUORITE_HAMMER = registerItem("fluorite_hammer", new HammerItem(ModToolMaterials.FLUORITE,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.FLUORITE,8.0F, -3.0F))));

    public static final Item FLUORITE_HELMET = registerItem("fluorite_helmet",
            new ModArmorItem(ModArmorMaterials.FLUORITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item FLUORITE_CHESTPLATE = registerItem("fluorite_chestplate",
            new ArmorItem(ModArmorMaterials.FLUORITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item FLUORITE_LEGGINGS = registerItem("fluorite_leggings",
            new ArmorItem(ModArmorMaterials.FLUORITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item FLUORITE_BOOTS = registerItem("fluorite_boots",
            new ArmorItem(ModArmorMaterials.FLUORITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item FLUORITE_HORSE_ARMOR = registerItem("fluorite_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.FLUORITE_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Experimental.MOD_ID, name), item);
    }

    private static void customIngredients(FabricItemGroupEntries entries) {
        entries.add(ModItems.FLUORITE);
        entries.add(ModItems.RAW_FLUORITE);
    }

    public static void registerItems() {
        Experimental.LOGGER.info("Registering items for " + Experimental.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIngredients);
    }
}
