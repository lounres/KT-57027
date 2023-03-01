@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    kotlin("jvm")
}

kotlin {
    @Suppress("UNUSED_VARIABLE")
    sourceSets {
        val main by getting {
            dependencies {
                implementation(kotlin("test"))
                with(rootProject.libs.kotest) {
                    implementation(framework.engine)
                    implementation(framework.datatest)
                    implementation(assertions.core)
                    implementation(property)
                }
            }
        }
    }
}