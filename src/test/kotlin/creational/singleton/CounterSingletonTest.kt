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

    @Test
    fun `test concurrent counter`() {
        val threads = mutableListOf<Thread>()
        for(i in 1..10) {
            threads.add(Thread {
                println("${Thread.currentThread().name} started")
                CounterSingleton.increment()
                println("${Thread.currentThread().name} ended")
            })
        }

        threads.forEach { it.start() }
        threads.forEach { it.join() }

        assertEquals(11, CounterSingleton.increment())
    }
}