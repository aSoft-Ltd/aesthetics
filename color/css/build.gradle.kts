plugins {
    kotlin("multiplatform")
    id(asoft.plugins.library.get().pluginId)
    id(codearte.plugins.nexus.staging.get().pluginId)
    signing
}

kotlin {
    jvm { library() }
    js(IR) { library() }
//    iosTargets(true)
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":color-core"))
                api(kotlinw.css)
            }
        }
        val commonTest by getting {
            dependencies { api(asoft.expect.core) }
        }
    }
}

aSoftOSSLibrary(
    version = asoft.versions.aesthetics.get(),
    description = "A platform agnostic color library for css"
)
