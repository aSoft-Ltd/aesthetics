package aesthetics

import androidx.compose.ui.geometry.Offset as COffset

inline fun Offset.toComposeOffset() = COffset(x, y)