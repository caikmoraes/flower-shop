package br.com.flowers.shop.dto

data class ExceptionDTO(
    var status: Int,
    var error: String,
    var message: String?,
    var path: String,
)
