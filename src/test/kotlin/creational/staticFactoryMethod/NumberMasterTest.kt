package creational.staticFactoryMethod

import org.junit.Test
import kotlin.test.assertEquals

internal class NumberMasterTest {

    @Test
    fun `parse long`() {
        val actual = NumberMaster.valueOf("1234.5")

        assertEquals(1234.5, actual)
    }
}