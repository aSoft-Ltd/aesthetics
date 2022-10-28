package aesthetics

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.text.TextStyle as CTextStyle

inline fun TextStyle.toComposeTextStyle(
    normalSpEquivalent: TextUnit = DEFAULT_SP_NORMAL_EQUIVALENT,
    fontFamilyTransformer: (String) -> FontFamily = { FontFamily.Default }
) = CTextStyle(
    color = color.toComposeColor(),
    fontSize = fontSize?.toSp(normalSpEquivalent) ?: TextUnit.Unspecified,
    fontWeight = fontWeight?.toComposeFontWeight(),
    fontStyle = fontStyle?.toComposeFontStyle(),
    fontSynthesis = null,
    fontFamily = fontFamily?.let(fontFamilyTransformer),
    fontFeatureSettings = null,
    letterSpacing = letterSpacing?.toSp(normalSpEquivalent) ?: TextUnit.Unspecified,
    baselineShift = null,
    textGeometricTransform = null,
    localeList = null,
    background = background.toComposeColor(),
    textDecoration = textDecoration?.toComposeTextDecoration(),
    shadow = shadow?.toComposeShadow(),
    textAlign = textAlign?.toComposeTextAlign(),
    textDirection = null,
    lineHeight = lineHeight?.toSp(normalSpEquivalent) ?: TextUnit.Unspecified,
    textIndent = null
)