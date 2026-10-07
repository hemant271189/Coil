package com.genai.coil.domain.model

data class Product(
  val id :Int = 0,
  val title :String,
  val price : Double,
  val description :String,
  val category :String,
  val image :String,
)