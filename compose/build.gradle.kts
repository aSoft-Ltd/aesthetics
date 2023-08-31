import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

kotlin {
    if (Targeting.JVM) jvm { targetJava() }
    if (Targeting.JS) js(IR) { browser() }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.ui)
                api(compose.foundation)
                api(projects.aestheticsCore)
            }
        }

        val jvmMain by getting {
            dependencies {
                api(compose.uiTooling)
                api(compose.preview)
                api(compose.desktop.currentOs)
            }
        }
    }
}

compose {
    kotlinCompilerPlugin.set(kotlinz.versions.compose.compiler)
    kotlinCompilerPluginArgs.add(kotlinz.versions.kotlin.map {
        "suppressKotlinVersionCompatibilityCheck=$it"
    })
}