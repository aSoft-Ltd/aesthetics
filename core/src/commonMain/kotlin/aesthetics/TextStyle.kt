@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package aesthetics

import kotlin.js.JsExport

data class TextStyle(
    val color: Color = Unspecified,
    val fontSize: Size? = null,
    val fontWeight: FontWeight? = null,
    val fontStyle: FontStyle? = null,
    val fontFamily: String? = null,
    val background: Color = Unspecified,
    val textDecoration: TextDecoration? = null,
    val letterSpacing: Size? = null,
    val shadow: Shadow? = null,
    val textAlign: TextAlign? = null,
    val lineHeight: Size? = null,
) {
    inline fun mergeWith(other: TextStyle) = TextStyle(
        color = if (color.isSpecified) color else other.color,
        fontSize = fontSize ?: other.fontSize,
        fontWeight = fontWeight ?: other.fontWeight,
        fontStyle = fontStyle ?: other.fontStyle,
        fontFamily = fontFamily ?: other.fontFamily,
        background = if (background.isSpecified) background else other.background,
        textDecoration = textDecoration ?: textDecoration,
        letterSpacing = letterSpacing ?: other.letterSpacing,
        shadow = shadow ?: other.shadow,
        textAlign = textAlign ?: other.textAlign,
        lineHeight = lineHeight ?: other.lineHeight
    )
}