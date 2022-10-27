@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package aesthetics

import kotlin.js.JsExport

interface Corner

interface Corner4 : Corner {
    val topLeft: Size
    val topRight: Size
    val bottomLeft: Size
    val bottomRight: Size
}