import aesthetics.Color
import aesthetics.RGB
import aesthetics.RGBA
import expect.expect
import kotlin.test.Test

class RedGreenBlueWithOrWithoutAlphaColorBuildersTest {

    @Test
    fun should_create_a_color_from_a_valid_hex_int_literal_without_alpha() {
        expect(Color(0xf00)).toBe(RGB(0, 15, 0))
        expect(Color(0x000f00)).toBe(RGB(0, 15, 0))
    }

    @Test
    fun should_create_a_color_from_a_valid_hex_string_literal_without_alpha() {
        expect(Color("#f00")).toBe(RGB(0, 15, 0))
        expect(Color("000f00")).toBe(RGB(0, 15, 0))
        expect(Color("#000f00")).toBe(RGB(0, 15, 0))
    }

    @Test
    fun should_create_a_color_from_a_valid_hex_int_literal_with_alpha() {
        expect(Color(0xff0000ff)).toBe(RGBA(255, 0, 0, 1f))
    }

    @Test
    fun should_create_a_color_from_a_valid_hex_string_literal_with_alpha() {
        expect(Color("ff0000ff")).toBe(RGBA(255, 0, 0, 1f))
        expect(Color("#ff0000ff")).toBe(RGBA(255, 0, 0, 1f))
    }
}