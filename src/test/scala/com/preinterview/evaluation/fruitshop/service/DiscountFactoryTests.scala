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
class DiscountFactoryTests extends FeatureSpec with GivenWhenThen with MockitoSugar {

  info("As a Discount Calculator consumer")
  info("I want to be able to get the final discounted quanity based on the type of discount")
  info("So when I pass in the discountType to the calculator, I should get the right type of calcultor to work with")

  feature("Check if the right discount calculator is retrived from the factory") {
    scenario("unimplmented") {

      Given("a unkown type is passed thru")
      val discountType = "FiveForFour"

      pending

      When("the discount factory is invoked to get the instance of the calculator")
      val calculator = ""

      Then("the returned Class should be of type NoDiscount Calculator")
      assert(calculator.getClass == List.getClass)

    }

    scenario("BuyOneGetOne") {

      Given("a buy one get one discount calculator is needed")
      val discountType = "BuyOneGetOne"

      pending

      When("the discount factory is invoked to get the instance of the calculator")
      val calculator = ""

      Then("the returned Class should be of type buyOneGetOne Calculator")
      assert(calculator.getClass == List.getClass)

    }

    scenario("ThreeForTwo") {

      Given("a Three for two discount calculator is needed")
      val discountType = "ThreeForTwo"

      pending

      When("the discount factory is invoked to get the instance of the calculator")
      val calculator = ""

      Then("the returned Class should be of type ThreeForTwo Calculator")
      assert(calculator.getClass == List.getClass)

    }

  }

}
