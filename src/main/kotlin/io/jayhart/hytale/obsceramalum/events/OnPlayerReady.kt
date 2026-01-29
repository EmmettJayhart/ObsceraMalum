package io.jayhart.hytale.obsceramalum.events

import com.hypixel.hytale.server.core.Message
import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent

object OnPlayerReady {
    fun onPlayerReady(event: PlayerReadyEvent) {
        val player = event.player
        player.sendMessage(Message.raw("Welcome ${player.displayName}"))
    }
}
