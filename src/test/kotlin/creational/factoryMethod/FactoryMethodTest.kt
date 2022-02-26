package creational.factoryMethod

import org.junit.Test
import java.util.stream.Collectors.toList
import kotlin.test.assertContentEquals

internal class FactoryMethodTest {

    @Test
    fun `read from config then creates animals`() {
        val animalTypes = listOf("dog", "dog", "cat", "dog", "cat")
        val expected = listOf(Dog::class.java, Dog::class.java, Cat::class.java, Dog::class.java, Cat::class.java)
        val actual = animalTypes.stream()
            .map { animalFactory(it) }
            .map { it::class.java }
            .collect(toList())
        assertContentEquals(expected, actual)
    }
}