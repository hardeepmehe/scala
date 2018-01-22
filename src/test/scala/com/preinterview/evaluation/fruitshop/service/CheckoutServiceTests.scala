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
class CheckoutServiceTests extends FeatureSpec with GivenWhenThen with BeforeAndAfter with MockitoSugar {

  info("As a checkout service consumer")
  info("I want to be able to get the final total of the cart")
  info("So when I pass in the list of apples and oranges, the prices are calculated according to the configured costs and with the simple multibuy discounts as applicable")

  var checkoutService: CheckoutService = _

  before {
    val productServiceMock = mock[ProductService]
    Mockito.when(productServiceMock.getPrice("apple")).thenReturn(0.60)
    Mockito.when(productServiceMock.getPrice("orange")).thenReturn(0.25)
    Mockito.when(productServiceMock.getActiveDiscount("apple")).thenReturn("BuyOneGetOne")
    Mockito.when(productServiceMock.getActiveDiscount("orange")).thenReturn("ThreeForTwo")

    checkoutService = new CheckoutService(productServiceMock)
  }

  feature("List of products is passed to the Checkout service") {
    scenario("Empty List") {

      Given("an Empty list is passed to the checkout service")
      val cart = List[String]()

      When("the calculate method is executed")
      val total = checkoutService.calculateTotal(cart);

      Then("the total returned should be 0")
      assert(total == 0)

    }

    scenario("Only Apples") {

      Given("a list of only apples is passed")
      val cart = List("Apple", "Apple", "Apple")

      When("the calculate method is executed")
      val total = checkoutService.calculateTotal(cart);

      Then("the total returned should be 1.20 after discount")
      assert(total == 1.20)

    }

    scenario("Only Oranges") {

      Given("a list of only oranges is passed")
      val cart = List("Orange", "Orange", "Orange", "Orange")

      When("the calculate method is executed")
      val total = checkoutService.calculateTotal(cart);

      Then("the total returned should be 0.75 after discount")
      assert(total == 0.75)

    }

    scenario("Mixed Cart") {

      Given("a mixed list of apples and oranges is passed")
      val cart = List("Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange")

      When("the calculate method is executed")
      val total = checkoutService.calculateTotal(cart);

      Then("the total returned should be 1.95 after discount")
      assert(total == 1.95)

    }
  }

}
