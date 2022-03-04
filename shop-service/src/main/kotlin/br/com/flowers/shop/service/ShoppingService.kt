package br.com.flowers.shop.service

import br.com.flowers.shop.dto.ShoppingDTO
import br.com.flowers.shop.dto.SupplierInfoDTO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class ShoppingService(
    @Autowired
    private val client: RestTemplate,
) {
    fun doShopping(shoppingDTO: ShoppingDTO) {
        val res: ResponseEntity<SupplierInfoDTO> = client.exchange(
            "http://supplier/api/v1/info/${shoppingDTO.address.state}",
            HttpMethod.GET, null, SupplierInfoDTO::class.java
        )
        println(res.body)
    }
}
