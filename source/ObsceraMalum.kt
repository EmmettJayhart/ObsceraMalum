package io.jayhart.hytale

import com.hypixel.hytale.logger.HytaleLogger
import com.hypixel.hytale.server.core.plugin.JavaPlugin
import com.hypixel.hytale.server.core.plugin.JavaPluginInit

class ObsceraMalum(init: JavaPluginInit) : JavaPlugin(init) {
    companion object {
        private val LOGGER = HytaleLogger.forEnclosingClass()
    }

    init {
        LOGGER.atInfo().log("Initialized $name@${manifest.version}")
        LOGGER.atInfo().log("Silentium nomen suum meminit")
    }

    override fun setup() {
        LOGGER.atFine().log(":setup")
        // TODO: Register your game content, commands, and event listeners here
    }
}
