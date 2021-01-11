plugins {
    java
    application
}

application {
    mainClass.set("org.objectstyle.guice.Main")
}

repositories {
    jcenter()
}

dependencies {
    implementation(project(":common"))

    implementation("com.google.inject:guice:5.0.0-BETA-1")
}
