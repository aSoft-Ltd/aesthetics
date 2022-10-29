@file:JsExport

package aesthetics

import kotlin.js.JsExport
import kotlin.js.JsName

sealed interface Size : Spectrum

inline val ExtraSmall: Size get() = S100

inline val VerySmall: Size get() = S200

inline val Small: Size get() = S300

inline val SlightlySmall: Size get() = S400

inline val Medium: Size get() = S500

inline val SlightlyLarge: Size get() = S600

inline val Large: Size get() = S700

inline val VeryLarge: Size get() = S800

inline val ExtraLarge: Size get() = S900

@JsName("sizeOf")
fun Size(value: Int): Size = SpectrumImpl(value)

@JsName("lerpSize")
fun lerp(start: Size, stop: Size, fraction: Float): Size = SpectrumImpl(
    lerp(start.value, stop.value, fraction)
)