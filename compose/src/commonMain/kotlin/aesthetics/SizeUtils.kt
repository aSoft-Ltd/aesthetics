package aesthetics

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@PublishedApi
internal val DEFAULT_DP_NORMAL_EQUIVALENT: Dp = 8.dp

inline fun Size.toDp(normalEquivalent: Dp = DEFAULT_DP_NORMAL_EQUIVALENT): Dp = (normalEquivalent * value) / Medium.value

@PublishedApi
internal val pixelMap = mapOf(
    100 to 8.sp,
    200 to 10.sp,
    300 to 12.sp,
    400 to 16.sp,
    500 to 20.sp,
    600 to 24.sp,
    700 to 34.sp,
    800 to 48.sp,
    900 to 96.sp,
)

inline fun Size.sp(): TextUnit = when (value) {
    in 1..100 -> (pixelMap.getValue(100) * value) / 100
    in 101..200 -> (pixelMap.getValue(200) * value) / 200
    in 201..300 -> (pixelMap.getValue(300) * value) / 300
    in 301..400 -> (pixelMap.getValue(400) * value) / 400
    in 401..500 -> (pixelMap.getValue(500) * value) / 500
    in 501..600 -> (pixelMap.getValue(600) * value) / 600
    in 601..700 -> (pixelMap.getValue(700) * value) / 700
    in 701..800 -> (pixelMap.getValue(800) * value) / 800
    in 801..900 -> (pixelMap.getValue(900) * value) / 900
    in 901..1000 -> (pixelMap.getValue(1000) * value) / 1000
    else -> throw IllegalArgumentException("Invalid size value :::: $value")
}

@PublishedApi
internal val DEFAULT_EM_NORMAL_EQUIVALENT: TextUnit = 1.em

inline fun Size.toEm(normalEquivalent: TextUnit = DEFAULT_EM_NORMAL_EQUIVALENT): TextUnit = (normalEquivalent * value) / Medium.value