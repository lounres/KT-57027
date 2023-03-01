@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    kotlin("jvm")
}

kotlin {
    @Suppress("UNUSED_VARIABLE")
    sourceSets {
        val test by getting {
            dependencies {
                implementation(kotlin("test"))
//                implementation(projects.lib) // Uncomment to get error
                with(rootProject.libs.kotest) {
                    implementation(framework.engine)
                    implementation(framework.datatest)
                    implementation(assertions.core)
                    implementation(property)
                    implementation(runner.junit5)
                }
            }
        }
    }
}

tasks.test {
    useJUnitPlatform()
}