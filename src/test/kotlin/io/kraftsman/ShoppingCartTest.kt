package io.kraftsman

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kraftsman.dtos.Product

class ShoppingCartTest : FunSpec({

    context("购物车") {
        test("当两个 100 元商品相加时，总价为 200") {
            // Arrange
            val product1 = Product(id = 1, name = "Product 1", price = 100, weight = 10.0)
            val product2 = Product(id = 1, name = "Product 1", price = 100, weight = 10.0)
            val shoppingCart = ShoppingCart()

            // Act
            shoppingCart.add(product1)
            shoppingCart.add(product2)

            // Assert
            shoppingCart.totalPrice() shouldBe 200
        }

        test("当加了 2 个商品后，返回商品数量为 2") {
            // Arrange
            val product1 = Product(id = 1, name = "Product 1", price = 100, weight = 10.0)
            val product2 = Product(id = 1, name = "Product 1", price = 100, weight = 10.0)
            val shoppingCart = ShoppingCart()

            // Act
            shoppingCart.add(product1)
            shoppingCart.add(product2)

            // Assert
            shoppingCart.count() shouldBe 2
        }
    }
})
