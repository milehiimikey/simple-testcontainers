package dev.fidil.simpletestcontainers

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<SimpleTestcontainersApplication>().with(TestcontainersConfiguration::class).run(*args)
}
