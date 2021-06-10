package com.example.fooddeliverymvp.view


import FoodsModel
import kotlin.collections.ArrayList

class MainPresenter(mainView : MainContractor.MainView, getNoticeInteractorImpl: GetNoticeInteractorImpl) : MainContractor.presenter, MainContractor.GetFoodsIntractor,MainContractor.GetFoodsIntractor.OnFinishedListener {

    private var mainView: MainContractor.MainView? = mainView
    private var getShopIntractor: MainContractor.GetFoodsIntractor? = getNoticeInteractorImpl


    override fun onDestroy() {
        mainView = null
    }

    override fun requestDataFromServer() {

        if(mainView != null){
            mainView!!.showProgress()
        }
        getShopIntractor!!.getFoodsArrayList(this)
    }

    override fun getFoodsArrayList(onFinishedListener: MainContractor.GetFoodsIntractor.OnFinishedListener?) {
        getShopIntractor?.getFoodsArrayList(this)
    }

    override fun onFinished(noticeArrayList: ArrayList<FoodsModel.ShopX?>) {
        if(mainView != null){
            mainView?.setDataToRecyclerView(noticeArrayList)
            mainView?.hideProgress()
        }
    }

    override fun onFailure(t: Throwable?) {
        if(mainView != null){
            mainView?.onResponseFailure(t)
            mainView?.hideProgress()
        }
    }
}