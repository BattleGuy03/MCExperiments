package com.bg03.experimental.screen;

import com.bg03.experimental.Experimental;
import com.bg03.experimental.screen.custom.CrystallizerScreenHandler;
import com.bg03.experimental.screen.custom.PedestalScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ModScreenHandlers {
    public static final ScreenHandlerType<PedestalScreenHandler> PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Experimental.MOD_ID, "pedestal_screen_handler"),
            new ExtendedScreenHandlerType<>(PedestalScreenHandler::new, BlockPos.PACKET_CODEC));
    public static final ScreenHandlerType<CrystallizerScreenHandler> CRYSTALLIZER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Experimental.MOD_ID, "crystallizer_screen_handler"),
                    new ExtendedScreenHandlerType<>(CrystallizerScreenHandler::new, BlockPos.PACKET_CODEC));

    public static void registerScreenHandlers() {
        Experimental.LOGGER.info("Registering Screen Handlers for " + Experimental.MOD_ID);
    }
}
