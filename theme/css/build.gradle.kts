plugins {
    kotlin("multiplatform")
    id(asoft.plugins.library.get().pluginId)
    id(codearte.plugins.nexus.staging.get().pluginId)
    signing
}

kotlin {
    jvm { library() }
    js(IR) { library() }
    iosTargets(true)

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":theme-core"))
                api(project(":color-css"))
                api(kotlinx.coroutines.core)
            }
        }
    }
}

aSoftOSSLibrary(
    version = asoft.versions.aesthetics.get(),
    description = "A platform/framework agnostic theme engine that use css"
)