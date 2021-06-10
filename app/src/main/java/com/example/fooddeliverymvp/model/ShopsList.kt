package com.example.fooddeliverymvp.model

import FoodsModel
import com.google.gson.annotations.SerializedName


class ShopsList {

    @SerializedName("notice_list")
    lateinit var shopList: ArrayList<FoodsModel?>

    fun getShopArrayList(): ArrayList<FoodsModel?> {
        return shopList
    }

    fun setNoticeArrayList(shopsArrayList: ArrayList<FoodsModel?>) {
        shopList = shopsArrayList
    }
}