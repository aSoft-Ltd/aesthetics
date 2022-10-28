package aesthetics

import androidx.compose.ui.text.font.FontStyle as CFontStyle

inline fun FontStyle.toComposeFontStyle() = when (this) {
    FontStyle.Normal -> CFontStyle.Normal
    FontStyle.Italic -> CFontStyle.Italic
}