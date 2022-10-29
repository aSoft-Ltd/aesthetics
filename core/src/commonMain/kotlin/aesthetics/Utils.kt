@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package aesthetics

import kotlin.js.JsExport
import kotlin.js.JsName

object Unspecified : Bound

interface Uniform : Corner, Bound {
    val value: Size
}

@JsName("lerpInt")
inline fun lerp(start: Int, stop: Int, fraction: Float): Int = (start + ((stop - start) * fraction)).toInt()