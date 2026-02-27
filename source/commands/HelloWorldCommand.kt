package io.jayhart.hytale.obsceramalum.commands

import com.hypixel.hytale.component.Ref
import com.hypixel.hytale.component.Store
import com.hypixel.hytale.server.core.command.system.CommandContext
import com.hypixel.hytale.server.core.command.system.basecommands.AbstractPlayerCommand
import com.hypixel.hytale.server.core.entity.entities.Player
import com.hypixel.hytale.server.core.universe.PlayerRef
import com.hypixel.hytale.server.core.universe.world.World
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore
import io.jayhart.hytale.obsceramalum.pages.HelloWorldPage

class HelloWorldCommand : AbstractPlayerCommand("HelloWorld", "Opens Hello World UI", false) {
    override fun execute(
        ctx: CommandContext,
        store: Store<EntityStore>,
        ref: Ref<EntityStore>,
        playerRef: PlayerRef,
        world: World
    ) {
        val player = store.getComponent(ref, Player.getComponentType())
        val page = HelloWorldPage(playerRef)

        player?.pageManager?.openCustomPage(ref, store, page)
    }
}
