package com.skyblock;

import net.fabricmc.api.ClientModInitializer;

public class SkyblockModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Client-side initialization
        SkyblockMod.LOGGER.info("Skyblock Commands Client initialized");
    }
}
