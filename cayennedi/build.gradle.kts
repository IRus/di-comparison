plugins {
    java
    application
}

application {
    mainClass.set("io.heapy.cayenne.Main")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))

    implementation("org.apache.cayenne:cayenne-di:4.1.RC2")
}
