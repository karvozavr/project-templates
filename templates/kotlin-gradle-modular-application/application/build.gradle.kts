plugins {
    application
}

group = "com.github.karvozavr.canvas"
version = "1.0-SNAPSHOT"

dependencies {
    // kotlin
    implementation(Libs.kotlin_jdk8)
    implementation(Libs.kotlin_reflect)
    implementation(Libs.kotlin_stdlib)

    // arrow
    implementation(Libs.arrow)

    // test
    testImplementation(Libs.kotest_junit)
    testImplementation(Libs.kotest_arrow)
    testImplementation(Libs.junit_engine)
    testImplementation(Libs.junit_params)
}

application {
    mainClassName = "MainKt"
}