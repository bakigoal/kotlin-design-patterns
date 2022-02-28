package creational.abstractFactory

interface Chair
interface Sofa
interface CoffeeTable

// Art Deco -- family
class ArtDecoChair : Chair
class ArtDecoSofa : Sofa
class ArtDecoCoffeeTable : CoffeeTable

// Modern  -- family
class ModernChair : Chair
class ModernSofa : Sofa
class ModernCoffeeTable : CoffeeTable

// concrete factories
interface FurnitureFactory {
    fun createChair(): Chair
    fun createSofa(): Sofa
    fun createCoffeeTable(): CoffeeTable
}

class ArtDecoFactory : FurnitureFactory {
    override fun createChair() = ArtDecoChair()
    override fun createSofa() = ArtDecoSofa()
    override fun createCoffeeTable() = ArtDecoCoffeeTable()
}

class ModernFactory : FurnitureFactory {
    override fun createChair() = ModernChair()
    override fun createSofa() = ModernSofa()
    override fun createCoffeeTable() = ModernCoffeeTable()
}

// abstract factory
enum class FurnitureType { ART_DECO, MODERN }

fun abstractFactory(type: FurnitureType): FurnitureFactory = when (type) {
    FurnitureType.ART_DECO -> ArtDecoFactory()
    FurnitureType.MODERN -> ModernFactory()
}