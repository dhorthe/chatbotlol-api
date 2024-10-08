plugins {
	java
	id("org.springframework.boot") version "3.2.4"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "me.dhorthe"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

extra["springCloudVersion"] = "2023.0.0"

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.cloud:spring-cloud-starter-openfeign")
	implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.4.0")
	compileOnly("org.projectlombok:lombok:1.18.34")
	annotationProcessor("org.projectlombok:lombok:1.18.34")
	testCompileOnly("org.projectlombok:lombok:1.18.34")
	testAnnotationProcessor("org.projectlombok:lombok:1.18.34")
	implementation("ch.qos.logback:logback-core:1.4.14")
	implementation("ch.qos.logback:logback-classic:1.4.12")
	runtimeOnly("com.h2database:h2")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

dependencyManagement {
	imports {
		mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
