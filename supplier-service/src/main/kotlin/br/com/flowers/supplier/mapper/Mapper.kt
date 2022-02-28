package br.com.flowers.supplier.mapper

interface Mapper<T, U> {
    fun map(t: T) : U
}