# Minestom Dashboard

A lightweight server dashboard for Minestom, built with Java Swing
![Minestom4fun](capture.png)
*Example: [Minestom4fun](https://github.com/Kanelucky/Minestom4fun) using this library as its server dashboard*

## Features

- **Console tab** — Live server output with ANSI color support, command input
- **Performance tab** — Real-time RAM and TPS graphs
- **Players tab** — Online player list with UUID

## Usage

### Kotlin
```kotlin
// In main, before starting the server
val dashboard = Dashboard.getInstance()

// After server has started
dashboard.afterServerStarted()
```

### Java
```java
// In main, before starting the server
Dashboard dashboard = Dashboard.getInstance();

// After server has started
dashboard.afterServerStarted();
```

## Dependencies

Add to `build.gradle.kts`:

```kotlin
implementation("com.formdev:flatlaf:3.4")
```

## Credits

This module is based on and heavily inspired by the following open-source projects:

### [<img src="https://raw.githubusercontent.com/AllayMC/Allay/refs/heads/master/server/src/main/resources/icon.png" width="16"/>](https://github.com/AllayMC/Allay) [AllayMC/Allay](https://github.com/AllayMC/Allay)
- `Dashboard.kt` — ported from `org.allaymc.server.gui.Dashboard`
- `ConsolePanel.kt` — ported from `org.allaymc.server.gui.ConsolePanel`
- `GraphPanel.kt` — ported from `org.allaymc.server.gui.GraphPanel`

### [<img src="https://geysermc.org/img/apple-touch-icon.png" width="16"/>](https://github.com/GeyserMC/Geyser) [GeyserMC/Geyser](https://github.com/GeyserMC/Geyser)
- `ANSIColor.kt` — ANSI color parsing logic originally authored by GeyserMC, later adapted by AllayMC

All original code is licensed under the **MIT License**.
Copyright (c) 2019-2022 GeyserMC
Copyright (c) AllayMC Contributors


