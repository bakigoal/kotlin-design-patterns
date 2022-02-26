package creational.factoryMethod

/**
 * This pattern is very useful when creating objects from a configuration.
 */
fun animalFactory(animalType: String, breed: String): Animal =
    when (animalType.lowercase()) {
        "cat" -> catFactory(breed)
        "dog" -> dogFactory(breed)
        else -> throw IllegalArgumentException("Unknown animal $animalType")
    }

fun catFactory(breed: String): Cat =
    when(breed.lowercase()) {
        "siamese" -> Siamese()
        "persian" -> Persian()
        else -> throw IllegalArgumentException("Unknown breed $breed")
    }

fun dogFactory(breed: String): Dog =
    when (breed.lowercase()) {
        "buldog" -> Buldog()
        "doberman" -> Doberman()
        else -> throw IllegalArgumentException("Unknown breed $breed")
    }

interface Animal {
    val name: String
}

interface Cat : Animal
interface Dog : Animal

class Siamese : Cat {
    override val name = "Siamese"
}

class Persian : Cat {
    override val name = "Persian"
}

class Buldog : Dog {
    override val name = "Buldog"
}

class Doberman : Dog {
    override val name = "Doberman"
}