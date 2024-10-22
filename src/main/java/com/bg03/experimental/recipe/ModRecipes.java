package com.bg03.experimental.recipe;

import com.bg03.experimental.Experimental;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static final RecipeSerializer<CrystallizerRecipe> CRYSTALLIZER_SERIALIZER =
            Registry.register(Registries.RECIPE_SERIALIZER, Identifier.of(Experimental.MOD_ID, "crystallizing"), new CrystallizerRecipe.Serializer());
    public static final RecipeType<CrystallizerRecipe> CRYSTALLIZER_TYPE =
            Registry.register(Registries.RECIPE_TYPE, Identifier.of(Experimental.MOD_ID, "crystallizing"), new RecipeType<>() {
                @Override
                public String toString() {
                    return "crystallizing";
                }
            });

    public static void registerRecipes() {
        Experimental.LOGGER.info("Registering recipes for " + Experimental.MOD_ID);
    }
}
