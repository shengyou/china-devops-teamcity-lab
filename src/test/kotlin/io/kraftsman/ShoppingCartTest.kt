package io.kraftsman

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ShoppingCartTest : FunSpec({

    context("一個購物車") {
        test("當兩個 100 元商品相加時，總價為 200") {
            // Arrange
            val product1 = Product(id = 1, name = "Product 1", price = 100)
            val product2 = Product(id = 1, name = "Product 1", price = 100)
            val shoppingCart = ShoppingCart()

            // Act
            shoppingCart.add(product1)
            shoppingCart.add(product2)

            // Assert
            shoppingCart.totalPrice() shouldBe 200
        }
    }

})
