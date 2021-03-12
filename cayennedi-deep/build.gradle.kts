plugins {
    java
    application
}

application {
    mainClass.set("org.objectstyle.cayenne.Main")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common-deep"))

    implementation("org.apache.cayenne:cayenne-di:4.1.RC2")
}