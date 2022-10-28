package aesthetics

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import java.lang.IllegalArgumentException

@PublishedApi
internal val DEFAULT_DP_NORMAL_EQUIVALENT: Dp = 8.dp

inline fun Size.toDp(normalEquivalent: Dp = DEFAULT_DP_NORMAL_EQUIVALENT): Dp = (normalEquivalent * value) / Medium.value

inline fun Size.toDp(transformer: (Size) -> Dp): Dp = transformer(this)

@PublishedApi
internal val DEFAULT_SP_NORMAL_EQUIVALENT: TextUnit = 16.sp

// (normalEquivalent * value) / Medium.value
// 96,60,48,34,24,20 || 16
//inline fun Size.toSp(normalEquivalent: TextUnit = DEFAULT_SP_NORMAL_EQUIVALENT): TextUnit = (normalEquivalent * value) / Medium.value

inline fun Size.toSp(normalEquivalent: TextUnit = DEFAULT_SP_NORMAL_EQUIVALENT): TextUnit = when (value) {
    in 1..100 -> 8.sp
    in 101..200 -> 10.sp
    in 201..300 -> 12.sp
    in 301..400 -> 16.sp
    in 401..500 -> 20.sp
    in 501..600 -> 24.sp
    in 601..700 -> 34.sp
    in 701..800 -> 48.sp
    in 801..900 -> 60.sp
    in 901..1000 -> 96.sp
    else -> throw IllegalArgumentException("Invalid size value :::: $value")
}

inline fun Size.toSp(transformer: (Size) -> TextUnit): TextUnit = transformer(this)

@PublishedApi
internal val DEFAULT_EM_NORMAL_EQUIVALENT: TextUnit = 1.em

inline fun Size.toEm(normalEquivalent: TextUnit = DEFAULT_EM_NORMAL_EQUIVALENT): TextUnit = (normalEquivalent * value) / Medium.value

inline fun Size.toEm(transformer: (Size) -> TextUnit): TextUnit = transformer(this)