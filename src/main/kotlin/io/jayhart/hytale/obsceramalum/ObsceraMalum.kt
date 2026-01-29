package io.jayhart.hytale.obsceramalum

import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent
import com.hypixel.hytale.server.core.plugin.JavaPlugin
import com.hypixel.hytale.server.core.plugin.JavaPluginInit
import io.jayhart.hytale.obsceramalum.commands.Hello
import io.jayhart.hytale.obsceramalum.events.OnPlayerReady

class ObsceraMalum(init: JavaPluginInit) : JavaPlugin(init) {
    override fun setup() {
        // Register commands
        commandRegistry.registerCommand(Hello("hello", "Say hello to the server"))

        // Register event listeners
        eventRegistry.registerGlobal(PlayerReadyEvent::class.java, OnPlayerReady::onPlayerReady)
    }
}
