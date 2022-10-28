package aesthetics

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

inline fun Bound.toPaddingValues(normalDpEquivalent: Dp = DEFAULT_DP_NORMAL_EQUIVALENT): PaddingValues = when (this) {
    is BoundXY -> toPaddingValues(normalDpEquivalent)
    is BoundHV -> toPaddingValues(normalDpEquivalent)
    is BoundH -> toPaddingValues(normalDpEquivalent)
    is BoundX -> toPaddingValues(normalDpEquivalent)
    is BoundY -> toPaddingValues(normalDpEquivalent)
    is BoundV -> toPaddingValues(normalDpEquivalent)
    is Uniform -> toPaddingValues(normalDpEquivalent)
    Unspecified -> PaddingValues(0.dp)
}

inline fun BoundXY.toPaddingValues(normalDpEquivalent: Dp = DEFAULT_DP_NORMAL_EQUIVALENT) = PaddingValues(
    start = left.toDp(normalDpEquivalent),
    top = top.toDp(normalDpEquivalent),
    end = right.toDp(normalDpEquivalent),
    bottom = bottom.toDp(normalDpEquivalent)
)

inline fun BoundHV.toPaddingValues(normalDpEquivalent: Dp = DEFAULT_DP_NORMAL_EQUIVALENT) = PaddingValues(
    horizontal = horizontal.toDp(normalDpEquivalent),
    vertical = vertical.toDp(normalDpEquivalent)
)

inline fun BoundH.toPaddingValues(normalDpEquivalent: Dp = DEFAULT_DP_NORMAL_EQUIVALENT) = PaddingValues(
    horizontal = value.toDp(normalDpEquivalent)
)

inline fun BoundX.toPaddingValues(normalDpEquivalent: Dp = DEFAULT_DP_NORMAL_EQUIVALENT) = PaddingValues(
    start = left.toDp(normalDpEquivalent),
    end = right.toDp(normalDpEquivalent)
)

inline fun BoundY.toPaddingValues(normalDpEquivalent: Dp = DEFAULT_DP_NORMAL_EQUIVALENT) = PaddingValues(
    top = top.toDp(normalDpEquivalent),
    bottom = bottom.toDp(normalDpEquivalent)
)

inline fun BoundV.toPaddingValues(normalDpEquivalent: Dp = DEFAULT_DP_NORMAL_EQUIVALENT) = PaddingValues(
    vertical = value.toDp(normalDpEquivalent)
)

inline fun Uniform.toPaddingValues(normalDpEquivalent: Dp = DEFAULT_DP_NORMAL_EQUIVALENT) = PaddingValues(
    all = value.toDp(normalDpEquivalent)
)

inline fun Unspecified.toPaddingValues(): PaddingValues = PaddingValues(0.dp)