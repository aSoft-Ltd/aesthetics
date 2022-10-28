@file:Suppress("PackageDirectoryMismatch") // We are implementing sealed interfaces

package aesthetics

import kotlin.jvm.JvmInline

@JvmInline
internal value class SpectrumImpl private constructor(
    override val value: Int
) : Size, FontWeight {
    internal companion object {
        operator fun invoke(value: Int): SpectrumImpl {
            if (value <= 0) {
                val message = "FontWeight/Size value must not be less than or equal to zero"
                throw IllegalArgumentException(message)
            }
            return SpectrumImpl(value)
        }
    }
}

internal val S100 = SpectrumImpl(100)

internal val S200 = SpectrumImpl(200)

internal val S300 = SpectrumImpl(300)

internal val S400 = SpectrumImpl(400)

internal val S500 = SpectrumImpl(500)

internal val S600 = SpectrumImpl(600)

internal val S700 = SpectrumImpl(700)

internal val S800 = SpectrumImpl(800)

internal val S900 = SpectrumImpl(900)