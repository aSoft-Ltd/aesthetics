@file:JsExport

package aesthetics

import kotlin.js.JsExport

sealed interface Size

object ExtremelySmall : Size
object VerySmall : Size
object Small : Size
object Medium : Size
object Large : Size
object VeryLarge : Size
object ExtremelyLarge : Size