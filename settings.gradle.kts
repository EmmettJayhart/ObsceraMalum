import dev.scaffoldit.hytale.wire.HytaleManifest.Author

rootProject.name = "ObsceraMalum"

plugins {
    id("dev.scaffoldit") version "+"
}

hytale {
    repositories {
        mavenLocal()
    }

    useKotlin()
    useFlat()

    manifest {
        Group = "io.jayhart.hytale"
        Name = "ObsceraMalum"
        Version = "0.1.0"
        Description = "Silentium nomen suum meminit"
        Authors = listOf(
            Author(
                Name = "Emmett Jayhart",
                Email = "emmett@jayhart.io",
                Url = "https://jayhart.io"
            )
        )
        Website = "https://hytale.jayhart.io/obsceramalum"
        Main = "io.jayhart.hytale.obsceramalum.ObsceraMalumPlugin"
        ServerVersion = "2026.02.19-1a311a592"
        Dependencies = mapOf(
            "AmoAster:Kytale" to "*"
        )
        OptionalDependencies = emptyMap()
        LoadBefore = emptyMap()
        DisabledByDefault = false
        IncludesAssetPack = true
        SubPlugins = emptyList()
    }
}
