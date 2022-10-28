package aesthetics

import androidx.compose.ui.text.style.TextAlign as CTextAlign

inline fun TextAlign.toComposeTextAlign() = when (this) {
    Left -> CTextAlign.Left
    Start -> CTextAlign.Start
    Center -> CTextAlign.Center
    Justify -> CTextAlign.Justify
    End -> CTextAlign.End
    Right -> CTextAlign.Right
}