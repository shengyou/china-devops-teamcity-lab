package io.kraftsman

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kraftsman.dtos.Product

class ShippingCalculatorTest : FunSpec({

    context("运费计算") {

        test("运费是所有商品重量打八折") {
            val products = mutableListOf(
                Product(1, "P1", 10, 5.0),
                Product(2, "P2", 20, 6.0),
                Product(3, "P3", 30, 7.0)
            )

            val calculator = ShippingCalculator(products)

            calculator.calculate() shouldBe (5.0 + 6.0 + 7.0) * 0.8
        }
    }
})
