package creational.abstractFactory

import org.junit.Test
import kotlin.test.assertEquals

internal class AbstractFactoryTest {

    @Test
    fun `art deco factory produces art deco furniture`(){
        val furnitureFactory: FurnitureFactory = abstractFactory(FurnitureType.ART_DECO)
        assertEquals(ArtDecoChair::class, furnitureFactory.createChair()::class)
        assertEquals(ArtDecoSofa::class, furnitureFactory.createSofa()::class)
        assertEquals(ArtDecoCoffeeTable::class, furnitureFactory.createCoffeeTable()::class)
    }

    @Test
    fun `modern factory produces modern furniture`(){
        val furnitureFactory: FurnitureFactory = abstractFactory(FurnitureType.MODERN)
        assertEquals(ModernChair::class, furnitureFactory.createChair()::class)
        assertEquals(ModernSofa::class, furnitureFactory.createSofa()::class)
        assertEquals(ModernCoffeeTable::class, furnitureFactory.createCoffeeTable()::class)
    }
}