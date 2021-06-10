package com.example.fooddeliverymvp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.result.contract.ActivityResultContracts
import com.example.fooddeliverymvp.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        init()
    }

    private fun init() {

        Handler(Looper.getMainLooper()).postDelayed({

            var intent = Intent(this@SplashActivity, MainActivity::class.java)
            activityLauncher.launch(intent)
        }, 3000)
    }

    private var activityLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        if(it.resultCode == RESULT_CANCELED){
            finish()
        }
    }
}