@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package aesthetics

import kotlin.js.JsExport
import kotlin.js.JsName

data class Typography(
    val h1: TextStyle,
    val h2: TextStyle,
    val h3: TextStyle,
    val h4: TextStyle,
    val h5: TextStyle,
    val h6: TextStyle,
    val subtitle1: TextStyle,
    val subtitle2: TextStyle,
    val body1: TextStyle,
    val body2: TextStyle,
    val button: TextStyle,
    val caption: TextStyle,
    val overline: TextStyle
) {
    @JsName("from")
    constructor(
        defaultFontFamily: String? = null,
        h1: TextStyle = TextStyle(
            fontWeight = Light,
            fontSize = lerp(SlightlyLarge, ExtraLarge, 1f),
            fontFamily = defaultFontFamily,
//            letterSpacing = (-1.5).sp
        ),
        h2: TextStyle = TextStyle(
            fontWeight = Light,
            fontSize = lerp(SlightlyLarge, ExtraLarge, 0.8f),
            fontFamily = defaultFontFamily,
//            letterSpacing = (-0.5).sp
        ),
        h3: TextStyle = TextStyle(
            fontWeight = SlightlyLight,
            fontSize = lerp(SlightlyLarge, ExtraLarge, 0.6f),
            fontFamily = defaultFontFamily,
//            letterSpacing = 0.sp
        ),
        h4: TextStyle = TextStyle(
            fontWeight = SlightlyLight,
            fontSize = lerp(SlightlyLarge, ExtraLarge, 0.4f),
            fontFamily = defaultFontFamily,
//            letterSpacing = 0.25.sp
        ),
        h5: TextStyle = TextStyle(
            fontWeight = SlightlyLight,
            fontSize = lerp(SlightlyLarge, ExtraLarge, 0.2f),
            fontFamily = defaultFontFamily,
//            letterSpacing = 0.sp
        ),
        h6: TextStyle = TextStyle(
            fontWeight = Normal,
            fontSize = lerp(SlightlyLarge, ExtraLarge, 0f),
            fontFamily = defaultFontFamily,
//            letterSpacing = 0.15.sp
        ),
        subtitle1: TextStyle = TextStyle(
            fontWeight = Normal,
            fontSize = Medium,
            fontFamily = defaultFontFamily,
//            letterSpacing = 0.15.sp
        ),
        subtitle2: TextStyle = TextStyle(
            fontWeight = Normal,
            fontSize = SlightlySmall,
            fontFamily = defaultFontFamily,
//            letterSpacing = 0.1.sp
        ),
        body1: TextStyle = TextStyle(
            fontWeight = Normal,
            fontSize = Medium,
            fontFamily = defaultFontFamily,
//            letterSpacing = 0.5.sp
        ),
        body2: TextStyle = TextStyle(
            fontWeight = Normal,
            fontSize = SlightlySmall,
            fontFamily = defaultFontFamily,
//            letterSpacing = 0.25.sp
        ),
        button: TextStyle = TextStyle(
            fontWeight = SlightlyBold,
            fontSize = SlightlySmall,
            fontFamily = defaultFontFamily,
//            letterSpacing = 1.25.sp
        ),
        caption: TextStyle = TextStyle(
            fontWeight = Normal,
            fontSize = SlightlySmall,
            fontFamily = defaultFontFamily,
//            letterSpacing = 0.4.sp
        ),
        overline: TextStyle = TextStyle(
            fontWeight = Normal,
            fontSize = Small,
            fontFamily = defaultFontFamily,
//            letterSpacing = 1.5.sp
        )
    ) : this(h1, h2, h3, h4, h5, h6, subtitle1, subtitle2, body1, body2, button, caption, overline)
}