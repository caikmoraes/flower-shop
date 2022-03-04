package br.com.flowers.shop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
class ShopServiceApplication{
    @LoadBalanced
    @Bean
    fun getRestTemplate(): RestTemplate = RestTemplate()
}

fun main(args: Array<String>) {
    runApplication<ShopServiceApplication>(*args)
}