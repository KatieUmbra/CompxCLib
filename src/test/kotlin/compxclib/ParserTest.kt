package compxclib

import kotlin.math.E
import kotlin.math.PI
import kotlin.test.*

class ParserTest {
    @Test
    fun parserTest() {
        //Constants.setDefaultRound(10)
        val expected = ComplexNumber(22.459157718361045, 0)
        val input = "$PI ^ $E"
        val parser = Parser(input)
        val result = parser.parse().round(Constants.getDefaultRound())
        println("[INFO]: Expecting result $expected")
        println("[INFO]: Result of $input = $result")
        assertEquals(expected, result)
    }
}