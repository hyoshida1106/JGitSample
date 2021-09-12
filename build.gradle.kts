plugins {
    kotlin("jvm") version "1.5.10"
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.eclipse.jgit:org.eclipse.jgit:5.12.0.202106070339-r")
    implementation("org.slf4j:slf4j-log4j12:1.7.32")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}