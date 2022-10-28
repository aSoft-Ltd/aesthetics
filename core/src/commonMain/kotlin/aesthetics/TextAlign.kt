@file:JsExport

package aesthetics

import kotlin.js.JsExport

sealed interface TextAlign

object Left : TextAlign

object Start : TextAlign

object Center : TextAlign

object Justify : TextAlign

object End : TextAlign

object Right : TextAlign