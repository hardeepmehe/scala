package com.preinterview.evaluation.fruitshop.service

object DiscountCalculatorService {

  trait DiscountCalculator {
    def calculateDiscountQuantity(quantity: Int): Int
  }

  class Buy1Get1 extends DiscountCalculator {
    override def calculateDiscountQuantity(quantity: Int): Int = {
      return quantity / 2 + quantity % 2;
    }
  }

  class ThreeForTwo extends DiscountCalculator {
    override def calculateDiscountQuantity(quantity: Int): Int = {
      return (quantity / 3) * 2 + quantity % 3;
    }
  }

  class NoDiscount extends DiscountCalculator {
    override def calculateDiscountQuantity(quantity: Int): Int = {
      return quantity;
    }
  }

}
