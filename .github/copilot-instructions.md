<!-- Use this file to provide workspace-specific custom instructions to Copilot. For more details, visit https://code.visualstudio.com/docs/copilot/copilot-customization#_use-a-githubcopilotinstructionsmd-file -->

# Skyblock Commands Fabric Mod

This is a Minecraft Fabric mod that provides custom command system for Skyblock gameplay.

## Project Structure

- **Main Mod Class**: `com.skyblock.SkyblockMod` - Handles command registration
- **Client Class**: `com.skyblock.SkyblockModClient` - Client-side initialization
- **Commands**: All commands start with `/skyblock` prefix
- **Integration**: Commands execute datapack functions for game logic

## Command System

The mod provides clean command interface:
- `/skyblock` - Show help menu
- `/skyblock test` - Test connection with datapack
- `/skyblock start` - Start skyblock game
- `/skyblock island create` - Create new island
- `/skyblock help` - Show detailed help

## Development Guidelines

- Use Fabric API for command registration
- Commands should execute datapack functions via `executeDatapackFunction()`
- Keep mod lightweight - game logic goes in datapack
- Follow Minecraft 1.21.8 conventions
- Use proper error handling for datapack function calls

## Datapack Integration

Commands call datapack functions in `minecraft:` namespace:
- `minecraft:test` - Test function
- `minecraft:start_game` - Game initialization
- `minecraft:create_island` - Island generation
- `minecraft:help` - Help system

## Build and Test

Use Gradle tasks:
- `./gradlew build` - Build the mod
- `./gradlew runClient` - Test in development environment
