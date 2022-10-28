@file:Suppress("FunctionName")

package aesthetics

import aesthetics.internal.UniformImpl

inline fun Padding(size: Size): Uniform = UniformImpl(size)

inline fun PaddingH(value: Size) = BoundH(value)

inline fun PaddingX(left: Size, right: Size) = BoundX(left = left, right = right)

inline fun PaddingV(value: Size) = BoundV(value)

inline fun PaddingY(top: Size, bottom: Size) = BoundY(top = top, bottom = bottom)

inline fun Padding(left: Size, top: Size, right: Size, bottom: Size) = BoundXY(left, top, right, bottom)