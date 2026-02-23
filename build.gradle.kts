plugins {
    kotlin("jvm") version "2.3.0"
    `maven-publish`
}

group = "org.kanelucky"
version = "0.1.2"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    compileOnly("net.minestom:minestom:2026.02.19-1.21.11")
    compileOnly("ch.qos.logback:logback-classic:1.5.24")
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("com.formdev:flatlaf:3.4")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}

tasks.test {
    useJUnitPlatform()
}