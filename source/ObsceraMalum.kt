package io.jayhart.hytale.obsceramalum

import com.hypixel.hytale.logger.HytaleLogger
import com.hypixel.hytale.server.core.plugin.JavaPlugin
import com.hypixel.hytale.server.core.plugin.JavaPluginInit

/**
 * Obscera Malum - Silentium nomen suum meminit
 *
 * This class serves as the entrypoint for the Obscera Malum plugin.
 * Use the setup method to register into game registries or add event listeners!
 *
 * @author Emmett Jayhart
 */
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
