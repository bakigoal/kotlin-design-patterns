package creational.factoryMethod

class FactoryMethod {

    var counter = 0

    fun animalFactory(animalType: String, breed: String): Animal =
        when (animalType.lowercase()) {
            "cat" -> catFactory(breed, ++counter)
            "dog" -> dogFactory(breed, ++counter)
            else -> throw IllegalArgumentException("Unknown animal $animalType")
        }
}

fun catFactory(breed: String, id: Int): Cat =
    when (breed.lowercase()) {
        "siamese" -> Siamese(id)
        "persian" -> Persian(id)
        else -> throw IllegalArgumentException("Unknown breed $breed")
    }

fun dogFactory(breed: String, id: Int): Dog =
    when (breed.lowercase()) {
        "buldog" -> Buldog(id)
        "doberman" -> Doberman(id)
        else -> throw IllegalArgumentException("Unknown breed $breed")
    }

interface Animal {
    val id: Int
    val name: String
}

abstract class Cat(override val id: Int) : Animal
abstract class Dog(override val id: Int) : Animal

class Siamese(id: Int) : Cat(id) {
    override val name = "Siamese"
}

class Persian(id: Int) : Cat(id) {
    override val name = "Persian"
}

class Buldog(id: Int) : Dog(id) {
    override val name = "Buldog"
}

class Doberman(id: Int) : Dog(id) {
    override val name = "Doberman"
}