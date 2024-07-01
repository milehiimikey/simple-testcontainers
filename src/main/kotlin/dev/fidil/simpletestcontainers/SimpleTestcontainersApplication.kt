package dev.fidil.simpletestcontainers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleTestcontainersApplication

fun main(args: Array<String>) {
    runApplication<SimpleTestcontainersApplication>(*args)
}
