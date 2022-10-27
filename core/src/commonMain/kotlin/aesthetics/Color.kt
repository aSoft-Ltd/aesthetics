@file:JsExport

package aesthetics

import kotlin.js.JsExport

sealed interface Color {
    val isUnspecified get() = this is Unspecified
    val isSpecified get() = !isUnspecified
}

sealed interface Alpha {
    val alphaRatio: Double
    val alphaPct: Int get() = (alphaRatio * 100).toInt()
}

sealed interface RGB : Color {
    val red: Int
    val green: Int
    val blue: Int
}

interface RGBA : RGB, Alpha

interface HSL : Color {
    val hue: Int
    val saturation: Int
    val lightness: Int
}

interface HSLA : HSL, Alpha