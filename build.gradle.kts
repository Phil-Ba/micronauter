import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "at.bayava"
version = "1.0-SNAPSHOT"
val kotlinVersion = "1.3.10"
val micronautVersion = "1.0.3"
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
//configure<JavaPluginConvention> {
//    sourceCompatibility = JavaVersion.VERSION_1_8
//}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
//    compile(kotlin("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"))
//    compile(kotlin("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion"))
    implementation("io.micronaut:micronaut-inject:$micronautVersion")

    annotationProcessor("io.micronaut:micronaut-inject-java:$micronautVersion")
    kapt("io.micronaut:micronaut-inject-java:$micronautVersion")

    kaptTest("io.micronaut:micronaut-inject-java:$micronautVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.4.0")
    testImplementation("io.micronaut:micronaut-inject:$micronautVersion")
    testImplementation("org.mockito:mockito-junit-jupiter:2.22.0")
    testImplementation("io.micronaut.test:micronaut-test-junit5:$micronautTestVersion")
}
