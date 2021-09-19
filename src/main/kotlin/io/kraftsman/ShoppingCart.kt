package io.kraftsman

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
}
