@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package aesthetics

import kotlin.js.JsExport

object Unspecified : Color, Bound, Size

interface Uniform : Corner, Bound {
    val value: Size
}