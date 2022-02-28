package br.com.flowers.shop.controller

import br.com.flowers.shop.dto.ShoppingDTO
import br.com.flowers.shop.service.ShoppingService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/shopping")
class ShoppingController(
    private val shoppingService: ShoppingService,
) {

    @PostMapping
    fun doShopping(@RequestBody shoppingForm: ShoppingDTO) {
        shoppingService.doShopping(shoppingForm)
    }
}