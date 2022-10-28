@file:JsExport

package aesthetics

import kotlin.js.JsExport

sealed interface TextDecoration

object Node : TextDecoration

object Underline : TextDecoration

object StrikeThrough : TextDecoration