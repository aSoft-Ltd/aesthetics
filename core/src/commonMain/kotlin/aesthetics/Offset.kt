@file:JsExport

package aesthetics

import kotlin.js.JsExport

data class Offset(val x: Float, val y: Float) {
    companion object {
        val Zero = Offset(0f, 0f)
    }
}
