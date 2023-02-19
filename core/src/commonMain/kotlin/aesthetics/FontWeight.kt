@file:JsExport

package aesthetics

import kotlin.js.JsExport
import kotlin.js.JsName

sealed interface FontWeight : Spectrum

/**
 * Also dubbed as [ExtraLight]
 */
inline val W100: FontWeight get() = S100

/**
 * Also dubbed as [VeryLight]
 */
inline val W200: FontWeight get() = S200

/**
 * Also dubbed as [Light]
 */
inline val W300: FontWeight get() = S300

/**
 * Also dubbed as [SlightlyLight]
 */
inline val W400: FontWeight get() = S400

/**
 * Also dubbed as [Normal]/[Regular]
 */
inline val W500: FontWeight get() = S500

/**
 * Also dubbed as [SlightlyBold]
 */
inline val W600: FontWeight get() = S600

/**
 * Also dubbed as [Bold]
 */
inline val W700: FontWeight get() = S700

/**
 * Also dubbed as [VeryBold]
 */
inline val W800: FontWeight get() = S800

/**
 * Also dubbed as [ExtraBold]
 */
inline val W900: FontWeight get() = S900

// -------------------------------- aliases ---------------------------------------
/**
 * Alias for [W100]
 */
inline val ExtraLight: FontWeight get() = S100

/**
 * Alias [W200]
 */
inline val VeryLight: FontWeight get() = S200

/**
 * Alias for [W300]
 */
inline val Light: FontWeight get() = S300

/**
 * Alias for [W400]
 */
inline val SlightlyLight: FontWeight get() = S400

/**
 * Alias for [W500]
 * Also called [Regular]
 */
inline val Normal: FontWeight get() = S500

/**
 * Alias for [W500]
 * Also called [Normal]
 */
inline val Regular: FontWeight get() = S500

/**
 * Alias for [W600]
 */
inline val SlightlyBold: FontWeight get() = S600

/**
 * Alias for [W700]
 */
inline val Bold: FontWeight get() = S700

/**
 * Alias for [W800]
 */
inline val VeryBold: FontWeight get() = S800

/**
 * Alias for [W900]
 */
inline val ExtraBold: FontWeight get() = S900

@JsName("fontWeightOf")
inline fun FontWeight(value: Int): FontWeight = SpectrumImpl(value)

@JsName("lerpFontWeight")
inline fun lerp(start: FontWeight, stop: FontWeight, fraction: Float): FontWeight = SpectrumImpl(
    lerp(start.value, stop.value, fraction)
)