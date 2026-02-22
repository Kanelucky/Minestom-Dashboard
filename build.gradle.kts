plugins {
    kotlin("jvm") version "2.3.0"
}

group = "org.kanelucky"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("net.minestom:minestom:2026.02.19-1.21.11")
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("com.formdev:flatlaf:3.4")
}

tasks.test {
    useJUnitPlatform()
}