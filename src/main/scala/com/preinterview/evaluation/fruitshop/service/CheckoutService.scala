package com.preinterview.evaluation.fruitshop.service

import scala.collection.mutable.ArrayBuffer

class CheckoutService(productService: ProductService) {

  def calculateTotal(cart: List[String]): Double = {

    // I know I could have chained everything here,
    //but for simplicity and debugging I have assigned values to intermediate variables

    val productFrequencies = cart.groupBy(_.toString()).mapValues(_.size)
    val productPrices = productFrequencies.map { case (key, value) => (productService.getPrice(key.toLowerCase()) * value) }
    val totalPrice: Double = productPrices.sum

    return BigDecimal(totalPrice).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

}
