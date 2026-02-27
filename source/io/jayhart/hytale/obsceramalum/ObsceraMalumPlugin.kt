package io.jayhart.hytale.obsceramalum

import com.hypixel.hytale.server.core.plugin.JavaPlugin
import com.hypixel.hytale.server.core.plugin.JavaPluginInit
import io.jayhart.hytale.obsceramalum.commands.HelloWorldCommand

class ObsceraMalumPlugin(init: JavaPluginInit) : JavaPlugin(init) {
    override fun setup() {
        commandRegistry.registerCommand(HelloWorldCommand())
    }
}
