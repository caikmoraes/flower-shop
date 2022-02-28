package br.com.flowers.supplier.repository

import br.com.flowers.supplier.model.Supplier
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Component

@Component
interface InfoRepository: JpaRepository<Supplier, Long> {

    fun findByState(state: String): Supplier?

}
