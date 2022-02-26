package creational.factoryMethod

/**
 * This pattern is very useful when creating objects from a configuration.
 */
fun animalFactory(animalType: String): Animal =
    when (animalType.lowercase()) {
        "cat" -> Cat()
        "dog" -> Dog()
        else -> throw IllegalArgumentException("Unknown animal $animalType")
    }

interface Animal {
    val name: String
}

class Cat : Animal{
    override val name = "Cat"
}

class Dog : Animal{
    override val name = "Dog"
}