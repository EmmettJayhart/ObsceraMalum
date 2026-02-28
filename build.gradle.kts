plugins {
    id("com.gradleup.shadow") version "8.3.+"
}

val shade by configurations.creating
configurations.implementation.get().extendsFrom(shade)

dependencies {
    shade(kotlin("stdlib"))
}

tasks.jar {
    enabled = false
}

tasks.shadowJar {
    configurations = listOf(shade)
    archiveClassifier.set("")

    mergeServiceFiles()

    exclude("org/jetbrains/annotations/**")
    exclude("org/intellij/lang/**")

    relocate("kotlin.", "io.jayhart.hytale.obsceramalum.shaded.kotlin.")
    relocate("kotlinx.", "io.jayhart.hytale.obsceramalum.shaded.kotlinx.")
}

tasks.assemble {
    dependsOn(tasks.shadowJar)
}
