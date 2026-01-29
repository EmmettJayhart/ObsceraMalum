plugins {
    java
    kotlin("jvm")
    `java-library`
}

val kotlinVersion: String by project
val javaVersion: String by project
val modId: String by project
val modGroup: String by project
val modVersion: String by project
val modName: String by project
val modAuthor: String by project
val modAuthorEmail: String by project
val modAuthorUrl: String by project
val modUrl: String by project
val modDescription: String by project
val modMain: String by project
val hytaleVersion: String by project
val hykotlinVersion: String by project

group = modGroup
version = modVersion

dependencies {
    compileOnly("com.hypixel.hytale:Server:$hytaleVersion")
    implementation("dev.celestelove:hykotlin:$hykotlinVersion")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(javaVersion.toInt())
    }
}

kotlin {
    jvmToolchain(javaVersion.toInt())
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.release = javaVersion.toInt()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.fromTarget(javaVersion))
        freeCompilerArgs.add("-Xjsr305=strict")
    }
}

tasks.processResources {
    val properties = mapOf(
        "modVersion" to modVersion,
        "modId" to modId,
        "modGroup" to modGroup,
        "modName" to modName,
        "modDescription" to modDescription,
        "modAuthor" to modAuthor,
        "modAuthorEmail" to modAuthorEmail,
        "modAuthorUrl" to modAuthorUrl,
        "modUrl" to modUrl,
        "modMain" to modMain,
        "hytaleVersion" to hytaleVersion,
        "hykotlinVersion" to hykotlinVersion
    )
    inputs.properties(properties)
    filesMatching("manifest.json") {
        expand(properties)
    }
}

tasks.jar {
    archiveBaseName.set(modName.replace(" ", ""))
    archiveVersion.set(version.toString())

    manifest {
        attributes(
            "Implementation-Title" to modName,
            "Implementation-Version" to version,
            "Implementation-Vendor" to modAuthor,
            "Implementation-Vendor-Id" to modGroup,
            "Implementation-URL" to modUrl
        )
    }
}
