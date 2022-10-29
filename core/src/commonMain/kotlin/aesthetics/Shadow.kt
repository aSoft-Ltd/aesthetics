@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package aesthetics

import kotlin.js.JsExport

data class Shadow(
    val color: Color? = null,
    val offset: Offset = Offset.Zero,
    val blurRadius: Float = 0f
)