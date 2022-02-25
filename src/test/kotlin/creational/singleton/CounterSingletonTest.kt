package creational.singleton

import org.junit.Test
import kotlin.test.assertEquals

internal class CounterSingletonTest{

    @Test
    fun `test counter`() {
        for(i in 1..10) {
            val increment = CounterSingleton.increment()
            assertEquals(i, increment)
        }
    }
}