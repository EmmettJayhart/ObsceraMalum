package io.jayhart.hytale.obsceramalum.pages

import com.hypixel.hytale.protocol.packets.interface_.CustomPageLifetime
import com.hypixel.hytale.server.core.entity.entities.player.pages.BasicCustomUIPage
import com.hypixel.hytale.server.core.ui.builder.UICommandBuilder
import com.hypixel.hytale.server.core.universe.PlayerRef

class HelloWorldPage(playerRef: PlayerRef) : BasicCustomUIPage(playerRef, CustomPageLifetime.CanDismiss) {
    override fun build(cmd: UICommandBuilder) {
        cmd.append("Pages/HelloWorldPage.ui")
    }
}
