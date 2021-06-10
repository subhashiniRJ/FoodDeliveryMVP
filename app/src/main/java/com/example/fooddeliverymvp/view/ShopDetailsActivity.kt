package com.example.fooddeliverymvp.view

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.fooddeliverymvp.R
import kotlinx.android.synthetic.main.activity_shop_details.*
import kotlinx.android.synthetic.main.item_layout.*


class ShopDetailsActivity : AppCompatActivity() {
    private var lat: Double = 0.0
    private var lng: Double = 0.0
    var shop_name = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_details)

        init()
        setUpEvents()
    }

    private fun setUpEvents() {
        ivMap.setOnClickListener {
            var intent = Intent(this@ShopDetailsActivity,LocateShopActivity::class.java)
            intent.putExtra("shop_latitude",lat)
            intent.putExtra("shop_longitude",lng)
            intent.putExtra("shop_name",shop_name)
            mapActivityLauncher.launch(intent)
        }

        ivBack.setOnClickListener {
            onBackPressed()
        }
    }

    fun init(){
        with(intent){
            var ivImageUrl = getStringExtra("shop_profile")
            var email = getStringExtra("shop_email")
            var phone = getStringExtra("shop_mob")
             shop_name = getStringExtra("shop_name")!!
            lat = getDoubleExtra("shop_latitude",0.0)
             lng = getDoubleExtra("shop_longitude",0.0)


            ivShop.setImageURI(Uri.parse(ivImageUrl))
            tvEmail.text = email
            tvMob.text = phone
            tvShop.text = shop_name
            toolbar_title.text = shop_name
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.map_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item!!.itemId == R.id.map_menu)
        {
            var intent = Intent(this@ShopDetailsActivity,LocateShopActivity::class.java)
            intent.putExtra("shop_latitude",lat)
            intent.putExtra("shop_longitude",lng)
            intent.putExtra("shop_name",shop_name)
            mapActivityLauncher.launch(intent)
        }
        return super.onOptionsItemSelected(item)
    }


    var mapActivityLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        finish()
    }
}