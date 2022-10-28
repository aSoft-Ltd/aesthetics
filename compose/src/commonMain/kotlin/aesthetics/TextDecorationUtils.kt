package aesthetics

import androidx.compose.ui.text.style.TextDecoration as CTextDecoration

inline fun TextDecoration.toComposeTextDecoration() = when (this) {
    Node -> CTextDecoration.None
    StrikeThrough -> CTextDecoration.LineThrough
    Underline -> CTextDecoration.Underline
}