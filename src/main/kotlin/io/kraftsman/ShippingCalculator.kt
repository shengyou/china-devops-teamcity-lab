package io.kraftsman

import io.kraftsman.dtos.Product

class ShippingCalculator(private val products: List<Product>) {

    fun calculate(): Double {
        val totalWeight = products.map { it.weight }
            .reduce { acc, d -> acc + d }

        return totalWeight * 0.8
    }
}
