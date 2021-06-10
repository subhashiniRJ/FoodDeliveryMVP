package com.example.fooddeliverymvp.view

import FoodsModel
import android.util.Log
import com.example.fooddeliverymvp.network.ApiClient
import com.example.fooddeliverymvp.network.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GetNoticeInteractorImpl : MainContractor.GetFoodsIntractor {

    override fun getFoodsArrayList(onFinishedListener: MainContractor.GetFoodsIntractor.OnFinishedListener?) {
        val service: ApiService = ApiClient.client!!.create(ApiService::class.java)
        val call: Call<FoodsModel> = service.getShopData

        Log.e("URL Called",""+call.request().url())

        call.enqueue(object : Callback<FoodsModel> {
            override fun onResponse(
                call: Call<FoodsModel>,
                response: Response<FoodsModel>
            ) {
                if (response?.isSuccessful!!) {
                    var shopList = ArrayList<FoodsModel.ShopX?>()
                    var results = response?.body()
                    for(element in results!!.shops!!){
                        shopList.add(element)
                    }
                    Log.e("respose", "success-------$shopList")
                    onFinishedListener!!.onFinished(shopList)
                }
            }

            override fun onFailure(call: Call<FoodsModel>, t: Throwable) {
                Log.e("respose","fail-------"+t.message)
                onFinishedListener!!.onFailure(t)
            }


        })
         /*   override fun onResponse(call: Call<ArrayList<FoodsModel>>, response: Response<ArrayList<FoodsModel>>) {
                Log.e("respose", "success--------${response.body().toString()}")
                response.body()?.getShopArrayList()?.let { onFinishedListener!!.onFinished(it) }
            }

            override fun onFailure(call: Call<ShopsList?>, t: Throwable) {
                Log.e("respose","fail-------"+t.message)
                onFinishedListener!!.onFailure(t)
            }
        })*/

    }

    // This class get food list from api through getFoodsArrayList and pass it through OnFinishedListener
}