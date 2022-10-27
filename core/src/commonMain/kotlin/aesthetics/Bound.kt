@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package aesthetics

import kotlin.js.JsExport

sealed interface Bound

data class BoundH(
    val value: Size
) : Bound

data class BoundX(
    val left: Size,
    val right: Size
) : Bound

data class BoundV(
    val value: Size
) : Bound

data class BoundY(
    val top: Size,
    val bottom: Size
) : Bound

data class BoundHV(
    val horizontal: Size,
    val vertical: Size
) : Bound

data class BoundXY(
    val left: Size,
    val top: Size,
    val right: Size,
    val bottom: Size
) : Bound