package aesthetics

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.text.TextStyle as CTextStyle

typealias TStyle = TextStyle<TextUnit, FontFamily>

inline fun TStyle.toComposeTextStyle() = CTextStyle(
    color = color.toComposeColor(),
    fontSize = fontSize ?: TextUnit.Unspecified,
    fontWeight = fontWeight?.toComposeFontWeight(),
    fontStyle = fontStyle?.toComposeFontStyle(),
    fontSynthesis = null,
    fontFamily = fontFamily,
    fontFeatureSettings = null,
    letterSpacing = letterSpacing ?: TextUnit.Unspecified,
    baselineShift = null,
    textGeometricTransform = null,
    localeList = null,
    background = background.toComposeColor(),
    textDecoration = textDecoration?.toComposeTextDecoration(),
    shadow = shadow?.toComposeShadow(),
    textAlign = textAlign?.toComposeTextAlign(),
    textDirection = null,
    lineHeight = lineHeight ?: TextUnit.Unspecified,
    textIndent = null
).also {
    mapOf(
        "XS" to ExtraSmall, "VS" to VerySmall, "S" to Small, "SS" to SlightlySmall, "M" to Medium, "SL" to SlightlyLarge, "L" to Large, "VL" to VeryLarge, "XL" to ExtraLarge
    ).onEach {
        println("${it.key}\t${it.value.toEm()}")
    }.onEach {
        println("${it.key}\t${it.value.sp()}")
    }
}