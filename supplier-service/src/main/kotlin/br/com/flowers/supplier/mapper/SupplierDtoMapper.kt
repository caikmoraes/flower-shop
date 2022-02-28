package br.com.flowers.supplier.mapper

import br.com.flowers.supplier.dto.SupplierDTO
import br.com.flowers.supplier.model.Supplier
import org.springframework.stereotype.Component

@Component
class SupplierDtoMapper: Mapper<Supplier, SupplierDTO> {
    override fun map(t: Supplier): SupplierDTO = SupplierDTO(
        id = t.id,
        name = t.name,
        address = "${t.street}, ${t.number}, ${t.state}"
    )

}
