import org.jetbrains.kotlin.gradle.dsl.KotlinCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

kotlin {
    android()
    jvm()
    if(Targeting.JS) js(IR) { browser() }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.ui)
                api(compose.foundation)
                api(projects.aestheticsCore)
            }
        }

        val androidMain by getting {
            dependencies {
                api(compose.foundation)
                api(compose.uiTooling)
                api(compose.preview)
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

android {
    compileSdk = 32

    namespace = "tz.co.asoft.aesthetics.compose"

    defaultConfig {
        minSdk = 21
        targetSdk = 31
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        buildConfig = false
        compose = true
    }

    sourceSets {
        getByName("main") {
            manifest.srcFile("src/androidMain/AndroidManifest.xml")
//            res.srcDirs("src/androidMain/res", "src/commonMain/resources")
//        }
        }
    }
}

compose {
    kotlinCompilerPlugin.set(kotlinz.versions.compose.compiler)
    kotlinCompilerPluginArgs.add(kotlinz.versions.kotlin.map {
        "suppressKotlinVersionCompatibilityCheck=$it"
    })
}

tasks.withType(KotlinJsCompile::class).configureEach {
    kotlinOptions {
        val v = kotlinz.versions.kotlin.get()
        freeCompilerArgs += listOf(
            "-P", "plugin:androidx.compose.compiler.plugins.kotlin:suppressKotlinVersionCompatibilityCheck=$v"
        )
    }
}