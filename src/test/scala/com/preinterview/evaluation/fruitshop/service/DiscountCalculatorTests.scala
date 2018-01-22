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

@RunWith(classOf[JUnitRunner])
class DiscountCalculatorTests extends FeatureSpec with GivenWhenThen with MockitoSugar {

  info("As a Discount Calculator consumer")
  info("I want to be able to get the final discounted quanity based on the type of discount")
  info("So when I invoke the calculate method on each of the caluclators, I should get the right quanity of the products after the applicable discount")

  feature("Check if the discounted quantity is calculated correctly") {
    scenario("NoDiscount") {

      Given("a No Discount calcultor is retrived")
      val calculator = ""

      pending

      When("The quanity 0 is passed ")
      var discountedQuantity = 0

      Then("the returned value shoud be 0")
      assert(discountedQuantity == 0)

      When("The quanity 1 is passed ")
      discountedQuantity = 0

      Then("the returned value shoud be 1")
      assert(discountedQuantity == 1)

      When("The quanity 10 is passed ")
      discountedQuantity = 0

      Then("the returned value shoud be 10")
      assert(discountedQuantity == 10)

    }

    scenario("BuyOneGetOne") {

      Given("a BuyOneGetOne Discount calcultor is retrived")
      val calculator = ""

      pending

      When("The quanity 0 is passed ")
      var discountedQuantity = 0

      Then("the returned value shoud be")
      assert(discountedQuantity == 0)

      When("The quanity 1 is passed ")
      discountedQuantity = 0

      Then("the returned value shoud be 1")
      assert(discountedQuantity == 1)

      When("The quanity 10 is passed ")
      discountedQuantity = 0

      Then("the returned value shoud be 5")
      assert(discountedQuantity == 10)

      When("The quanity 15 is passed ")
      discountedQuantity = 0

      Then("the returned value shoud be 8")
      assert(discountedQuantity == 7)

    }

    scenario("ThreeForTwo") {

      Given("a BuyOneGetOne Discount calcultor is retrived")
      val calculator = ""

      pending

      When("The quanity 0 is passed ")
      var discountedQuantity = 0

      Then("the returned value shoud be")
      assert(discountedQuantity == 0)

      When("The quanity 1 is passed ")
      discountedQuantity = 0

      Then("the returned value shoud be 1")
      assert(discountedQuantity == 1)

      When("The quanity 10 is passed ")
      discountedQuantity = 0

      Then("the returned value shoud be 5")
      assert(discountedQuantity == 10)

      When("The quanity 15 is passed ")
      discountedQuantity = 0

      Then("the returned value shoud be 8")
      assert(discountedQuantity == 7)

    }

  }

}
