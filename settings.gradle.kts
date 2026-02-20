import dev.scaffoldit.hytale.wire.HytaleManifest.Author

rootProject.name = "io.jayhart.hytale.obsceramalum"

plugins {
    id("dev.scaffoldit") version "+"
}

hytale {
    useKotlin()
    useFlat()

    manifest {
        Group = "io.jayhart.hytale.obsceramalum"
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
        ServerVersion = "*"
        Dependencies = mapOf(
            "AmoAster:Kytale" to "*"
        )
        OptionalDependencies = emptyMap()
        DisabledByDefault = false
        IncludesAssetPack = true
        Main = "io.jayhart.hytale.obsceramalum.ObsceraMalum"
    }
}
