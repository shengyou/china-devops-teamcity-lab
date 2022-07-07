import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kotestVersion: String by project
val spaceUsername: String? by project
val spacePassword: String? by project

plugins {
    kotlin("jvm") version "1.5.30"
    id("org.jmailen.kotlinter") version "3.6.0"
    id("io.gitlab.arturbosch.detekt") version "1.18.1"
    id("org.jetbrains.dokka") version "1.5.30"
    `maven-publish`
}

group = "io.kraftsman"
version = System.getenv("PACKAGE_VERSION") ?: "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
    testImplementation("io.kotest:kotest-property:$kotestVersion")

    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.18.1")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}
