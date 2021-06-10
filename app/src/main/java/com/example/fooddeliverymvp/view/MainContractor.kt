package com.example.fooddeliverymvp.view


import FoodsModel
import kotlin.collections.ArrayList

interface MainContractor {

    interface presenter {
        fun onDestroy()
        fun requestDataFromServer()
    }

     interface MainView {
        fun showProgress()
        fun hideProgress()
        fun setDataToRecyclerView(noticeArrayList: ArrayList<FoodsModel.ShopX?>)
        fun onResponseFailure(throwable: Throwable?)
    }

    interface GetFoodsIntractor {
        interface OnFinishedListener {
            fun onFinished(shopArrayList: ArrayList<FoodsModel.ShopX?>)
            fun onFailure(t: Throwable?)
        }

        fun getFoodsArrayList(onFinishedListener: OnFinishedListener?)
    }
}