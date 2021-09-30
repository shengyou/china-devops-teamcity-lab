package io.kraftsman

import io.kraftsman.dtos.Product

/**
 * ShoppingCart class
 *
 * A simple shopping cart class that could add product, count the number of products, sum for total price
 *
 * @property products A mutable list that contain all products
 * @constructor Create an empty cart
 */
class ShoppingCart {
    private val products = mutableListOf<Product>()

    /**
     * Add a [product] in shopping cart
     *
     * @param product
     * @return unit
     */
    fun add(product: Product) {
        products.add(product)
    }

    /**
     * Calculate products' price
     *
     * @return The sum of [products] prices
     */
    fun totalPrice(): Int {
        return products.sumOf { it.price }
    }

    /**
     * Calculate the quantity of products
     *
     * @return The quantity of [products]
     */
    fun count(): Int {
        return products.count()
    }
}
