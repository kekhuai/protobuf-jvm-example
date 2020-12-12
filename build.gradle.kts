val version: String by project
val projectVersion = version
val usr: String by project
val pwd: String by project
val protobufJavaVersion = "3.14.0"
val grpcKotlinStubVersion = "0.2.1"
val grpcStubVersion = "1.34.0"
val javaxAnnotationApiVersion = "1.3.2"

plugins {
    application
    idea
    eclipse
    java
    kotlin("jvm") version "1.4.10"
    id("net.researchgate.release") version "2.8.1"
    `maven-publish`
}

group = "com.nexterditigal.nextershop"
java {
    sourceCompatibility = JavaVersion.VERSION_14
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.google.protobuf:protobuf-java:$protobufJavaVersion")
    implementation("io.grpc:grpc-kotlin-stub:$grpcKotlinStubVersion")
    implementation("io.grpc:grpc-stub:$grpcStubVersion")
    implementation("javax.annotation:javax.annotation-api:$javaxAnnotationApiVersion")
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

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.nexterdigital.nextershop"
            artifactId = "pb"
            version = projectVersion

            from(components["java"])
        }
    }
    repositories {
        maven {
            credentials {
                username = usr
                password = pwd
            }

            url = uri("https://repo.repsy.io/mvn/kekhuay/nexterdigital")
        }
    }
}
