plugins {
	java
	id("org.springframework.boot") version "3.2.3"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "io.github.aniokrait"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_21
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

configure<SourceSetContainer> {
	val activeProfile = if (project.hasProperty("profile")) project.property("profile") as String else "dev"
	named("main") {
		resources.srcDirs("src/profile/$activeProfile")
	}
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

	// add for ReaderInputStream
	implementation("commons-io:commons-io:2.15.1")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
