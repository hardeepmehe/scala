package com.preinterview.evaluation.fruitshop.service

trait ProductService {
  def getPrice(productName: String): Double

  def getActiveDiscount(productName: String): String
}
