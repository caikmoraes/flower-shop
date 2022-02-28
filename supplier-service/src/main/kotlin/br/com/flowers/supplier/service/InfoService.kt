package br.com.flowers.supplier.service

import br.com.flowers.supplier.dto.SupplierDTO
import br.com.flowers.supplier.mapper.SupplierDtoMapper
import br.com.flowers.supplier.model.Supplier
import br.com.flowers.supplier.repository.InfoRepository
import org.springframework.stereotype.Service

@Service
class InfoService(
    private val infoRepository: InfoRepository,
    private val supplierDtoMapper: SupplierDtoMapper,
) {
    fun getInfoByState(state: String): SupplierDTO {
        var supplier = infoRepository.findByState(state) ?: throw Exception("Supplier not found")
        return supplierDtoMapper.map(supplier)
    }
}
