package com.example.fooddeliverymvp.view

import FoodsModel
import android.content.Intent
import android.content.res.ColorStateList
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddeliverymvp.R
import com.example.fooddeliverymvp.adapter.FoodListAdapter
import com.facebook.drawee.backends.pipeline.Fresco
import com.google.android.gms.maps.model.LatLng

import java.util.*


class MainActivity : AppCompatActivity(),MainContractor.MainView, RecyclerViewClickListner {

    private var progressBar: ProgressBar? = null
    private var recyclerView: RecyclerView? = null

    private var presenter: MainContractor.presenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fresco.initialize(this)
        setContentView(R.layout.activity_main)

        initializeToolbarAndRecyclerView()
        initProgressBar()
        presenter = MainPresenter(this,GetNoticeInteractorImpl())
        presenter!!.requestDataFromServer()
    }

    private fun initializeToolbarAndRecyclerView() {
      /*  val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)*/
        recyclerView = findViewById(R.id.recylerView)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this@MainActivity,RecyclerView.VERTICAL,false)
        recyclerView!!.layoutManager = layoutManager
    }

    /**
     * Initializing progressbar programmatically
     */
    private fun initProgressBar() {
        progressBar = ProgressBar(this, null, android.R.attr.progressBarStyleLarge)
        progressBar!!.isIndeterminate = true
        val relativeLayout = RelativeLayout(this)
        relativeLayout.gravity = Gravity.CENTER
        relativeLayout.addView(progressBar)
        val params = RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.MATCH_PARENT,
            RelativeLayout.LayoutParams.MATCH_PARENT
        )
        progressBar!!.visibility = View.INVISIBLE
        addContentView(relativeLayout, params)
    }

    override fun showProgress() {
        progressBar!!.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        progressBar!!.visibility = View.GONE
    }

  /*  override fun setDataToRecyclerView(noticeArrayList: ArrayList<FoodsModel?>) {

    }*/

    override fun setDataToRecyclerView(shopArrayList: ArrayList<FoodsModel.ShopX?>) {
       var adapter = FoodListAdapter(this@MainActivity, shopArrayList!!,this)
        recyclerView!!.adapter = adapter
    }

    override fun onResponseFailure(throwable: Throwable?) {
      progressBar!!.visibility = View.GONE
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter!!.onDestroy()
    }

    override fun onItemClick(shops: FoodsModel.ShopX?) {
        var intent = Intent(this@MainActivity,ShopDetailsActivity::class.java)
        intent.putExtra("shop_name",shops!!.name)
        intent.putExtra("shop_profile",shops!!.avatar)
        intent.putExtra("shop_email",shops!!.email)
        intent.putExtra("shop_mob",shops!!.phone)
        intent.putExtra("shop_latitude",shops!!.latitude!!)
        intent.putExtra("shop_longitude",shops!!.longitude!!)
        shopDetailsLauncher.launch(intent)
    }

    var shopDetailsLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){

    }

}