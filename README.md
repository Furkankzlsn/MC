# Skyblock Commands Mod

A Minecraft Fabric mod that provides clean command interface for Skyblock gameplay.

## ✨ Features

### 🎮 Clean Commands
- `/skyblock` - Main command with help
- `/skyblock test` - Test datapack connection
- `/skyblock start` - Start skyblock game
- `/skyblock island create` - Create new island
- `/skyblock help` - Show help menu

### 🔗 Datapack Integration
- Commands execute datapack functions
- Lightweight mod - game logic in datapack
- Perfect separation of concerns

## 🚀 Usage

### Player Commands
```
/skyblock              # Show main help
/skyblock test         # Test if everything works
/skyblock start        # Begin skyblock adventure
/skyblock island create # Generate starting island
```

### For Developers
```bash
./gradlew build        # Build the mod
./gradlew runClient    # Test in dev environment
```

## 📦 Requirements

- **Minecraft**: 1.21.8
- **Fabric Loader**: 0.16.14+
- **Fabric API**: 0.129.0+
- **Java**: 21+

## 🛠️ Development

This mod works with a companion datapack that handles:
- Quest systems
- Island generation logic
- Game mechanics
- UI systems

The mod provides clean `/skyblock` commands that execute datapack functions.

## 📁 Project Structure

```
src/main/java/com/skyblock/
├── SkyblockMod.java          # Main mod class
├── SkyblockModClient.java    # Client initialization
└── mixin/                    # Mixin classes (if needed)
```

## 🎯 Command -> Datapack Mapping

| Command | Datapack Function |
|---------|-------------------|
| `/skyblock test` | `minecraft:test` |
| `/skyblock start` | `minecraft:start_game` |
| `/skyblock island create` | `minecraft:create_island` |
| `/skyblock help` | `minecraft:help` |

## 🔧 Build Instructions

1. **Clone the repository**
2. **Run development client**:
   ```bash
   ./gradlew runClient
   ```
3. **Build for production**:
   ```bash
   ./gradlew build
   ```

The built mod will be in `build/libs/skyblock-commands-1.0.0.jar`

## 📄 License

MIT License - Feel free to use and modify!Example Mod

## Setup

For setup instructions please see the [fabric documentation page](https://docs.fabricmc.net/develop/getting-started/setting-up-a-development-environment) that relates to the IDE that you are using.

## License

This template is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.
