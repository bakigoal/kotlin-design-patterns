package creational.factoryMethod

/**
 * This pattern is very useful when creating objects from a configuration.
 */
fun animalFactory(animalType: String, breed: String): Animal =
    when (animalType.lowercase()) {
        "cat" -> Cat()
        "dog" -> dogFactory(breed)
        else -> throw IllegalArgumentException("Unknown animal $animalType")
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

class Cat : Animal {
    override val name = "Cat"
}

open class Dog : Animal {
    override val name = "Dog"
}

class Buldog(): Dog() {
    override val name = "Buldog"
}

class Doberman(): Dog() {
    override val name = "Doberman"
}