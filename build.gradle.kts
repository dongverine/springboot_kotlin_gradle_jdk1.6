import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "1.5.22.RELEASE"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    war
    kotlin("jvm") version "1.4.32"
    kotlin("plugin.spring") version "1.4.32"
}

group = "com.dongverine"
version = "1"
java.sourceCompatibility = JavaVersion.VERSION_1_6

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    {
        exclude(group = "org.springframework.boot", module = "spring-boot-starter-tomcat")
    }
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//    developmentOnly("org.springframework.boot:spring-boot-devtools")
    //--tocmat for jdk1.6 start
    implementation("org.apache.tomcat.embed:tomcat-embed-core:7.0.108")
    implementation("org.apache.tomcat.embed:tomcat-embed-el:7.0.108")
    implementation("org.apache.tomcat.embed:tomcat-embed-logging-juli:7.0.52")
    implementation("org.apache.tomcat:tomcat-annotations-api:7.0.108")
    //---tocmat for jdk1.6 end
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.6"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

