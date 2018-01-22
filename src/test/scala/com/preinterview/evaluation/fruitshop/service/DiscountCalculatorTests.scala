package com.preinterview.evaluation.FruitShop2.CubeCalculator

import org.scalatest.FunSuite

import org.scalatest.BeforeAndAfter
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FeatureSpec
import org.scalatest.GivenWhenThen
import com.preinterview.evaluation.fruitshop.service.CheckoutService
import org.scalatest.mock.MockitoSugar
import com.preinterview.evaluation.fruitshop.service.ProductService
import org.mockito.Mockito
import com.preinterview.evaluation.fruitshop.service.DiscountCalculatorService.NoDiscount
import com.preinterview.evaluation.fruitshop.service.DiscountCalculatorService.Buy1Get1
import com.preinterview.evaluation.fruitshop.service.DiscountCalculatorService.ThreeForTwo

@RunWith(classOf[JUnitRunner])
class DiscountCalculatorTests extends FeatureSpec with GivenWhenThen with MockitoSugar {

  info("As a Discount Calculator consumer")
  info("I want to be able to get the final discounted quanity based on the type of discount")
  info("So when I invoke the calculate method on each of the caluclators, I should get the right quanity of the products after the applicable discount")

  feature("Check if the discounted quantity is calculated correctly") {
    scenario("NoDiscount") {

      Given("a No Discount calcultor is retrived")
      val calculator = new NoDiscount

      When("The quanity 0 is passed ")
      var discountedQuantity = calculator.calculateDiscountQuantity(0)

      Then("the returned value shoud be 0")
      assert(discountedQuantity == 0)

      When("The quanity 1 is passed ")
      discountedQuantity = calculator.calculateDiscountQuantity(1)

      Then("the returned value shoud be 1")
      assert(discountedQuantity == 1)

      When("The quanity 10 is passed ")
      discountedQuantity = calculator.calculateDiscountQuantity(10)

      Then("the returned value shoud be 10")
      assert(discountedQuantity == 10)

    }

    scenario("BuyOneGetOne") {

      Given("a BuyOneGetOne Discount calcultor is retrived")
      val calculator = new Buy1Get1

      When("The quanity 0 is passed ")
      var discountedQuantity = calculator.calculateDiscountQuantity(0)

      Then("the returned value shoud be")
      assert(discountedQuantity == 0)

      When("The quanity 1 is passed ")
      discountedQuantity = calculator.calculateDiscountQuantity(1)

      Then("the returned value shoud be 1")
      assert(discountedQuantity == 1)

      When("The quanity 10 is passed ")
      discountedQuantity = calculator.calculateDiscountQuantity(10)

      Then("the returned value shoud be 5")
      assert(discountedQuantity == 5)

      When("The quanity 15 is passed ")
      discountedQuantity = calculator.calculateDiscountQuantity(15)

      Then("the returned value shoud be 8")
      assert(discountedQuantity == 8)

    }

    scenario("ThreeForTwo") {

      Given("a BuyOneGetOne Discount calcultor is retrived")
      val calculator = new ThreeForTwo

      When("The quanity 0 is passed ")
      var discountedQuantity = calculator.calculateDiscountQuantity(0)

      Then("the returned value shoud be")
      assert(discountedQuantity == 0)

      When("The quanity 1 is passed ")
      discountedQuantity = calculator.calculateDiscountQuantity(1)

      Then("the returned value shoud be 1")
      assert(discountedQuantity == 1)

      When("The quanity 10 is passed ")
      discountedQuantity = calculator.calculateDiscountQuantity(10)

      Then("the returned value shoud be 7")
      assert(discountedQuantity == 7)

      When("The quanity 15 is passed ")
      discountedQuantity = calculator.calculateDiscountQuantity(15)

      Then("the returned value shoud be 10")
      assert(discountedQuantity == 10)

    }

  }

}
