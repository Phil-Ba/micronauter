import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "at.bayava"
version = "1.0-SNAPSHOT"
val kotlinVersion = "1.3.10"
val micronautVersion = "1.0.4"
val micronautTestVersion = "1.0.2"

plugins {
    java
    kotlin("jvm") version "1.3.21"
    kotlin("kapt") version "1.3.21"
//    id("org.jetbrains.kotlin.plugin.allopen") version "1.3.21"
//     kotlin("allopen") version "1.3.21"
//    kotlin("org.jetbrains.kotlin.plugin.allopen") version "1.3.21"
    idea
}

idea {
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
    }
}

repositories {
    mavenLocal()
    mavenCentral()
    maven("https://jitpack.io")
}
//allOpen {
//    annotation("io.micronaut.test.annotation.MicronautTest")
//    annotation("javax.inject.Singleton")
//    annotation("javax.inject.*")
//}

kapt {
    correctErrorTypes = true
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
    javaParameters = true
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
    javaParameters = true
}

dependencies {

    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))

    implementation(platform("io.micronaut:micronaut-bom:$micronautVersion"))
    implementation("io.micronaut:micronaut-inject")
    implementation("io.micronaut:micronaut-core")
    implementation("io.micronaut:micronaut-runtime")

    annotationProcessor("io.micronaut:micronaut-inject-java")
    kapt("io.micronaut:micronaut-inject-java")

    kaptTest("io.micronaut:micronaut-inject-java")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.4.0")
//    testImplementation("io.micronaut:micronaut-inject")
    testImplementation("org.mockito:mockito-junit-jupiter:2.22.0")
    testImplementation("io.micronaut.test:micronaut-test-junit5:$micronautTestVersion")
}