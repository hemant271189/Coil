package com.genai.coil.data.remoteapi

import com.genai.coil.domain.model.Product
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ProductApiService {

    @GET("products")
    suspend fun getProducts() : List<Product>

    @GET("products/{id}")
    suspend fun getProduct(@Path("id")id : Int): Product

    @POST("products")
    suspend fun createProduct(@Body product: Product) : Product

    @PUT("products/{id}")
    suspend fun updateProduct(@Path("id") id : Int, @Body product: Product) : Product

    @PATCH("products/{id}")
    suspend fun patchProduct(@Path("id")id : Int, @Body updates: Map<String, @JvmSuppressWildcards Any>) : Product

    @DELETE("products/{id}")
    suspend fun deletedProduct(@Path("id") id : Int) : Product
}