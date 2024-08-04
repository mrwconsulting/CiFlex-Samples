package mrwconsulting.springboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class MyApplication

fun main(args: Array<String>) {
    runApplication<MyApplication>(*args)

    @GetMapping("/")
    fun index(): String = "Welcome to Shinto pipeline samples"
}
