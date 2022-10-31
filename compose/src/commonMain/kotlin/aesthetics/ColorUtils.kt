package aesthetics

import androidx.compose.ui.graphics.Color as ComposeColor

inline fun Color?.toComposeColor(): ComposeColor = when (this) {
    null -> ComposeColor.Unspecified
    is RGBA -> ComposeColor(
        red = red.toFloat() / 255,
        green = green.toFloat() / 255,
        blue = blue.toFloat() / 255,
        alpha = alphaRatio
    )

    is HSL -> TODO()
}