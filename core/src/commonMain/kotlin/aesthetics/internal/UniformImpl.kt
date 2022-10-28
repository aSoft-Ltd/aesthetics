package aesthetics.internal

import aesthetics.Size
import aesthetics.Uniform
import kotlin.jvm.JvmInline

@JvmInline
@PublishedApi
internal value class UniformImpl(
    override val value: Size
) : Uniform