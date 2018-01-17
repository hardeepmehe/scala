package com.preinterview.evaluation.FruitShop2.CubeCalculator

import org.scalatest.FunSuite

import org.scalatest.BeforeAndAfter
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FeatureSpec
import org.scalatest.GivenWhenThen

@RunWith(classOf[JUnitRunner])
class CheckoutServiceTests extends FeatureSpec with GivenWhenThen {

  info("As a checkout service consumer")
  info("I want to be able to get the final total of the cart")
  info("So when I pass in the list of apples and oranges, the prices are calculated according to the configured costs")

  feature("List of products is passed to the Checkout service") {
    scenario("Empty List") {

      Given("an Empty list is passed to the checkout service")
      val cart = List[String]()

      When("the calculate method is executed")
      val total = 0;

      Then("the total returned should be 0")
      assert(total == 0)
      pending
    }

    scenario("Only Apples") {

      Given("a list of only apples is passed")
      val cart = List("Apple", "Apple", "Apple")

      When("the calculate method is executed")
      val total = 0;

      pending
      Then("the total returned should be 1.80")
      assert(total == 1.80)

    }

    scenario("Only Oranges") {

      Given("a list of only oranges is passed")
      val cart = List("Orange", "Orange")

      When("the calculate method is executed")
      val total = 0;

      pending
      Then("the total returned should be 0.50")
      assert(total == 0.50)

    }

    scenario("Mixed Cart") {

      Given("a mixed list of apples and oranges is passed")
      val cart = List("Apple", "Apple", "Orange", "Orange", "Apple")

      When("the calculate method is executed")
      val total = 0;

      pending
      Then("the total returned should be 2.30")
      assert(total == 2.30)

    }
  }

}
