package br.com.flowers.supplier.controller

import br.com.flowers.supplier.dto.SupplierDTO
import br.com.flowers.supplier.model.Supplier
import br.com.flowers.supplier.service.InfoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/info")
class InfoController(
    private val infoService: InfoService,
) {

    @GetMapping("/{state}")
    fun getInfoByState(@PathVariable state: String): SupplierDTO = this.infoService.getInfoByState(state)
}