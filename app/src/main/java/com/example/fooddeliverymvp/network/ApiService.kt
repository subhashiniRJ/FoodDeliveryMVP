package com.example.fooddeliverymvp.network

import FoodsModel
import com.example.fooddeliverymvp.model.ShopsList
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @get:GET("shops/data")
    val getShopData: Call<FoodsModel>
}