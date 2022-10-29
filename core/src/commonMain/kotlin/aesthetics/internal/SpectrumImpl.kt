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

@PublishedApi
internal val S100 = SpectrumImpl(100)

@PublishedApi
internal val S200 = SpectrumImpl(200)

@PublishedApi
internal val S300 = SpectrumImpl(300)

@PublishedApi
internal val S400 = SpectrumImpl(400)

@PublishedApi
internal val S500 = SpectrumImpl(500)

@PublishedApi
internal val S600 = SpectrumImpl(600)

@PublishedApi
internal val S700 = SpectrumImpl(700)

@PublishedApi
internal val S800 = SpectrumImpl(800)

@PublishedApi
internal val S900 = SpectrumImpl(900)