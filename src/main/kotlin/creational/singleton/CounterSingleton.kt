package creational.singleton

import java.util.concurrent.atomic.AtomicInteger

object CounterSingleton {

    init {
        println("Init singleton ...")
    }

    private val counter = AtomicInteger(0)

    fun increment() = counter.incrementAndGet()
}