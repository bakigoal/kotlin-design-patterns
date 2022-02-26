package creational.factoryMethod

import org.junit.Test
import java.util.stream.Collectors.toList
import kotlin.test.assertContentEquals

internal class FactoryMethodTest {

    @Test
    fun `read from config then creates animals`() {
        val animalTypes = listOf(
            "dog" to "buldog",
            "dog" to "doberman",
            "cat" to "siamese",
            "cat" to "persian",
            "dog" to "doberman"
        )
        val expected = listOf(
            Buldog::class.java,
            Doberman::class.java,
            Siamese::class.java,
            Persian::class.java,
            Doberman::class.java
        )
        val actual = animalTypes.stream()
            .map { (type, breed) -> animalFactory(type, breed) }
            .map { it::class.java }
            .collect(toList())
        assertContentEquals(expected, actual)
    }
}