@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package aesthetics

import kotlin.js.JsExport
import kotlin.js.JsName

data class TextStyle<S : Any, F : Any>(
    val color: Color? = null,
    val fontSize: S? = null,
    val fontWeight: FontWeight? = null,
    val fontStyle: FontStyle? = null,
    val fontFamily: F? = null,
    val background: Color? = null,
    val textDecoration: TextDecoration? = null,
    val letterSpacing: S? = null,
    val shadow: Shadow? = null,
    val textAlign: TextAlign? = null,
    val lineHeight: S? = null,
) {
    inline fun mergeWith(other: TextStyle<S, F>?) = if (other == null) this else TextStyle(
        color = color ?: other.color,
        fontSize = fontSize ?: other.fontSize,
        fontWeight = fontWeight ?: other.fontWeight,
        fontStyle = fontStyle ?: other.fontStyle,
        fontFamily = fontFamily ?: other.fontFamily,
        background = background ?: other.background,
        textDecoration = textDecoration ?: textDecoration,
        letterSpacing = letterSpacing ?: other.letterSpacing,
        shadow = shadow ?: other.shadow,
        textAlign = textAlign ?: other.textAlign,
        lineHeight = lineHeight ?: other.lineHeight
    )

    fun <SO : Any> with(fontSize: SO? = null, letterSpacing: SO? = null, lineHeight: SO? = null) = TextStyle(
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontStyle = fontStyle,
        fontFamily = fontFamily,
        background = background,
        textDecoration = textDecoration,
        letterSpacing = letterSpacing,
        shadow = shadow,
        textAlign = textAlign,
        lineHeight = lineHeight,
    )

    @JsName("withFontFamily")
    fun <FO : Any> with(fontFamily: FO) = TextStyle(
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontStyle = fontStyle,
        fontFamily = fontFamily,
        background = background,
        textDecoration = textDecoration,
        letterSpacing = letterSpacing,
        shadow = shadow,
        textAlign = textAlign,
        lineHeight = lineHeight,
    )
}