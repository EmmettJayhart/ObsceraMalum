import dev.scaffoldit.hytale.wire.HytaleManifest.Author

rootProject.name = "ObsceraMalum"

plugins {
    id("dev.scaffoldit") version "+"
}

hytale {
    useKotlin()
    useFlat()

    manifest {
        Group = "io.jayhart.hytale"
        Name = "Obscera Malum"
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
        Main = "io.jayhart.hytale.ObsceraMalum"
        ServerVersion = "*"
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
