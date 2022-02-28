package creational.builder

import java.io.File

data class Mail(
    val to: String,
    var title: String = "",
    var message: String = "",
    var cc: List<String> = listOf(),
    var attachments: List<File> = listOf()
) {
    fun title(t: String) : Mail {
        title = t
        return this
    }

    fun message(m: String) : Mail {
        message = m
        return this
    }
}

