package br.com.flowers.supplier.dto

data class ExceptionDTO(
    var status: Int,
    var error: String,
    var message: String?,
    var path: String,
)
