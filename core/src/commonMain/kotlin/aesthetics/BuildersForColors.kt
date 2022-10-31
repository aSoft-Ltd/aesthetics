@file:JsExport @file:Suppress("NON_EXPORTABLE_TYPE")

package aesthetics

import aesthetics.internal.RGBAImpl
import kotlin.js.JsExport
import kotlin.js.JsName

@JsName("rgb")
fun RGB(red: Int, green: Int, blue: Int): RGB = RGBAImpl(red, green, blue, 1f)

/**
 * Format: rgba (alpha at the end)
 * #ff134467
 *  ^ ^ ^ ^
 *  r g b a
 */
@JsName("_ignore_colorFromHex2")
fun Color(hex: Long): Color {
    val hexInString = hex.toString(16)
    val purifiedInput = hexInString.padStart(6, '0').padEnd(8, 'F')

    val red = purifiedInput.substring(0..1).toIntOrNull(16) ?: throw IllegalArgumentException()
    val green = purifiedInput.substring(2..3).toIntOrNull(16) ?: throw IllegalArgumentException()
    val blue = purifiedInput.substring(4..5).toIntOrNull(16) ?: throw IllegalArgumentException()
    val alpha = purifiedInput.substring(6..7).toIntOrNull(16) ?: throw IllegalArgumentException()
    return RGBA(red, green, blue, alpha.toFloat() / 255)
}

@JsName("color")
fun Color(hexString: String): Color = Color(hexString.removePrefix("#").toLong(16))

@JsName("colorOf")
fun Color(hex: Int): Color = Color(hex.toLong())

@JsName("_ignore_rgba")
fun RGBA(red: Int, green: Int, blue: Int, alpha: Double): RGBA = RGBAImpl(red, green, blue, alpha.toFloat())

@JsName("rgba")
fun RGBA(red: Int, green: Int, blue: Int, alpha: Float): RGBA = RGBAImpl(red, green, blue, alpha)