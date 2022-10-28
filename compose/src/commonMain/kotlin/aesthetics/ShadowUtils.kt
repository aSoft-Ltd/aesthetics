package aesthetics

import androidx.compose.ui.graphics.Shadow as CShadow

inline fun Shadow.toComposeShadow() = CShadow(
    color = color.toComposeColor(),
    offset = offset.toComposeOffset(),
    blurRadius = blurRadius
)