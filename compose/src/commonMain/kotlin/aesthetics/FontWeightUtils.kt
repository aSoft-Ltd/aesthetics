package aesthetics

import androidx.compose.ui.text.font.FontWeight as CFontWeight

inline fun FontWeight.toComposeFontWeight() = CFontWeight(value)