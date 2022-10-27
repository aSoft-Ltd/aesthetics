@file:Suppress("FunctionName")

package aesthetics

import aesthetics.internal.UniformImpl

inline fun Padding(
    size: Size = Unspecified
): Uniform = UniformImpl(size)

inline fun PaddingH(
    value: Size = Unspecified
) = BoundH(value)

inline fun PaddingX(
    left: Size = Unspecified,
    right: Size = Unspecified
) = BoundX(left = left, right = right)

inline fun PaddingV(
    value: Size = Unspecified
) = BoundV(value)

inline fun PaddingY(
    top: Size = Unspecified,
    bottom: Size = Unspecified
) = BoundY(top = top, bottom = bottom)

inline fun Padding(
    left: Size = Unspecified,
    top: Size = Unspecified,
    right: Size = Unspecified,
    bottom: Size = Unspecified
) = BoundXY(left, top, right, bottom)