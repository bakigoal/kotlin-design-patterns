package creational.builder

import org.junit.Test
import kotlin.test.assertEquals

internal class EmailBuilderTest {

    @Test
    fun `email build with named arguments`() {
        val mail = Mail(title = "Hello", message = "There", to = "my@dear.cat")
        assertEquals("Hello", mail.title)
        assertEquals("There", mail.message)
        assertEquals("my@dear.cat", mail.to)
    }

    @Test
    fun `email build with apply`() {
        val mail = Mail("my@dear.cat").apply {
            message = "There"
            title = "Hello"
        }
        assertEquals("Hello", mail.title)
        assertEquals("There", mail.message)
        assertEquals("my@dear.cat", mail.to)
    }

    @Test
    fun `email build with pipe`() {
        val mail = Mail("my@dear.cat")
            .title("Hello")
            .message("There")
        assertEquals("Hello", mail.title)
        assertEquals("There", mail.message)
        assertEquals("my@dear.cat", mail.to)
    }

}