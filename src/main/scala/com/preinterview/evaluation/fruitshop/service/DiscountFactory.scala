package com.preinterview.evaluation.fruitshop.service

import com.preinterview.evaluation.fruitshop.service.DiscountCalculatorService.DiscountCalculator
import com.preinterview.evaluation.fruitshop.service.DiscountCalculatorService.Buy1Get1
import com.preinterview.evaluation.fruitshop.service.DiscountCalculatorService.NoDiscount
import com.preinterview.evaluation.fruitshop.service.DiscountCalculatorService.ThreeForTwo

object DiscountFactory {

  def getInstance(discountType: String): DiscountCalculator = {
    discountType match {
      case "BuyOneGetOne" => new Buy1Get1
      case "ThreeForTwo"  => new ThreeForTwo
      case _              => new NoDiscount
    }
  }
}
