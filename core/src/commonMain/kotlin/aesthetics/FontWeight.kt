@file:JsExport

package aesthetics

import kotlin.js.JsExport
import kotlin.js.JsName

sealed interface FontWeight : Spectrum

val ExtraLight: FontWeight = S100

val VeryLight: FontWeight = S200

val Light: FontWeight = S300

val SlightlyLight: FontWeight = S400

/**
 * F500
 */
val Normal: FontWeight = S500

/**
 * F500
 */
val Regular: FontWeight = S500

val SlightlyBold: FontWeight = S600

val Bold: FontWeight = S700

val VeryBold: FontWeight = S800

val ExtraBold: FontWeight = S900

@JsName("fontWeightOf")
fun FontWeight(value: Int): FontWeight = SpectrumImpl(value)

@JsName("lerpFontWeight")
fun lerp(start: FontWeight, stop: FontWeight, fraction: Float): FontWeight = SpectrumImpl(
    lerp(start.value, stop.value, fraction)
)