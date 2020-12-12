plugins {
    application
    idea
    eclipse
    java
    kotlin("jvm") version "1.4.10"
    id("net.researchgate.release") version "2.8.1"
    `maven-publish`
}

group = "com.nexterditigals.nextershop"
java {
    sourceCompatibility = JavaVersion.VERSION_14
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.google.protobuf:protobuf-java:3.14.0")
    implementation("io.grpc:grpc-kotlin-stub:0.2.1")
    implementation("io.grpc:grpc-stub:1.34.0")
    implementation("javax.annotation:javax.annotation-api:1.3.2")
}

sourceSets["main"].java {
    srcDir("src/main/grpc")
    srcDir("src/main/grpckt")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "14"
    }
}

val version: String by project
val projectVersion = version

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.nexterdigitals.nextershop"
            artifactId = "pb"
            version = projectVersion

            from(components["java"])
        }
    }
}
