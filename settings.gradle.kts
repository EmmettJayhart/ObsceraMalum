rootProject.name = (extra["modName"] as String).replace(" ", "")

pluginManagement {
    plugins {
        kotlin("jvm") version extra["kotlinVersion"].toString()
    }
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven("https://maven.hytale.com/release") {
            name = "hytale-release"
        }
        maven("https://maven.hytale.com/pre-release") {
            name = "hytale-pre-release"
        }
        maven("https://maven.eufonia.studio/public") {
            name = "eufoniaMavenPublic"
        }
    }
}
