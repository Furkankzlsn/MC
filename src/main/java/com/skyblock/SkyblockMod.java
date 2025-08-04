package com.skyblock;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkyblockMod implements ModInitializer {
    public static final String MOD_ID = "skyblock-commands";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Skyblock Commands Mod Loading...");
        
        // Register commands
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            // Main /skyblock command
            dispatcher.register(CommandManager.literal("skyblock")
                .then(CommandManager.literal("test")
                    .executes(context -> {
                        return executeDatapackFunction(context.getSource(), "minecraft:test");
                    }))
                .then(CommandManager.literal("start")
                    .executes(context -> {
                        return executeDatapackFunction(context.getSource(), "minecraft:start_game");
                    }))
                .then(CommandManager.literal("island")
                    .then(CommandManager.literal("create")
                        .executes(context -> {
                            return executeDatapackFunction(context.getSource(), "minecraft:create_island");
                        })))
                .then(CommandManager.literal("help")
                    .executes(context -> {
                        return executeDatapackFunction(context.getSource(), "minecraft:help");
                    }))
                .executes(context -> {
                    // Default skyblock command - show help
                    context.getSource().sendFeedback(() -> Text.literal("§6§l🏝️ SKYBLOCK COMMANDS"), false);
                    context.getSource().sendFeedback(() -> Text.literal("§e/skyblock test §7- Test connection"), false);
                    context.getSource().sendFeedback(() -> Text.literal("§e/skyblock start §7- Start skyblock"), false);
                    context.getSource().sendFeedback(() -> Text.literal("§e/skyblock island create §7- Create island"), false);
                    context.getSource().sendFeedback(() -> Text.literal("§e/skyblock help §7- Show help"), false);
                    return 1;
                })
            );
        });
        
        LOGGER.info("Skyblock Commands Mod Loaded!");
    }
    
    private int executeDatapackFunction(ServerCommandSource source, String function) {
        try {
            // Execute datapack function
            source.getServer().getCommandManager().executeWithResult(source, "function " + function);
            return 1;
        } catch (Exception e) {
            source.sendError(Text.literal("§cError executing function: " + function));
            LOGGER.error("Failed to execute function: " + function, e);
            return 0;
        }
    }
}
