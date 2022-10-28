@file:JsExport

package aesthetics

import kotlin.js.JsExport
import kotlin.js.JsName

sealed interface Size : Spectrum

val ExtraSmall: Size = S100

val VerySmall: Size = S200

val Small: Size = S300

val SlightlySmall: Size = S400

val Medium: Size = S500

val SlightlyLarge: Size = S600

val Large: Size = S700

val VeryLarge: Size = S800

val ExtraLarge: Size = S900

@JsName("sizeOf")
fun Size(value: Int): Size = SpectrumImpl(value)

@JsName("lerpSize")
fun lerp(start: Size, stop: Size, fraction: Float): Size = SpectrumImpl(
    lerp(start.value, stop.value, fraction)
)