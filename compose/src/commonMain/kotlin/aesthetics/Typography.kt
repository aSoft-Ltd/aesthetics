package aesthetics

import androidx.compose.ui.unit.sp

data class Typography(
    val h1: TStyle,
    val h2: TStyle,
    val h3: TStyle,
    val h4: TStyle,
    val h5: TStyle,
    val h6: TStyle,
    val subtitle1: TStyle,
    val subtitle2: TStyle,
    val text: TStyle,
    val body1: TStyle,
    val body2: TStyle,
    val button: TStyle,
    val caption: TStyle,
    val overline: TStyle,
) {
    constructor(
        default: TStyle? = null,
        h1: TStyle = TStyle(
            fontWeight = Light,
            fontSize = 96.sp,
            letterSpacing = (-1.5).sp,
        ),
        h2: TStyle = TStyle(
            fontWeight = Light,
            fontSize = 60.sp,
            letterSpacing = (-0.5).sp
        ),
        h3: TStyle = TStyle(
            fontWeight = SlightlyLight,
            fontSize = 48.sp,
            letterSpacing = 0.sp
        ),
        h4: TStyle = TStyle(
            fontWeight = SlightlyLight,
            fontSize = 34.sp,
            letterSpacing = 0.25.sp
        ),
        h5: TStyle = TStyle(
            fontWeight = SlightlyLight,
            fontSize = 24.sp,
            letterSpacing = 0.sp
        ),
        h6: TStyle = TStyle(
            fontWeight = Normal,
            fontSize = 20.sp,
            letterSpacing = 0.15.sp
        ),
        subtitle1: TStyle = TStyle(
            fontWeight = SlightlyLight,
            fontSize = 16.sp,
            letterSpacing = 0.15.sp
        ),
        subtitle2: TStyle = TStyle(
            fontWeight = Normal,
            fontSize = 14.sp,
            letterSpacing = 0.1.sp
        ),
        text: TStyle = TStyle(
            fontWeight = SlightlyLight,
            fontSize = 16.sp,
            letterSpacing = 0.5.sp
        ),
        body1: TStyle = TStyle(
            fontWeight = SlightlyLight,
            fontSize = 16.sp,
            letterSpacing = 0.5.sp
        ),
        body2: TStyle = TStyle(
            fontWeight = SlightlyLight,
            fontSize = 14.sp,
            letterSpacing = 0.25.sp
        ),
        button: TStyle = TStyle(
            fontWeight = Normal,
            fontSize = 14.sp,
            letterSpacing = 1.25.sp
        ),
        caption: TStyle = TStyle(
            fontWeight = SlightlyLight,
            fontSize = 12.sp,
            letterSpacing = 0.4.sp
        ),
        overline: TStyle = TStyle(
            fontWeight = SlightlyLight,
            fontSize = 10.sp,
            letterSpacing = 1.5.sp
        )
    ) : this(
        h1 = h1.mergeWith(default),
        h2 = h2.mergeWith(default),
        h3 = h3.mergeWith(default),
        h4 = h4.mergeWith(default),
        h5 = h5.mergeWith(default),
        h6 = h6.mergeWith(default),
        subtitle1 = subtitle1.mergeWith(default),
        subtitle2 = subtitle2.mergeWith(default),
        text = text.mergeWith(default),
        body1 = body1.mergeWith(default),
        body2 = body2.mergeWith(default),
        button = button.mergeWith(default),
        caption = caption.mergeWith(default),
        overline = overline.mergeWith(default),
    )
}