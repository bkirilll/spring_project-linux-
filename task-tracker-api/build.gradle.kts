plugins {
    id("java")
    id("io.spring.dependency-management") version "1.1.3"
    id("org.springframework.boot") version "3.1.4"
}

group = "org.ywojctb"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

//Spring
dependencies {
    implementation("org.springframework.boot", "spring-boot-starter-web")
    implementation("org.springframework.boot", "spring-boot-starter-data-jpa")
}

//Other
dependencies {
    implementation("org.postgresql", "postgresql","42.2.19")
}

//Lombok
dependencies {
    compileOnly ("org.projectlombok:lombok:1.18.30")
    annotationProcessor ("org.projectlombok:lombok:1.18.30")

    testCompileOnly ("org.projectlombok:lombok:1.18.30")
    testAnnotationProcessor ("org.projectlombok:lombok:1.18.30")
}

//Test
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}