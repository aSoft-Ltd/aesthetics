plugins {
    kotlin("multiplatform")
    id("tz.co.asoft.library")
}

description = "A platform agnostic color library"

kotlin {
    jvm { library() }
    if (Targeting.JS) js(IR) { library() }
    if (Targeting.WASM) wasm { library() }
    val iosTargets = if (Targeting.OSX) iosTargets() else listOf()
    val tvOsTargets = if (Targeting.OSX) tvOsTargets() else listOf()
    val macOsTargets = if (Targeting.OSX) macOsTargets() else listOf()
    val watchOsTargets = if (Targeting.OSX) watchOsTargets() else listOf()
    val osxTargets = iosTargets + tvOsTargets + macOsTargets + watchOsTargets
    val ndkTargets = if (Targeting.NDK) ndkTargets() else listOf()
    val linuxTargets = if (Targeting.LINUX) linuxTargets() else listOf()
    val mingwTargets = if (Targeting.MINGW) mingwTargets() else listOf()
    sourceSets {
        val commonTest by getting {
            dependencies {
                api(projects.kommanderCore)
            }
        }
    }
}
