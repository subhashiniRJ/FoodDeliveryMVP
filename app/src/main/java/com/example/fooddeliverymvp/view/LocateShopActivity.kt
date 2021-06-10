package com.example.fooddeliverymvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fooddeliverymvp.R
import com.example.fooddeliverymvp.databinding.ActivityLocateShopBinding

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.Marker
import kotlinx.android.synthetic.main.activity_locate_shop.*

class LocateShopActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private var myLocMarker: Marker? = null
    private lateinit var binding: ActivityLocateShopBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLocateShopBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        with(intent){
            var title = getStringExtra("shop_name")!!
            title_text.text = title
            var shopLocation = LatLng( getDoubleExtra("shop_latitude",0.0) ,getDoubleExtra("shop_longitude",0.0))
            myLocMarker = mMap!!.addMarker(
                MarkerOptions()
                    .position(
                        shopLocation
                    )
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.parking_1))
                    .draggable(false)
            )

            val cameraUpdateFactory = CameraUpdateFactory.newLatLngZoom(
               shopLocation, 12.5f
            )
            mMap?.animateCamera(cameraUpdateFactory)
        }

        setUpEve()

      /*  // Add a marker in Sydney and move the camera
        val sydney = LatLng(-34.0, 151.0)
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))*/
    }

    private fun setUpEve() {
        ivBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()

    }
}