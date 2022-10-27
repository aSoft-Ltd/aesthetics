package aesthetics.internal

import aesthetics.Size
import aesthetics.Uniform

@PublishedApi
internal data class UniformImpl(
    override val value: Size
) : Uniform