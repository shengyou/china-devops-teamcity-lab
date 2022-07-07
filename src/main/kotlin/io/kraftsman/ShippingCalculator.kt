package io.kraftsman

import io.kraftsman.dtos.Product

class ShippingCalculator(private val products: List<Product>) {

    companion object {
        const val PERCENTAGE = 0.8
    }

    fun calculate(): Double {
        val totalWeight = products.map { it.weight }
            .reduce { acc, d -> acc + d }

        return totalWeight * PERCENTAGE
    }
}
