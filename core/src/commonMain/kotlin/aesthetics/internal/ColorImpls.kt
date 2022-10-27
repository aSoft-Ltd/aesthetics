package aesthetics.internal

import aesthetics.RGBA

internal data class RGBAImpl(
    override val red: Int,
    override val green: Int,
    override val blue: Int,
    override val alphaRatio: Double
) : RGBA