@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package aesthetics

import aesthetics.internal.RGBAImpl
import kotlin.js.JsExport
import kotlin.js.JsName

@JsName("rgb")
fun RGB(red: Int, green: Int, blue: Int): RGB = RGBAImpl(red, green, blue, 1.0)

@JsName("rgbFromHex")
fun RGB(hex: Int): RGB = TODO()

@JsName("rgba")
fun RGBA(red: Int, green: Int, blue: Int, alpha: Double): RGBA = RGBAImpl(red, green, blue, alpha)

@JsName("rgbaFromHex")
fun RGBA(hex: Int): RGBA = TODO()