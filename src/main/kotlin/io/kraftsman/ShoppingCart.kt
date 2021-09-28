package io.kraftsman

import io.kraftsman.dtos.Product
import kotlin.random.Random

class ShoppingCart {
    private val products = mutableListOf<Product>()

    fun add(product: Product) {
        products.add(product)
    }

    fun totalPrice(): Int {
        return products.sumOf { it.price }
    }

    fun count(): Int {
        return products.count()
    }

    fun dummyInt(): Int {
        return Random.nextInt()
    }

    fun dummyBoolean(): Boolean {
        return Random.nextBoolean()
    }
}
