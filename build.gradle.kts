plugins {
    id("application") //change java for application
}

java {
    toolchain{
        languageVersion = JavaLanguageVersion.of(17) //tell the version is going to run on
    }
}

//deleted what was here (group & version) because now is in glade.properties that we created as a new file in shuffler

application {
    mainClass.set(project.property("mainClass") as String)
}


tasks.jar {
    manifest {
        attributes.set("Main-Class", project.property("mainClass") as String)
    }
}
repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}