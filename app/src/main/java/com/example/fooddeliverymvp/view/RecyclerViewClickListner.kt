package com.example.fooddeliverymvp.view

import FoodsModel


interface RecyclerViewClickListner {
    fun onItemClick(shops: FoodsModel.ShopX?)
}