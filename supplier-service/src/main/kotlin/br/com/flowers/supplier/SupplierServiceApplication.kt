package br.com.flowers.supplier

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SupplierServiceApplication

fun main(args: Array<String>) {
    runApplication<SupplierServiceApplication>(*args)
}