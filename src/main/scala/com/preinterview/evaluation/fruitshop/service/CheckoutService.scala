package com.preinterview.evaluation.fruitshop.service

import scala.collection.mutable.ArrayBuffer
import scala.collection.Map

class CheckoutService(productService: ProductService) {

  def calculateTotal(cart: List[String]): Double = {

    // I know I could have chained everything here,
    //but for simplicity and debugging I have assigned values to intermediate variables
    println(cart)

    val productFrequencies = cart.groupBy(_.toString()).mapValues(_.size)
    println(productFrequencies)
    val discountedFrequencies: Map[String, Int] = productFrequencies.transform {
      case (key, value) =>

        DiscountFactory.getInstance(productService.getActiveDiscount(key.toLowerCase())).calculateDiscountQuantity(value)

    }

    println(discountedFrequencies)
    val productPrices = discountedFrequencies.map {
      case (key, value) => (
        productService.getPrice(key.toLowerCase()) * value)
    }

    val totalPrice: Double = productPrices.sum

    return BigDecimal(totalPrice).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

}
