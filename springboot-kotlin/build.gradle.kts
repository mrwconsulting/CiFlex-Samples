import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
  dependencies {
    classpath("com.dipien:semantic-version-gradle-plugin:2.0.0")
  }
}

plugins {
	id("jacoco")
    id("org.springframework.boot") version "3.2.5"
    id("io.spring.dependency-management") version "1.1.4"
    id("org.jetbrains.kotlin.jvm") version "1.9.22"
    id("org.jetbrains.kotlin.plugin.spring") version "1.9.22"
    id("com.google.cloud.tools.jib") version "3.4.2"
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

jacoco {
    toolVersion = "0.8.12"
    reportsDirectory = layout.buildDirectory.dir("reports/jacoco")
}

jib {
  from { 
    image = "amazoncorretto:21-alpine-jdk" 
  } 
  to { 
    image = "springboot-kotlin"
  }
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.jacocoTestReport {
    reports {
        xml.required = true
        html.required = false
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "21"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
    finalizedBy(tasks.jacocoTestReport)
}
tasks.jacocoTestReport {
    dependsOn(tasks.test)
}

version = "1.0.0"
group = "mrwconsulting"
apply(plugin = "com.dipien.semantic-version")